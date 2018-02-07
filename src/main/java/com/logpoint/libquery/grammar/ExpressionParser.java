// $ANTLR 3.5.2 Expression.g 2018-02-08 01:25:10

  package com.logpoint.libquery.grammar;
  import java.util.LinkedList;
  import com.logpoint.libquery.expressions.arithmetic.*;
  import com.logpoint.libquery.expressions.conditional.*;
  import com.logpoint.libquery.expressions.*;
  import com.logpoint.libquery.exceptions.*;
  import java.util.HashMap;
  import java.util.Map;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ExpressionParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CALL", "CALLSIGNEDUNARY", "CASE", 
		"COMMA", "DEFAULT", "DIGIT", "EQUALS", "EXPONENT", "FUNC", "ID", "IF", 
		"LPARAM", "NUMERIC", "RPARAM", "SIGNEDUNARY", "WS", "'!='", "'%'", "'&&'", 
		"'*'", "'+'", "'-'", "'/'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", 
		"'^'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int CALL=4;
	public static final int CALLSIGNEDUNARY=5;
	public static final int CASE=6;
	public static final int COMMA=7;
	public static final int DEFAULT=8;
	public static final int DIGIT=9;
	public static final int EQUALS=10;
	public static final int EXPONENT=11;
	public static final int FUNC=12;
	public static final int ID=13;
	public static final int IF=14;
	public static final int LPARAM=15;
	public static final int NUMERIC=16;
	public static final int RPARAM=17;
	public static final int SIGNEDUNARY=18;
	public static final int WS=19;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ExpressionParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExpressionParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ExpressionParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Expression.g"; }


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



	public static class expression_return extends ParserRuleReturnScope {
		public Expression expression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// Expression.g:73:1: expression returns [Expression expression] : ID '=' expr= expressions -> ^( EQUALS ID expressions ) ;
	public final ExpressionParser.expression_return expression() throws ParseException, RecognitionException {
		ExpressionParser.expression_return retval = new ExpressionParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID1=null;
		Token char_literal2=null;
		ParserRuleReturnScope expr =null;

		CommonTree ID1_tree=null;
		CommonTree char_literal2_tree=null;
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expressions=new RewriteRuleSubtreeStream(adaptor,"rule expressions");

		try {
			// Expression.g:74:3: ( ID '=' expr= expressions -> ^( EQUALS ID expressions ) )
			// Expression.g:74:7: ID '=' expr= expressions
			{
			ID1=(Token)match(input,ID,FOLLOW_ID_in_expression125);  
			stream_ID.add(ID1);

			char_literal2=(Token)match(input,29,FOLLOW_29_in_expression127);  
			stream_29.add(char_literal2);

			pushFollow(FOLLOW_expressions_in_expression133);
			expr=expressions();
			state._fsp--;

			stream_expressions.add(expr.getTree());
			retval.expression = (expr!=null?((ExpressionParser.expressions_return)expr).expression:null);
			// AST REWRITE
			// elements: expressions, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 74:67: -> ^( EQUALS ID expressions )
			{
				// Expression.g:74:70: ^( EQUALS ID expressions )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EQUALS, "EQUALS"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_expressions.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class expressions_return extends ParserRuleReturnScope {
		public Expression expression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expressions"
	// Expression.g:77:1: expressions returns [Expression expression] : (expr1= logicalExpression |expr2= ifStatementExpression |expr3= caseStatementExpression );
	public final ExpressionParser.expressions_return expressions() throws RecognitionException {
		ExpressionParser.expressions_return retval = new ExpressionParser.expressions_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expr1 =null;
		ParserRuleReturnScope expr2 =null;
		ParserRuleReturnScope expr3 =null;


		try {
			// Expression.g:78:5: (expr1= logicalExpression |expr2= ifStatementExpression |expr3= caseStatementExpression )
			int alt1=3;
			switch ( input.LA(1) ) {
			case ID:
			case LPARAM:
			case NUMERIC:
			case 24:
			case 25:
				{
				alt1=1;
				}
				break;
			case IF:
				{
				alt1=2;
				}
				break;
			case CASE:
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// Expression.g:78:7: expr1= logicalExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_logicalExpression_in_expressions170);
					expr1=logicalExpression();
					state._fsp--;

					adaptor.addChild(root_0, expr1.getTree());

					retval.expression = (expr1!=null?((ExpressionParser.logicalExpression_return)expr1).logicalExpression:null);
					}
					break;
				case 2 :
					// Expression.g:79:7: expr2= ifStatementExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifStatementExpression_in_expressions184);
					expr2=ifStatementExpression();
					state._fsp--;

					adaptor.addChild(root_0, expr2.getTree());

					retval.expression = (expr2!=null?((ExpressionParser.ifStatementExpression_return)expr2).ifStatementExpression:null);
					}
					break;
				case 3 :
					// Expression.g:80:7: expr3= caseStatementExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_caseStatementExpression_in_expressions198);
					expr3=caseStatementExpression();
					state._fsp--;

					adaptor.addChild(root_0, expr3.getTree());

					retval.expression = (expr3!=null?((ExpressionParser.caseStatementExpression_return)expr3).caseStatementExpression:null);
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressions"


	public static class ifStatementExpression_return extends ParserRuleReturnScope {
		public IfStatementExpression ifStatementExpression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifStatementExpression"
	// Expression.g:83:1: ifStatementExpression returns [IfStatementExpression ifStatementExpression] : IF LPARAM condition= expressions COMMA trueValue= expressions COMMA falseValue= expressions RPARAM ;
	public final ExpressionParser.ifStatementExpression_return ifStatementExpression() throws RecognitionException {
		ExpressionParser.ifStatementExpression_return retval = new ExpressionParser.ifStatementExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IF3=null;
		Token LPARAM4=null;
		Token COMMA5=null;
		Token COMMA6=null;
		Token RPARAM7=null;
		ParserRuleReturnScope condition =null;
		ParserRuleReturnScope trueValue =null;
		ParserRuleReturnScope falseValue =null;

		CommonTree IF3_tree=null;
		CommonTree LPARAM4_tree=null;
		CommonTree COMMA5_tree=null;
		CommonTree COMMA6_tree=null;
		CommonTree RPARAM7_tree=null;


		  retval.ifStatementExpression = new IfStatementExpression();

		try {
			// Expression.g:87:5: ( IF LPARAM condition= expressions COMMA trueValue= expressions COMMA falseValue= expressions RPARAM )
			// Expression.g:87:7: IF LPARAM condition= expressions COMMA trueValue= expressions COMMA falseValue= expressions RPARAM
			{
			root_0 = (CommonTree)adaptor.nil();


			IF3=(Token)match(input,IF,FOLLOW_IF_in_ifStatementExpression226); 
			IF3_tree = (CommonTree)adaptor.create(IF3);
			adaptor.addChild(root_0, IF3_tree);

			LPARAM4=(Token)match(input,LPARAM,FOLLOW_LPARAM_in_ifStatementExpression228); 
			LPARAM4_tree = (CommonTree)adaptor.create(LPARAM4);
			adaptor.addChild(root_0, LPARAM4_tree);

			pushFollow(FOLLOW_expressions_in_ifStatementExpression234);
			condition=expressions();
			state._fsp--;

			adaptor.addChild(root_0, condition.getTree());

			retval.ifStatementExpression.setCondition((condition!=null?((ExpressionParser.expressions_return)condition).expression:null));
			COMMA5=(Token)match(input,COMMA,FOLLOW_COMMA_in_ifStatementExpression244); 
			COMMA5_tree = (CommonTree)adaptor.create(COMMA5);
			adaptor.addChild(root_0, COMMA5_tree);

			pushFollow(FOLLOW_expressions_in_ifStatementExpression250);
			trueValue=expressions();
			state._fsp--;

			adaptor.addChild(root_0, trueValue.getTree());

			retval.ifStatementExpression.setTrueValue((trueValue!=null?((ExpressionParser.expressions_return)trueValue).expression:null));
			COMMA6=(Token)match(input,COMMA,FOLLOW_COMMA_in_ifStatementExpression260); 
			COMMA6_tree = (CommonTree)adaptor.create(COMMA6);
			adaptor.addChild(root_0, COMMA6_tree);

			pushFollow(FOLLOW_expressions_in_ifStatementExpression266);
			falseValue=expressions();
			state._fsp--;

			adaptor.addChild(root_0, falseValue.getTree());

			retval.ifStatementExpression.setFalseValue((falseValue!=null?((ExpressionParser.expressions_return)falseValue).expression:null));
			RPARAM7=(Token)match(input,RPARAM,FOLLOW_RPARAM_in_ifStatementExpression270); 
			RPARAM7_tree = (CommonTree)adaptor.create(RPARAM7);
			adaptor.addChild(root_0, RPARAM7_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStatementExpression"


	public static class caseStatementExpression_return extends ParserRuleReturnScope {
		public CaseStatementExpression caseStatementExpression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "caseStatementExpression"
	// Expression.g:92:1: caseStatementExpression returns [CaseStatementExpression caseStatementExpression] : CASE LPARAM condition1= expressions COMMA value1= expressions ( COMMA condition2= expressions COMMA value2= expressions )* COMMA DEFAULT COMMA defaultValue= expressions RPARAM ;
	public final ExpressionParser.caseStatementExpression_return caseStatementExpression() throws RecognitionException {
		ExpressionParser.caseStatementExpression_return retval = new ExpressionParser.caseStatementExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CASE8=null;
		Token LPARAM9=null;
		Token COMMA10=null;
		Token COMMA11=null;
		Token COMMA12=null;
		Token COMMA13=null;
		Token DEFAULT14=null;
		Token COMMA15=null;
		Token RPARAM16=null;
		ParserRuleReturnScope condition1 =null;
		ParserRuleReturnScope value1 =null;
		ParserRuleReturnScope condition2 =null;
		ParserRuleReturnScope value2 =null;
		ParserRuleReturnScope defaultValue =null;

		CommonTree CASE8_tree=null;
		CommonTree LPARAM9_tree=null;
		CommonTree COMMA10_tree=null;
		CommonTree COMMA11_tree=null;
		CommonTree COMMA12_tree=null;
		CommonTree COMMA13_tree=null;
		CommonTree DEFAULT14_tree=null;
		CommonTree COMMA15_tree=null;
		CommonTree RPARAM16_tree=null;


		  retval.caseStatementExpression = new CaseStatementExpression();
		  List<Expression> expressions = new ArrayList<Expression>();
		  List<Expression> values  = new ArrayList<Expression>();

		try {
			// Expression.g:102:5: ( CASE LPARAM condition1= expressions COMMA value1= expressions ( COMMA condition2= expressions COMMA value2= expressions )* COMMA DEFAULT COMMA defaultValue= expressions RPARAM )
			// Expression.g:102:7: CASE LPARAM condition1= expressions COMMA value1= expressions ( COMMA condition2= expressions COMMA value2= expressions )* COMMA DEFAULT COMMA defaultValue= expressions RPARAM
			{
			root_0 = (CommonTree)adaptor.nil();


			CASE8=(Token)match(input,CASE,FOLLOW_CASE_in_caseStatementExpression301); 
			CASE8_tree = (CommonTree)adaptor.create(CASE8);
			adaptor.addChild(root_0, CASE8_tree);

			LPARAM9=(Token)match(input,LPARAM,FOLLOW_LPARAM_in_caseStatementExpression303); 
			LPARAM9_tree = (CommonTree)adaptor.create(LPARAM9);
			adaptor.addChild(root_0, LPARAM9_tree);

			pushFollow(FOLLOW_expressions_in_caseStatementExpression309);
			condition1=expressions();
			state._fsp--;

			adaptor.addChild(root_0, condition1.getTree());

			expressions.add((condition1!=null?((ExpressionParser.expressions_return)condition1).expression:null));
			COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_caseStatementExpression313); 
			COMMA10_tree = (CommonTree)adaptor.create(COMMA10);
			adaptor.addChild(root_0, COMMA10_tree);

			pushFollow(FOLLOW_expressions_in_caseStatementExpression319);
			value1=expressions();
			state._fsp--;

			adaptor.addChild(root_0, value1.getTree());

			values.add((value1!=null?((ExpressionParser.expressions_return)value1).expression:null));
			// Expression.g:103:7: ( COMMA condition2= expressions COMMA value2= expressions )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==COMMA) ) {
					int LA2_1 = input.LA(2);
					if ( (LA2_1==CASE||(LA2_1 >= ID && LA2_1 <= NUMERIC)||(LA2_1 >= 24 && LA2_1 <= 25)) ) {
						alt2=1;
					}

				}

				switch (alt2) {
				case 1 :
					// Expression.g:103:8: COMMA condition2= expressions COMMA value2= expressions
					{
					COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_caseStatementExpression330); 
					COMMA11_tree = (CommonTree)adaptor.create(COMMA11);
					adaptor.addChild(root_0, COMMA11_tree);

					pushFollow(FOLLOW_expressions_in_caseStatementExpression336);
					condition2=expressions();
					state._fsp--;

					adaptor.addChild(root_0, condition2.getTree());

					expressions.add((condition2!=null?((ExpressionParser.expressions_return)condition2).expression:null));
					COMMA12=(Token)match(input,COMMA,FOLLOW_COMMA_in_caseStatementExpression340); 
					COMMA12_tree = (CommonTree)adaptor.create(COMMA12);
					adaptor.addChild(root_0, COMMA12_tree);

					pushFollow(FOLLOW_expressions_in_caseStatementExpression346);
					value2=expressions();
					state._fsp--;

					adaptor.addChild(root_0, value2.getTree());

					values.add((value2!=null?((ExpressionParser.expressions_return)value2).expression:null));
					}
					break;

				default :
					break loop2;
				}
			}

			COMMA13=(Token)match(input,COMMA,FOLLOW_COMMA_in_caseStatementExpression358); 
			COMMA13_tree = (CommonTree)adaptor.create(COMMA13);
			adaptor.addChild(root_0, COMMA13_tree);

			DEFAULT14=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStatementExpression360); 
			DEFAULT14_tree = (CommonTree)adaptor.create(DEFAULT14);
			adaptor.addChild(root_0, DEFAULT14_tree);

			COMMA15=(Token)match(input,COMMA,FOLLOW_COMMA_in_caseStatementExpression362); 
			COMMA15_tree = (CommonTree)adaptor.create(COMMA15);
			adaptor.addChild(root_0, COMMA15_tree);

			pushFollow(FOLLOW_expressions_in_caseStatementExpression368);
			defaultValue=expressions();
			state._fsp--;

			adaptor.addChild(root_0, defaultValue.getTree());

			retval.caseStatementExpression.setDefaultValue((defaultValue!=null?((ExpressionParser.expressions_return)defaultValue).expression:null));
			RPARAM16=(Token)match(input,RPARAM,FOLLOW_RPARAM_in_caseStatementExpression372); 
			RPARAM16_tree = (CommonTree)adaptor.create(RPARAM16);
			adaptor.addChild(root_0, RPARAM16_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


			  retval.caseStatementExpression.setExpressions(expressions);
			  retval.caseStatementExpression.setValues(values);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseStatementExpression"


	public static class logicalExpression_return extends ParserRuleReturnScope {
		public LogicalExpression logicalExpression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logicalExpression"
	// Expression.g:108:1: logicalExpression returns [LogicalExpression logicalExpression] : (expr1= relationalExpression ) ( ( '&&' | '||' ) ^ (expr2= relationalExpression ) )* ;
	public final ExpressionParser.logicalExpression_return logicalExpression() throws RecognitionException {
		ExpressionParser.logicalExpression_return retval = new ExpressionParser.logicalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal17=null;
		Token string_literal18=null;
		ParserRuleReturnScope expr1 =null;
		ParserRuleReturnScope expr2 =null;

		CommonTree string_literal17_tree=null;
		CommonTree string_literal18_tree=null;


		  retval.logicalExpression = new LogicalExpression();
		  List<Expression> expressions = new ArrayList<Expression>();

		try {
			// Expression.g:117:3: ( (expr1= relationalExpression ) ( ( '&&' | '||' ) ^ (expr2= relationalExpression ) )* )
			// Expression.g:117:7: (expr1= relationalExpression ) ( ( '&&' | '||' ) ^ (expr2= relationalExpression ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// Expression.g:117:7: (expr1= relationalExpression )
			// Expression.g:117:8: expr1= relationalExpression
			{
			pushFollow(FOLLOW_relationalExpression_in_logicalExpression410);
			expr1=relationalExpression();
			state._fsp--;

			adaptor.addChild(root_0, expr1.getTree());


			        expressions.add((expr1!=null?((ExpressionParser.relationalExpression_return)expr1).relationalExpression:null));
			    
			}

			// Expression.g:120:5: ( ( '&&' | '||' ) ^ (expr2= relationalExpression ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==22||LA4_0==34) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Expression.g:120:6: ( '&&' | '||' ) ^ (expr2= relationalExpression )
					{
					// Expression.g:120:6: ( '&&' | '||' )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==22) ) {
						alt3=1;
					}
					else if ( (LA3_0==34) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// Expression.g:121:6: '&&'
							{
							string_literal17=(Token)match(input,22,FOLLOW_22_in_logicalExpression427); 
							string_literal17_tree = (CommonTree)adaptor.create(string_literal17);
							adaptor.addChild(root_0, string_literal17_tree);

							retval.logicalExpression.setOperator("&&");
							}
							break;
						case 2 :
							// Expression.g:122:6: '||'
							{
							string_literal18=(Token)match(input,34,FOLLOW_34_in_logicalExpression435); 
							string_literal18_tree = (CommonTree)adaptor.create(string_literal18);
							adaptor.addChild(root_0, string_literal18_tree);

							retval.logicalExpression.setOperator("||");
							}
							break;

					}

					// Expression.g:125:6: (expr2= relationalExpression )
					// Expression.g:125:7: expr2= relationalExpression
					{
					pushFollow(FOLLOW_relationalExpression_in_logicalExpression456);
					expr2=relationalExpression();
					state._fsp--;

					adaptor.addChild(root_0, expr2.getTree());


					        expressions.add((expr2!=null?((ExpressionParser.relationalExpression_return)expr2).relationalExpression:null));
					    
					}

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


			  retval.logicalExpression.setExpressions(expressions);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalExpression"


	public static class relationalExpression_return extends ParserRuleReturnScope {
		public RelationalExpression relationalExpression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relationalExpression"
	// Expression.g:131:1: relationalExpression returns [RelationalExpression relationalExpression] : (expr1= arithmeticExpression ) ( (| '==' | '!=' | '>' | '<' | '<=' | '>=' ) ^ (expr2= arithmeticExpression ) )* ;
	public final ExpressionParser.relationalExpression_return relationalExpression() throws RecognitionException {
		ExpressionParser.relationalExpression_return retval = new ExpressionParser.relationalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal19=null;
		Token string_literal20=null;
		Token char_literal21=null;
		Token char_literal22=null;
		Token string_literal23=null;
		Token string_literal24=null;
		ParserRuleReturnScope expr1 =null;
		ParserRuleReturnScope expr2 =null;

		CommonTree string_literal19_tree=null;
		CommonTree string_literal20_tree=null;
		CommonTree char_literal21_tree=null;
		CommonTree char_literal22_tree=null;
		CommonTree string_literal23_tree=null;
		CommonTree string_literal24_tree=null;


		  retval.relationalExpression = new RelationalExpression();
		  List<Expression> expressions = new ArrayList<Expression>();

		try {
			// Expression.g:140:3: ( (expr1= arithmeticExpression ) ( (| '==' | '!=' | '>' | '<' | '<=' | '>=' ) ^ (expr2= arithmeticExpression ) )* )
			// Expression.g:140:7: (expr1= arithmeticExpression ) ( (| '==' | '!=' | '>' | '<' | '<=' | '>=' ) ^ (expr2= arithmeticExpression ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// Expression.g:140:7: (expr1= arithmeticExpression )
			// Expression.g:140:8: expr1= arithmeticExpression
			{
			pushFollow(FOLLOW_arithmeticExpression_in_relationalExpression503);
			expr1=arithmeticExpression();
			state._fsp--;

			adaptor.addChild(root_0, expr1.getTree());


			        expressions.add((expr1!=null?((ExpressionParser.arithmeticExpression_return)expr1).arithmeticExpression:null));
			    
			}

			// Expression.g:143:5: ( (| '==' | '!=' | '>' | '<' | '<=' | '>=' ) ^ (expr2= arithmeticExpression ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ID||(LA6_0 >= LPARAM && LA6_0 <= NUMERIC)||LA6_0==20||(LA6_0 >= 24 && LA6_0 <= 25)||(LA6_0 >= 27 && LA6_0 <= 28)||(LA6_0 >= 30 && LA6_0 <= 32)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Expression.g:143:6: (| '==' | '!=' | '>' | '<' | '<=' | '>=' ) ^ (expr2= arithmeticExpression )
					{
					// Expression.g:143:6: (| '==' | '!=' | '>' | '<' | '<=' | '>=' )
					int alt5=7;
					switch ( input.LA(1) ) {
					case ID:
					case LPARAM:
					case NUMERIC:
					case 24:
					case 25:
						{
						alt5=1;
						}
						break;
					case 30:
						{
						alt5=2;
						}
						break;
					case 20:
						{
						alt5=3;
						}
						break;
					case 31:
						{
						alt5=4;
						}
						break;
					case 27:
						{
						alt5=5;
						}
						break;
					case 28:
						{
						alt5=6;
						}
						break;
					case 32:
						{
						alt5=7;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}
					switch (alt5) {
						case 1 :
							// Expression.g:144:5: 
							{
							}
							break;
						case 2 :
							// Expression.g:144:6: '=='
							{
							string_literal19=(Token)match(input,30,FOLLOW_30_in_relationalExpression520); 
							string_literal19_tree = (CommonTree)adaptor.create(string_literal19);
							adaptor.addChild(root_0, string_literal19_tree);

							retval.relationalExpression.setOperator("==");
							}
							break;
						case 3 :
							// Expression.g:145:6: '!='
							{
							string_literal20=(Token)match(input,20,FOLLOW_20_in_relationalExpression528); 
							string_literal20_tree = (CommonTree)adaptor.create(string_literal20);
							adaptor.addChild(root_0, string_literal20_tree);

							retval.relationalExpression.setOperator("!=");
							}
							break;
						case 4 :
							// Expression.g:146:6: '>'
							{
							char_literal21=(Token)match(input,31,FOLLOW_31_in_relationalExpression536); 
							char_literal21_tree = (CommonTree)adaptor.create(char_literal21);
							adaptor.addChild(root_0, char_literal21_tree);

							retval.relationalExpression.setOperator(">");
							}
							break;
						case 5 :
							// Expression.g:147:6: '<'
							{
							char_literal22=(Token)match(input,27,FOLLOW_27_in_relationalExpression544); 
							char_literal22_tree = (CommonTree)adaptor.create(char_literal22);
							adaptor.addChild(root_0, char_literal22_tree);

							retval.relationalExpression.setOperator("<");
							}
							break;
						case 6 :
							// Expression.g:148:6: '<='
							{
							string_literal23=(Token)match(input,28,FOLLOW_28_in_relationalExpression552); 
							string_literal23_tree = (CommonTree)adaptor.create(string_literal23);
							adaptor.addChild(root_0, string_literal23_tree);

							retval.relationalExpression.setOperator("<=");
							}
							break;
						case 7 :
							// Expression.g:149:6: '>='
							{
							string_literal24=(Token)match(input,32,FOLLOW_32_in_relationalExpression560); 
							string_literal24_tree = (CommonTree)adaptor.create(string_literal24);
							adaptor.addChild(root_0, string_literal24_tree);

							retval.relationalExpression.setOperator(">=");
							}
							break;

					}

					// Expression.g:151:6: (expr2= arithmeticExpression )
					// Expression.g:151:7: expr2= arithmeticExpression
					{
					pushFollow(FOLLOW_arithmeticExpression_in_relationalExpression580);
					expr2=arithmeticExpression();
					state._fsp--;

					adaptor.addChild(root_0, expr2.getTree());


					        expressions.add((expr2!=null?((ExpressionParser.arithmeticExpression_return)expr2).arithmeticExpression:null));
					    
					}

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


			  retval.relationalExpression.setExpressions(expressions);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relationalExpression"


	public static class arithmeticExpression_return extends ParserRuleReturnScope {
		public ArithmeticExpression arithmeticExpression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arithmeticExpression"
	// Expression.g:157:1: arithmeticExpression returns [ArithmeticExpression arithmeticExpression] : (expr1= atom ) ( ( '+' | '-' | '/' | '*' | '%' | '^' ) ^ (expr2= atom ) )* ;
	public final ExpressionParser.arithmeticExpression_return arithmeticExpression() throws RecognitionException {
		ExpressionParser.arithmeticExpression_return retval = new ExpressionParser.arithmeticExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal25=null;
		Token char_literal26=null;
		Token char_literal27=null;
		Token char_literal28=null;
		Token char_literal29=null;
		Token char_literal30=null;
		ParserRuleReturnScope expr1 =null;
		ParserRuleReturnScope expr2 =null;

		CommonTree char_literal25_tree=null;
		CommonTree char_literal26_tree=null;
		CommonTree char_literal27_tree=null;
		CommonTree char_literal28_tree=null;
		CommonTree char_literal29_tree=null;
		CommonTree char_literal30_tree=null;


		  retval.arithmeticExpression = new ArithmeticExpression();
		  List<Expression> expressions = new ArrayList<Expression>();

		try {
			// Expression.g:166:3: ( (expr1= atom ) ( ( '+' | '-' | '/' | '*' | '%' | '^' ) ^ (expr2= atom ) )* )
			// Expression.g:166:7: (expr1= atom ) ( ( '+' | '-' | '/' | '*' | '%' | '^' ) ^ (expr2= atom ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// Expression.g:166:7: (expr1= atom )
			// Expression.g:166:8: expr1= atom
			{
			pushFollow(FOLLOW_atom_in_arithmeticExpression627);
			expr1=atom();
			state._fsp--;

			adaptor.addChild(root_0, expr1.getTree());


			        expressions.add((expr1!=null?((ExpressionParser.atom_return)expr1).expression:null));
			    
			}

			// Expression.g:169:5: ( ( '+' | '-' | '/' | '*' | '%' | '^' ) ^ (expr2= atom ) )*
			loop8:
			while (true) {
				int alt8=2;
				switch ( input.LA(1) ) {
				case 25:
					{
					int LA8_2 = input.LA(2);
					if ( (LA8_2==ID||(LA8_2 >= LPARAM && LA8_2 <= NUMERIC)||(LA8_2 >= 24 && LA8_2 <= 25)) ) {
						alt8=1;
					}

					}
					break;
				case 24:
					{
					int LA8_3 = input.LA(2);
					if ( (LA8_3==ID||(LA8_3 >= LPARAM && LA8_3 <= NUMERIC)||(LA8_3 >= 24 && LA8_3 <= 25)) ) {
						alt8=1;
					}

					}
					break;
				case 21:
				case 23:
				case 26:
				case 33:
					{
					alt8=1;
					}
					break;
				}
				switch (alt8) {
				case 1 :
					// Expression.g:169:6: ( '+' | '-' | '/' | '*' | '%' | '^' ) ^ (expr2= atom )
					{
					// Expression.g:169:6: ( '+' | '-' | '/' | '*' | '%' | '^' )
					int alt7=6;
					switch ( input.LA(1) ) {
					case 24:
						{
						alt7=1;
						}
						break;
					case 25:
						{
						alt7=2;
						}
						break;
					case 26:
						{
						alt7=3;
						}
						break;
					case 23:
						{
						alt7=4;
						}
						break;
					case 21:
						{
						alt7=5;
						}
						break;
					case 33:
						{
						alt7=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}
					switch (alt7) {
						case 1 :
							// Expression.g:170:5: '+'
							{
							char_literal25=(Token)match(input,24,FOLLOW_24_in_arithmeticExpression643); 
							char_literal25_tree = (CommonTree)adaptor.create(char_literal25);
							adaptor.addChild(root_0, char_literal25_tree);

							retval.arithmeticExpression.setOperator("+");
							}
							break;
						case 2 :
							// Expression.g:171:6: '-'
							{
							char_literal26=(Token)match(input,25,FOLLOW_25_in_arithmeticExpression652); 
							char_literal26_tree = (CommonTree)adaptor.create(char_literal26);
							adaptor.addChild(root_0, char_literal26_tree);

							retval.arithmeticExpression.setOperator("-");
							}
							break;
						case 3 :
							// Expression.g:172:6: '/'
							{
							char_literal27=(Token)match(input,26,FOLLOW_26_in_arithmeticExpression660); 
							char_literal27_tree = (CommonTree)adaptor.create(char_literal27);
							adaptor.addChild(root_0, char_literal27_tree);

							retval.arithmeticExpression.setOperator("/");
							}
							break;
						case 4 :
							// Expression.g:173:6: '*'
							{
							char_literal28=(Token)match(input,23,FOLLOW_23_in_arithmeticExpression668); 
							char_literal28_tree = (CommonTree)adaptor.create(char_literal28);
							adaptor.addChild(root_0, char_literal28_tree);

							retval.arithmeticExpression.setOperator("*");
							}
							break;
						case 5 :
							// Expression.g:174:6: '%'
							{
							char_literal29=(Token)match(input,21,FOLLOW_21_in_arithmeticExpression676); 
							char_literal29_tree = (CommonTree)adaptor.create(char_literal29);
							adaptor.addChild(root_0, char_literal29_tree);

							retval.arithmeticExpression.setOperator("%");
							}
							break;
						case 6 :
							// Expression.g:175:6: '^'
							{
							char_literal30=(Token)match(input,33,FOLLOW_33_in_arithmeticExpression684); 
							char_literal30_tree = (CommonTree)adaptor.create(char_literal30);
							adaptor.addChild(root_0, char_literal30_tree);

							retval.arithmeticExpression.setOperator("^");
							}
							break;

					}

					// Expression.g:178:6: (expr2= atom )
					// Expression.g:178:7: expr2= atom
					{
					pushFollow(FOLLOW_atom_in_arithmeticExpression705);
					expr2=atom();
					state._fsp--;

					adaptor.addChild(root_0, expr2.getTree());


					        expressions.add((expr2!=null?((ExpressionParser.atom_return)expr2).expression:null));
					    
					}

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


			  retval.arithmeticExpression.setExpressions(expressions);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmeticExpression"


	public static class atom_return extends ParserRuleReturnScope {
		public Expression expression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// Expression.g:184:1: atom returns [Expression expression] : (atomicExpr= atomicExpression |number1= signedUnaryExpression | '(' expr= expressions ')' );
	public final ExpressionParser.atom_return atom() throws RecognitionException {
		ExpressionParser.atom_return retval = new ExpressionParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal31=null;
		Token char_literal32=null;
		ParserRuleReturnScope atomicExpr =null;
		ParserRuleReturnScope number1 =null;
		ParserRuleReturnScope expr =null;

		CommonTree char_literal31_tree=null;
		CommonTree char_literal32_tree=null;

		try {
			// Expression.g:185:3: (atomicExpr= atomicExpression |number1= signedUnaryExpression | '(' expr= expressions ')' )
			int alt9=3;
			switch ( input.LA(1) ) {
			case ID:
			case NUMERIC:
				{
				alt9=1;
				}
				break;
			case 24:
			case 25:
				{
				alt9=2;
				}
				break;
			case LPARAM:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// Expression.g:185:5: atomicExpr= atomicExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atomicExpression_in_atom738);
					atomicExpr=atomicExpression();
					state._fsp--;

					adaptor.addChild(root_0, atomicExpr.getTree());

					retval.expression = (atomicExpr!=null?((ExpressionParser.atomicExpression_return)atomicExpr).atomicExpression:null);
					}
					break;
				case 2 :
					// Expression.g:186:5: number1= signedUnaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_signedUnaryExpression_in_atom750);
					number1=signedUnaryExpression();
					state._fsp--;

					adaptor.addChild(root_0, number1.getTree());

					retval.expression = (number1!=null?((ExpressionParser.signedUnaryExpression_return)number1).signedUnaryExpression:null);
					}
					break;
				case 3 :
					// Expression.g:187:5: '(' expr= expressions ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal31=(Token)match(input,LPARAM,FOLLOW_LPARAM_in_atom758); 
					char_literal31_tree = (CommonTree)adaptor.create(char_literal31);
					adaptor.addChild(root_0, char_literal31_tree);

					pushFollow(FOLLOW_expressions_in_atom764);
					expr=expressions();
					state._fsp--;

					adaptor.addChild(root_0, expr.getTree());

					retval.expression = (expr!=null?((ExpressionParser.expressions_return)expr).expression:null);
					char_literal32=(Token)match(input,RPARAM,FOLLOW_RPARAM_in_atom768); 
					char_literal32_tree = (CommonTree)adaptor.create(char_literal32);
					adaptor.addChild(root_0, char_literal32_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class atomicExpression_return extends ParserRuleReturnScope {
		public AtomicExpression atomicExpression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atomicExpression"
	// Expression.g:190:1: atomicExpression returns [AtomicExpression atomicExpression] : (number1= number | ID );
	public final ExpressionParser.atomicExpression_return atomicExpression() throws RecognitionException {
		ExpressionParser.atomicExpression_return retval = new ExpressionParser.atomicExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID33=null;
		ParserRuleReturnScope number1 =null;

		CommonTree ID33_tree=null;


		  retval.atomicExpression = new AtomicExpression();

		try {
			// Expression.g:194:3: (number1= number | ID )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==NUMERIC) ) {
				alt10=1;
			}
			else if ( (LA10_0==ID) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// Expression.g:194:5: number1= number
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_number_in_atomicExpression794);
					number1=number();
					state._fsp--;

					adaptor.addChild(root_0, number1.getTree());


					    retval.atomicExpression.setValue((number1!=null?((ExpressionParser.number_return)number1).value:0.0));

					}
					break;
				case 2 :
					// Expression.g:197:5: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					ID33=(Token)match(input,ID,FOLLOW_ID_in_atomicExpression802); 
					ID33_tree = (CommonTree)adaptor.create(ID33);
					adaptor.addChild(root_0, ID33_tree);


					      if(getRow().containsKey((ID33!=null?ID33.getText():null))) {
					        Object value = getRow().get((ID33!=null?ID33.getText():null));
					        if(value instanceof Integer) {
					          retval.atomicExpression.setValue((double)((Integer) value).intValue());
					        } else {
					          retval.atomicExpression.setValue(value);
					        }
					      } else {
					        if((ID33!=null?ID33.getText():null).toString().equals("true")) {
					            retval.atomicExpression.setValue(true);
					        } else if((ID33!=null?ID33.getText():null).toString().equals("false")) {
					            retval.atomicExpression.setValue(false);
					        } else {
					            retval.atomicExpression.setValue((ID33!=null?ID33.getText():null));
					        }
					      }

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomicExpression"


	public static class signedUnaryExpression_return extends ParserRuleReturnScope {
		public SignedUnaryExpression signedUnaryExpression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "signedUnaryExpression"
	// Expression.g:217:1: signedUnaryExpression returns [SignedUnaryExpression signedUnaryExpression] : ( '-' number1= number -> ^( SIGNEDUNARY '-' number ) | '+' number2= number -> ^( SIGNEDUNARY '+' number ) );
	public final ExpressionParser.signedUnaryExpression_return signedUnaryExpression() throws RecognitionException {
		ExpressionParser.signedUnaryExpression_return retval = new ExpressionParser.signedUnaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal34=null;
		Token char_literal35=null;
		ParserRuleReturnScope number1 =null;
		ParserRuleReturnScope number2 =null;

		CommonTree char_literal34_tree=null;
		CommonTree char_literal35_tree=null;
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleSubtreeStream stream_number=new RewriteRuleSubtreeStream(adaptor,"rule number");


		  retval.signedUnaryExpression = new SignedUnaryExpression();

		try {
			// Expression.g:221:3: ( '-' number1= number -> ^( SIGNEDUNARY '-' number ) | '+' number2= number -> ^( SIGNEDUNARY '+' number ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==25) ) {
				alt11=1;
			}
			else if ( (LA11_0==24) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// Expression.g:221:5: '-' number1= number
					{
					char_literal34=(Token)match(input,25,FOLLOW_25_in_signedUnaryExpression826);  
					stream_25.add(char_literal34);

					pushFollow(FOLLOW_number_in_signedUnaryExpression832);
					number1=number();
					state._fsp--;

					stream_number.add(number1.getTree());

					      retval.signedUnaryExpression.setValue((number1!=null?((ExpressionParser.number_return)number1).value:0.0));
					      retval.signedUnaryExpression.setSign("-");
					 
					// AST REWRITE
					// elements: 25, number
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 224:4: -> ^( SIGNEDUNARY '-' number )
					{
						// Expression.g:224:7: ^( SIGNEDUNARY '-' number )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNEDUNARY, "SIGNEDUNARY"), root_1);
						adaptor.addChild(root_1, stream_25.nextNode());
						adaptor.addChild(root_1, stream_number.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Expression.g:226:5: '+' number2= number
					{
					char_literal35=(Token)match(input,24,FOLLOW_24_in_signedUnaryExpression851);  
					stream_24.add(char_literal35);

					pushFollow(FOLLOW_number_in_signedUnaryExpression857);
					number2=number();
					state._fsp--;

					stream_number.add(number2.getTree());

					      retval.signedUnaryExpression.setValue((number2!=null?((ExpressionParser.number_return)number2).value:0.0));
					      retval.signedUnaryExpression.setSign("+");
					 
					// AST REWRITE
					// elements: number, 24
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 229:4: -> ^( SIGNEDUNARY '+' number )
					{
						// Expression.g:229:7: ^( SIGNEDUNARY '+' number )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNEDUNARY, "SIGNEDUNARY"), root_1);
						adaptor.addChild(root_1, stream_24.nextNode());
						adaptor.addChild(root_1, stream_number.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "signedUnaryExpression"


	public static class number_return extends ParserRuleReturnScope {
		public double value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "number"
	// Expression.g:233:1: number returns [double value] : digit1= NUMERIC ;
	public final ExpressionParser.number_return number() throws RecognitionException {
		ExpressionParser.number_return retval = new ExpressionParser.number_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token digit1=null;

		CommonTree digit1_tree=null;

		try {
			// Expression.g:234:3: (digit1= NUMERIC )
			// Expression.g:234:6: digit1= NUMERIC
			{
			root_0 = (CommonTree)adaptor.nil();


			digit1=(Token)match(input,NUMERIC,FOLLOW_NUMERIC_in_number892); 
			digit1_tree = (CommonTree)adaptor.create(digit1);
			adaptor.addChild(root_0, digit1_tree);

			retval.value = Double.parseDouble((digit1!=null?digit1.getText():null).toString());
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "number"

	// Delegated rules



	public static final BitSet FOLLOW_ID_in_expression125 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_expression127 = new BitSet(new long[]{0x000000000301E040L});
	public static final BitSet FOLLOW_expressions_in_expression133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalExpression_in_expressions170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatementExpression_in_expressions184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseStatementExpression_in_expressions198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatementExpression226 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_LPARAM_in_ifStatementExpression228 = new BitSet(new long[]{0x000000000301E040L});
	public static final BitSet FOLLOW_expressions_in_ifStatementExpression234 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COMMA_in_ifStatementExpression244 = new BitSet(new long[]{0x000000000301E040L});
	public static final BitSet FOLLOW_expressions_in_ifStatementExpression250 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COMMA_in_ifStatementExpression260 = new BitSet(new long[]{0x000000000301E040L});
	public static final BitSet FOLLOW_expressions_in_ifStatementExpression266 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_RPARAM_in_ifStatementExpression270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_caseStatementExpression301 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_LPARAM_in_caseStatementExpression303 = new BitSet(new long[]{0x000000000301E040L});
	public static final BitSet FOLLOW_expressions_in_caseStatementExpression309 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COMMA_in_caseStatementExpression313 = new BitSet(new long[]{0x000000000301E040L});
	public static final BitSet FOLLOW_expressions_in_caseStatementExpression319 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COMMA_in_caseStatementExpression330 = new BitSet(new long[]{0x000000000301E040L});
	public static final BitSet FOLLOW_expressions_in_caseStatementExpression336 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COMMA_in_caseStatementExpression340 = new BitSet(new long[]{0x000000000301E040L});
	public static final BitSet FOLLOW_expressions_in_caseStatementExpression346 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COMMA_in_caseStatementExpression358 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DEFAULT_in_caseStatementExpression360 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COMMA_in_caseStatementExpression362 = new BitSet(new long[]{0x000000000301E040L});
	public static final BitSet FOLLOW_expressions_in_caseStatementExpression368 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_RPARAM_in_caseStatementExpression372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationalExpression_in_logicalExpression410 = new BitSet(new long[]{0x0000000400400002L});
	public static final BitSet FOLLOW_22_in_logicalExpression427 = new BitSet(new long[]{0x000000000301A000L});
	public static final BitSet FOLLOW_34_in_logicalExpression435 = new BitSet(new long[]{0x000000000301A000L});
	public static final BitSet FOLLOW_relationalExpression_in_logicalExpression456 = new BitSet(new long[]{0x0000000400400002L});
	public static final BitSet FOLLOW_arithmeticExpression_in_relationalExpression503 = new BitSet(new long[]{0x00000001DB11A002L});
	public static final BitSet FOLLOW_30_in_relationalExpression520 = new BitSet(new long[]{0x000000000301A000L});
	public static final BitSet FOLLOW_20_in_relationalExpression528 = new BitSet(new long[]{0x000000000301A000L});
	public static final BitSet FOLLOW_31_in_relationalExpression536 = new BitSet(new long[]{0x000000000301A000L});
	public static final BitSet FOLLOW_27_in_relationalExpression544 = new BitSet(new long[]{0x000000000301A000L});
	public static final BitSet FOLLOW_28_in_relationalExpression552 = new BitSet(new long[]{0x000000000301A000L});
	public static final BitSet FOLLOW_32_in_relationalExpression560 = new BitSet(new long[]{0x000000000301A000L});
	public static final BitSet FOLLOW_arithmeticExpression_in_relationalExpression580 = new BitSet(new long[]{0x00000001DB11A002L});
	public static final BitSet FOLLOW_atom_in_arithmeticExpression627 = new BitSet(new long[]{0x0000000207A00002L});
	public static final BitSet FOLLOW_24_in_arithmeticExpression643 = new BitSet(new long[]{0x000000000301A000L});
	public static final BitSet FOLLOW_25_in_arithmeticExpression652 = new BitSet(new long[]{0x000000000301A000L});
	public static final BitSet FOLLOW_26_in_arithmeticExpression660 = new BitSet(new long[]{0x000000000301A000L});
	public static final BitSet FOLLOW_23_in_arithmeticExpression668 = new BitSet(new long[]{0x000000000301A000L});
	public static final BitSet FOLLOW_21_in_arithmeticExpression676 = new BitSet(new long[]{0x000000000301A000L});
	public static final BitSet FOLLOW_33_in_arithmeticExpression684 = new BitSet(new long[]{0x000000000301A000L});
	public static final BitSet FOLLOW_atom_in_arithmeticExpression705 = new BitSet(new long[]{0x0000000207A00002L});
	public static final BitSet FOLLOW_atomicExpression_in_atom738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signedUnaryExpression_in_atom750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAM_in_atom758 = new BitSet(new long[]{0x000000000301E040L});
	public static final BitSet FOLLOW_expressions_in_atom764 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_RPARAM_in_atom768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_atomicExpression794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atomicExpression802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_signedUnaryExpression826 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_number_in_signedUnaryExpression832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_signedUnaryExpression851 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_number_in_signedUnaryExpression857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERIC_in_number892 = new BitSet(new long[]{0x0000000000000002L});
}
