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
    IFTOKEN;
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
	:   'if' number {System.out.println($number.text);} -> ^(IFTOKEN IF number)
    ;

number
    : DIGIT
    ;

DIGIT
    : '0'..'9'+
    ;

    IF : '+';
    LPARAM : '(';

WS  :   (' '|'\t')+ { skip(); }
    ;