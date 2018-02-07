grammar Expression;

options {
    output=AST;
    ASTLabelType=CommonTree;
}


tokens {
    // define pseudo-operations
    FUNC;
    CALL;
    SIGNEDUNARY;
    CALLSIGNEDUNARY;
    EQUALS;
}
@lexer::header {
  package com.logpoint.libquery.grammar;
    import java.util.LinkedList;

}
@parser::header {
  package com.logpoint.libquery.grammar;
  import java.util.LinkedList;
  import com.logpoint.libquery.expressions.arithmetic.*;
  import com.logpoint.libquery.expressions.conditional.*;
  import com.logpoint.libquery.expressions.*;
  import com.logpoint.libquery.exceptions.*;
  import java.util.HashMap;
  import java.util.Map;
}

@parser::members {
        Map<String, Object> row = new HashMap<String, Object>();

        public void setRow(Map<String, Object> rowParam) {
            row = rowParam;
        }

        public Map<String, Object> getRow() {
            return row;
        }

        private List<String> errors = new LinkedList<String>();
        public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            errors.add(hdr + " " + msg);
        }
        public List<String> getErrors() {
            return errors;
        }
        public void addErrorMessage(int line,int column,String message){
            errors.add("line "+line+":"+column+" "+message);
        }

}

@lexer::members {
        private List<String> errors = new LinkedList<String>();
        public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            errors.add(hdr + " " + msg);
        }
        public List<String> getErrors() {
            return errors;
        }
}

expression returns [Expression expression] throws ParseException
  :   ID '=' expr = expressions {$expression = $expr.expression;} -> ^(EQUALS ID expressions)
    ;

expressions returns [Expression expression]
    : expr1 = logicalExpression {$expression = $expr1.logicalExpression;}
    | expr2 = ifStatementExpression {$expression = $expr2.ifStatementExpression;}
    | expr3 = caseStatementExpression {$expression = $expr3.caseStatementExpression;}
    ;

ifStatementExpression returns [IfStatementExpression ifStatementExpression]
@init {
  $ifStatementExpression = new IfStatementExpression();
}
    : IF LPARAM condition = expressions {$ifStatementExpression.setCondition($condition.expression);}
      COMMA trueValue = expressions {$ifStatementExpression.setTrueValue($trueValue.expression);}
      COMMA falseValue = expressions {$ifStatementExpression.setFalseValue($falseValue.expression);} RPARAM
    ;

caseStatementExpression returns [CaseStatementExpression caseStatementExpression]
@init {
  $caseStatementExpression = new CaseStatementExpression();
  List<Expression> expressions = new ArrayList<Expression>();
  List<Expression> values  = new ArrayList<Expression>();
}
@after {
  $caseStatementExpression.setExpressions(expressions);
  $caseStatementExpression.setValues(values);
}
    : CASE LPARAM condition1 = expressions {expressions.add($condition1.expression);} COMMA value1 = expressions {values.add($value1.expression);}
      (COMMA condition2 = expressions {expressions.add($condition2.expression);} COMMA value2 = expressions {values.add($value2.expression);})*
      COMMA DEFAULT COMMA defaultValue = expressions {$caseStatementExpression.setDefaultValue($defaultValue.expression);} RPARAM
    ;


logicalExpression returns [LogicalExpression logicalExpression]
@init {
  $logicalExpression = new LogicalExpression();
  List<Expression> expressions = new ArrayList<Expression>();
}

@after {
  $logicalExpression.setExpressions(expressions);
}
  :   (expr1 = relationalExpression {
        expressions.add($expr1.relationalExpression);
    })
    ((
     '&&'{$logicalExpression.setOperator("&&");}
    |'||'{$logicalExpression.setOperator("||");}

    )^
     (expr2 = relationalExpression {
        expressions.add($expr2.relationalExpression);
    })
    )*
    ;

relationalExpression returns [RelationalExpression relationalExpression]
@init {
  $relationalExpression = new RelationalExpression();
  List<Expression> expressions = new ArrayList<Expression>();
}

@after {
  $relationalExpression.setExpressions(expressions);
}
  :   (expr1 = arithmeticExpression {
        expressions.add($expr1.arithmeticExpression);
    })
    ((
    |'=='{$relationalExpression.setOperator("==");}
    |'!='{$relationalExpression.setOperator("!=");}
    |'>'{$relationalExpression.setOperator(">");}
    |'<'{$relationalExpression.setOperator("<");}
    |'<='{$relationalExpression.setOperator("<=");}
    |'>='{$relationalExpression.setOperator(">=");}
    )^
     (expr2 = arithmeticExpression {
        expressions.add($expr2.arithmeticExpression);
    })
    )*
    ;

arithmeticExpression returns [ArithmeticExpression arithmeticExpression]
@init {
  $arithmeticExpression = new ArithmeticExpression();
  List<Expression> expressions = new ArrayList<Expression>();
}

@after {
  $arithmeticExpression.setExpressions(expressions);
}
  :   (expr1 = atom {
        expressions.add($expr1.expression);
    })
    ((
    '+' {$arithmeticExpression.setOperator("+");}
    |'-'{$arithmeticExpression.setOperator("-");}
    |'/'{$arithmeticExpression.setOperator("/");}
    |'*'{$arithmeticExpression.setOperator("*");}
    |'%'{$arithmeticExpression.setOperator("\%");}
    |'^'{$arithmeticExpression.setOperator("^");}

    )^
     (expr2 = atom {
        expressions.add($expr2.expression);
    })
    )*
    ;

atom returns [Expression expression]
  : atomicExpr = atomicExpression {$expression = $atomicExpr.atomicExpression;}
  | number1 = signedUnaryExpression {$expression = $number1.signedUnaryExpression;}
  | '(' expr = expressions {$expression = $expr.expression;} ')'
  ;

atomicExpression returns [AtomicExpression atomicExpression]
@init {
  $atomicExpression = new AtomicExpression();
}
  : number1 = number {
    $atomicExpression.setValue($number1.value);
}
  | ID {
      if(getRow().containsKey($ID.text)) {
        Object value = getRow().get($ID.text);
        if(value instanceof Integer) {
          $atomicExpression.setValue((double)((Integer) value).intValue());
        } else {
          $atomicExpression.setValue(value);
        }
      } else {
        if($ID.text.toString().equals("true")) {
            $atomicExpression.setValue(true);
        } else if($ID.text.toString().equals("false")) {
            $atomicExpression.setValue(false);
        } else {
            $atomicExpression.setValue($ID.text);
        }
      }
}
  ;

signedUnaryExpression returns [SignedUnaryExpression signedUnaryExpression]
@init {
  $signedUnaryExpression = new SignedUnaryExpression();
}
  : '-' number1 = number {
      $signedUnaryExpression.setValue($number1.value);
      $signedUnaryExpression.setSign("-");
 } -> ^(SIGNEDUNARY '-' number)

  | '+' number2 = number {
      $signedUnaryExpression.setValue($number2.value);
      $signedUnaryExpression.setSign("+");
 } -> ^(SIGNEDUNARY '+' number)
  ;


number returns [double value]
  :  digit1 = NUMERIC {$value = Double.parseDouble($digit1.text.toString());}
  ;


IF  : 'IF';
CASE  : 'CASE';
DEFAULT : 'DEFAULT';
LPARAM  : '(';
RPARAM  : ')';
COMMA   : ',';

ID
  :  ('a'..'z' | 'A'..'Z' | '_' | '.' | '?' | '"') ('a'..'z' | 'A'..'Z' | '_' | '.' | '?' | '"' |DIGIT)*
  ;

NUMERIC
  :  DIGIT+ '.' DIGIT+ EXPONENT?
  |  '.'? DIGIT+ EXPONENT?
  ;

fragment
EXPONENT
  :  ('e' | 'E') ('+' | '-')? DIGIT+
  ;

fragment
DIGIT
  :  '0'..'9'
  ;

WS  :   (' '|'\t')+ { skip(); }
    ;