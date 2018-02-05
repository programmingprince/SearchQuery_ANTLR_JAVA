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
@init {
	$expression = new BinaryArithmeticExpression();
}
	:   ID '=' expr = additiveExpression {$expression = $expr.additiveExpression;} -> ^(EQUALS ID additiveExpression)
    ;

additiveExpression returns [BinaryArithmeticExpression additiveExpression]
@init {
	$additiveExpression = new BinaryArithmeticExpression();
	List<Expression<Double>> expressions = new ArrayList<Expression<Double>>();
}

@after {
	$additiveExpression.setExpressions(expressions);
}
	:   (expr1 = multiplicativeExpression {
				expressions.add($expr1.multiplicativeExpression);
			}
		) (('+' {$additiveExpression.setOperator('+');}|'-'{$additiveExpression.setOperator('-');})^ (expr2 = multiplicativeExpression {
				expressions.add($expr2.multiplicativeExpression);
			}))*
    ;

multiplicativeExpression returns [BinaryArithmeticExpression multiplicativeExpression]
@init {
	$multiplicativeExpression = new BinaryArithmeticExpression();
	List<Expression<Double>> expressions = new ArrayList<Expression<Double>>();
}

@after {
	$multiplicativeExpression.setExpressions(expressions);
}
    :   (expr1 = atom {
    				expressions.add($expr1.expression);
    			}
    		) (('*'{$multiplicativeExpression.setOperator('*');}|'/'{$multiplicativeExpression.setOperator('/');}|'%'{$multiplicativeExpression.setOperator('\%');}|'^'{$multiplicativeExpression.setOperator('^');})^ (expr2 = atom {
    				expressions.add($expr2.expression);
    		}))*
    ;
    
atom returns [Expression<Double> expression]
  : number1 = unsignedUnaryExpression {$expression = $number1.unsignedUnaryExpression;}
  | number2 = signedUnaryExpression {$expression = $number2.signedUnaryExpression;}
  | '(' expr = additiveExpression {$expression = $expr.additiveExpression;} ')'
  ;
  
unsignedUnaryExpression returns [UnsignedUnaryExpression unsignedUnaryExpression]
@init {
	$unsignedUnaryExpression = new UnsignedUnaryExpression();
}
  : number1 = number {
 		$unsignedUnaryExpression.setValue($number1.value);
}

  | ID {

      if(getRow().containsKey($ID.text)) {
        $unsignedUnaryExpression.setValue((double)((Integer)getRow().get($ID.text)).intValue());
      } else {
        addErrorMessage($ID.line,$ID.getCharPositionInLine(),"unable to resolve value for '"+ $ID.text+"'");
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
  :  digit1 = DIGIT {$value = (double)Integer.parseInt($digit1.text);} 
  ;

ID
  :  ('a'..'z' | 'A'..'Z' | '_' | '.' | '?' | '"') ('a'..'z' | 'A'..'Z' | '_' | '.' | '?' | '"' |DIGIT)*
  ;

DIGIT  
  :  '0'..'9'+
  ;

WS  :   (' '|'\t')+ { skip(); }
    ;