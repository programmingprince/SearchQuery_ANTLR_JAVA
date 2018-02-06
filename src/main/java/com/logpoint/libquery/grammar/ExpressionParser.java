// $ANTLR 3.5.2 Expression.g 2018-02-07 00:00:11

	package com.logpoint.libquery.grammar;
	import java.util.LinkedList;
	import com.logpoint.libquery.expressions.arithmetic.*;
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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CALL", "CALLSIGNEDUNARY", "DIGIT", 
		"EQUALS", "EXPONENT", "FUNC", "ID", "NUMERIC", "SIGNEDUNARY", "WS", "'!='", 
		"'%'", "'&&'", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "'<'", "'<='", 
		"'='", "'=='", "'>'", "'>='", "'^'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
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
	public static final int CALL=4;
	public static final int CALLSIGNEDUNARY=5;
	public static final int DIGIT=6;
	public static final int EQUALS=7;
	public static final int EXPONENT=8;
	public static final int FUNC=9;
	public static final int ID=10;
	public static final int NUMERIC=11;
	public static final int SIGNEDUNARY=12;
	public static final int WS=13;

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
	// Expression.g:72:1: expression returns [Expression expression] : ID '=' expr= expressions -> ^( EQUALS ID expressions ) ;
	public final ExpressionParser.expression_return expression() throws ParseException, RecognitionException {
		ExpressionParser.expression_return retval = new ExpressionParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID1=null;
		Token char_literal2=null;
		ParserRuleReturnScope expr =null;

		CommonTree ID1_tree=null;
		CommonTree char_literal2_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expressions=new RewriteRuleSubtreeStream(adaptor,"rule expressions");

		try {
			// Expression.g:73:2: ( ID '=' expr= expressions -> ^( EQUALS ID expressions ) )
			// Expression.g:73:6: ID '=' expr= expressions
			{
			ID1=(Token)match(input,ID,FOLLOW_ID_in_expression124);  
			stream_ID.add(ID1);

			char_literal2=(Token)match(input,25,FOLLOW_25_in_expression126);  
			stream_25.add(char_literal2);

			pushFollow(FOLLOW_expressions_in_expression132);
			expr=expressions();
			state._fsp--;

			stream_expressions.add(expr.getTree());
			retval.expression = (expr!=null?((ExpressionParser.expressions_return)expr).expression:null);
			// AST REWRITE
			// elements: ID, expressions
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 73:66: -> ^( EQUALS ID expressions )
			{
				// Expression.g:73:69: ^( EQUALS ID expressions )
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
	// Expression.g:76:1: expressions returns [Expression expression] : expr1= logicalExpression ;
	public final ExpressionParser.expressions_return expressions() throws RecognitionException {
		ExpressionParser.expressions_return retval = new ExpressionParser.expressions_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expr1 =null;


		try {
			// Expression.g:77:5: (expr1= logicalExpression )
			// Expression.g:77:7: expr1= logicalExpression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalExpression_in_expressions169);
			expr1=logicalExpression();
			state._fsp--;

			adaptor.addChild(root_0, expr1.getTree());

			retval.expression = (expr1!=null?((ExpressionParser.logicalExpression_return)expr1).logicalExpression:null);
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


	public static class logicalExpression_return extends ParserRuleReturnScope {
		public LogicalExpression logicalExpression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logicalExpression"
	// Expression.g:80:1: logicalExpression returns [LogicalExpression logicalExpression] : (expr1= relationalExpression ) ( ( '&&' | '||' ) ^ (expr2= relationalExpression ) )* ;
	public final ExpressionParser.logicalExpression_return logicalExpression() throws RecognitionException {
		ExpressionParser.logicalExpression_return retval = new ExpressionParser.logicalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal3=null;
		Token string_literal4=null;
		ParserRuleReturnScope expr1 =null;
		ParserRuleReturnScope expr2 =null;

		CommonTree string_literal3_tree=null;
		CommonTree string_literal4_tree=null;


			retval.logicalExpression = new LogicalExpression();
			List<Expression> expressions = new ArrayList<Expression>();

		try {
			// Expression.g:89:2: ( (expr1= relationalExpression ) ( ( '&&' | '||' ) ^ (expr2= relationalExpression ) )* )
			// Expression.g:89:6: (expr1= relationalExpression ) ( ( '&&' | '||' ) ^ (expr2= relationalExpression ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// Expression.g:89:6: (expr1= relationalExpression )
			// Expression.g:89:7: expr1= relationalExpression
			{
			pushFollow(FOLLOW_relationalExpression_in_logicalExpression207);
			expr1=relationalExpression();
			state._fsp--;

			adaptor.addChild(root_0, expr1.getTree());


							expressions.add((expr1!=null?((ExpressionParser.relationalExpression_return)expr1).relationalExpression:null));
					
			}

			// Expression.g:92:3: ( ( '&&' | '||' ) ^ (expr2= relationalExpression ) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==16||LA2_0==30) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Expression.g:92:4: ( '&&' | '||' ) ^ (expr2= relationalExpression )
					{
					// Expression.g:92:4: ( '&&' | '||' )
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==16) ) {
						alt1=1;
					}
					else if ( (LA1_0==30) ) {
						alt1=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}

					switch (alt1) {
						case 1 :
							// Expression.g:93:4: '&&'
							{
							string_literal3=(Token)match(input,16,FOLLOW_16_in_logicalExpression220); 
							string_literal3_tree = (CommonTree)adaptor.create(string_literal3);
							adaptor.addChild(root_0, string_literal3_tree);

							retval.logicalExpression.setOperator("&&");
							}
							break;
						case 2 :
							// Expression.g:94:4: '||'
							{
							string_literal4=(Token)match(input,30,FOLLOW_30_in_logicalExpression226); 
							string_literal4_tree = (CommonTree)adaptor.create(string_literal4);
							adaptor.addChild(root_0, string_literal4_tree);

							retval.logicalExpression.setOperator("||");
							}
							break;

					}

					// Expression.g:97:4: (expr2= relationalExpression )
					// Expression.g:97:5: expr2= relationalExpression
					{
					pushFollow(FOLLOW_relationalExpression_in_logicalExpression243);
					expr2=relationalExpression();
					state._fsp--;

					adaptor.addChild(root_0, expr2.getTree());


									expressions.add((expr2!=null?((ExpressionParser.relationalExpression_return)expr2).relationalExpression:null));
							
					}

					}
					break;

				default :
					break loop2;
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
	// Expression.g:103:1: relationalExpression returns [RelationalExpression relationalExpression] : (expr1= arithmeticExpression ) ( (| '==' | '!=' | '>' | '<' | '<=' | '>=' ) ^ (expr2= arithmeticExpression ) )* ;
	public final ExpressionParser.relationalExpression_return relationalExpression() throws RecognitionException {
		ExpressionParser.relationalExpression_return retval = new ExpressionParser.relationalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal5=null;
		Token string_literal6=null;
		Token char_literal7=null;
		Token char_literal8=null;
		Token string_literal9=null;
		Token string_literal10=null;
		ParserRuleReturnScope expr1 =null;
		ParserRuleReturnScope expr2 =null;

		CommonTree string_literal5_tree=null;
		CommonTree string_literal6_tree=null;
		CommonTree char_literal7_tree=null;
		CommonTree char_literal8_tree=null;
		CommonTree string_literal9_tree=null;
		CommonTree string_literal10_tree=null;


			retval.relationalExpression = new RelationalExpression();
			List<Expression> expressions = new ArrayList<Expression>();

		try {
			// Expression.g:112:2: ( (expr1= arithmeticExpression ) ( (| '==' | '!=' | '>' | '<' | '<=' | '>=' ) ^ (expr2= arithmeticExpression ) )* )
			// Expression.g:112:6: (expr1= arithmeticExpression ) ( (| '==' | '!=' | '>' | '<' | '<=' | '>=' ) ^ (expr2= arithmeticExpression ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// Expression.g:112:6: (expr1= arithmeticExpression )
			// Expression.g:112:7: expr1= arithmeticExpression
			{
			pushFollow(FOLLOW_arithmeticExpression_in_relationalExpression287);
			expr1=arithmeticExpression();
			state._fsp--;

			adaptor.addChild(root_0, expr1.getTree());


							expressions.add((expr1!=null?((ExpressionParser.arithmeticExpression_return)expr1).arithmeticExpression:null));
					
			}

			// Expression.g:115:3: ( (| '==' | '!=' | '>' | '<' | '<=' | '>=' ) ^ (expr2= arithmeticExpression ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= ID && LA4_0 <= NUMERIC)||LA4_0==14||LA4_0==17||(LA4_0 >= 20 && LA4_0 <= 21)||(LA4_0 >= 23 && LA4_0 <= 24)||(LA4_0 >= 26 && LA4_0 <= 28)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Expression.g:115:4: (| '==' | '!=' | '>' | '<' | '<=' | '>=' ) ^ (expr2= arithmeticExpression )
					{
					// Expression.g:115:4: (| '==' | '!=' | '>' | '<' | '<=' | '>=' )
					int alt3=7;
					switch ( input.LA(1) ) {
					case ID:
					case NUMERIC:
					case 17:
					case 20:
					case 21:
						{
						alt3=1;
						}
						break;
					case 26:
						{
						alt3=2;
						}
						break;
					case 14:
						{
						alt3=3;
						}
						break;
					case 27:
						{
						alt3=4;
						}
						break;
					case 23:
						{
						alt3=5;
						}
						break;
					case 24:
						{
						alt3=6;
						}
						break;
					case 28:
						{
						alt3=7;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}
					switch (alt3) {
						case 1 :
							// Expression.g:116:3: 
							{
							}
							break;
						case 2 :
							// Expression.g:116:4: '=='
							{
							string_literal5=(Token)match(input,26,FOLLOW_26_in_relationalExpression300); 
							string_literal5_tree = (CommonTree)adaptor.create(string_literal5);
							adaptor.addChild(root_0, string_literal5_tree);

							retval.relationalExpression.setOperator("==");
							}
							break;
						case 3 :
							// Expression.g:117:4: '!='
							{
							string_literal6=(Token)match(input,14,FOLLOW_14_in_relationalExpression306); 
							string_literal6_tree = (CommonTree)adaptor.create(string_literal6);
							adaptor.addChild(root_0, string_literal6_tree);

							retval.relationalExpression.setOperator("!=");
							}
							break;
						case 4 :
							// Expression.g:118:4: '>'
							{
							char_literal7=(Token)match(input,27,FOLLOW_27_in_relationalExpression312); 
							char_literal7_tree = (CommonTree)adaptor.create(char_literal7);
							adaptor.addChild(root_0, char_literal7_tree);

							retval.relationalExpression.setOperator(">");
							}
							break;
						case 5 :
							// Expression.g:119:4: '<'
							{
							char_literal8=(Token)match(input,23,FOLLOW_23_in_relationalExpression318); 
							char_literal8_tree = (CommonTree)adaptor.create(char_literal8);
							adaptor.addChild(root_0, char_literal8_tree);

							retval.relationalExpression.setOperator("<");
							}
							break;
						case 6 :
							// Expression.g:120:4: '<='
							{
							string_literal9=(Token)match(input,24,FOLLOW_24_in_relationalExpression324); 
							string_literal9_tree = (CommonTree)adaptor.create(string_literal9);
							adaptor.addChild(root_0, string_literal9_tree);

							retval.relationalExpression.setOperator("<=");
							}
							break;
						case 7 :
							// Expression.g:121:4: '>='
							{
							string_literal10=(Token)match(input,28,FOLLOW_28_in_relationalExpression330); 
							string_literal10_tree = (CommonTree)adaptor.create(string_literal10);
							adaptor.addChild(root_0, string_literal10_tree);

							retval.relationalExpression.setOperator(">=");
							}
							break;

					}

					// Expression.g:123:4: (expr2= arithmeticExpression )
					// Expression.g:123:5: expr2= arithmeticExpression
					{
					pushFollow(FOLLOW_arithmeticExpression_in_relationalExpression346);
					expr2=arithmeticExpression();
					state._fsp--;

					adaptor.addChild(root_0, expr2.getTree());


									expressions.add((expr2!=null?((ExpressionParser.arithmeticExpression_return)expr2).arithmeticExpression:null));
							
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
	// Expression.g:129:1: arithmeticExpression returns [ArithmeticExpression arithmeticExpression] : (expr1= atom ) ( ( '+' | '-' | '/' | '*' | '%' | '^' ) ^ (expr2= atom ) )* ;
	public final ExpressionParser.arithmeticExpression_return arithmeticExpression() throws RecognitionException {
		ExpressionParser.arithmeticExpression_return retval = new ExpressionParser.arithmeticExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal11=null;
		Token char_literal12=null;
		Token char_literal13=null;
		Token char_literal14=null;
		Token char_literal15=null;
		Token char_literal16=null;
		ParserRuleReturnScope expr1 =null;
		ParserRuleReturnScope expr2 =null;

		CommonTree char_literal11_tree=null;
		CommonTree char_literal12_tree=null;
		CommonTree char_literal13_tree=null;
		CommonTree char_literal14_tree=null;
		CommonTree char_literal15_tree=null;
		CommonTree char_literal16_tree=null;


			retval.arithmeticExpression = new ArithmeticExpression();
			List<Expression> expressions = new ArrayList<Expression>();

		try {
			// Expression.g:138:2: ( (expr1= atom ) ( ( '+' | '-' | '/' | '*' | '%' | '^' ) ^ (expr2= atom ) )* )
			// Expression.g:138:6: (expr1= atom ) ( ( '+' | '-' | '/' | '*' | '%' | '^' ) ^ (expr2= atom ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// Expression.g:138:6: (expr1= atom )
			// Expression.g:138:7: expr1= atom
			{
			pushFollow(FOLLOW_atom_in_arithmeticExpression390);
			expr1=atom();
			state._fsp--;

			adaptor.addChild(root_0, expr1.getTree());


							expressions.add((expr1!=null?((ExpressionParser.atom_return)expr1).expression:null));
					
			}

			// Expression.g:141:3: ( ( '+' | '-' | '/' | '*' | '%' | '^' ) ^ (expr2= atom ) )*
			loop6:
			while (true) {
				int alt6=2;
				switch ( input.LA(1) ) {
				case 21:
					{
					int LA6_2 = input.LA(2);
					if ( ((LA6_2 >= ID && LA6_2 <= NUMERIC)||LA6_2==17||(LA6_2 >= 20 && LA6_2 <= 21)) ) {
						alt6=1;
					}

					}
					break;
				case 20:
					{
					int LA6_3 = input.LA(2);
					if ( ((LA6_3 >= ID && LA6_3 <= NUMERIC)||LA6_3==17||(LA6_3 >= 20 && LA6_3 <= 21)) ) {
						alt6=1;
					}

					}
					break;
				case 15:
				case 19:
				case 22:
				case 29:
					{
					alt6=1;
					}
					break;
				}
				switch (alt6) {
				case 1 :
					// Expression.g:141:4: ( '+' | '-' | '/' | '*' | '%' | '^' ) ^ (expr2= atom )
					{
					// Expression.g:141:4: ( '+' | '-' | '/' | '*' | '%' | '^' )
					int alt5=6;
					switch ( input.LA(1) ) {
					case 20:
						{
						alt5=1;
						}
						break;
					case 21:
						{
						alt5=2;
						}
						break;
					case 22:
						{
						alt5=3;
						}
						break;
					case 19:
						{
						alt5=4;
						}
						break;
					case 15:
						{
						alt5=5;
						}
						break;
					case 29:
						{
						alt5=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}
					switch (alt5) {
						case 1 :
							// Expression.g:142:3: '+'
							{
							char_literal11=(Token)match(input,20,FOLLOW_20_in_arithmeticExpression402); 
							char_literal11_tree = (CommonTree)adaptor.create(char_literal11);
							adaptor.addChild(root_0, char_literal11_tree);

							retval.arithmeticExpression.setOperator("+");
							}
							break;
						case 2 :
							// Expression.g:143:4: '-'
							{
							char_literal12=(Token)match(input,21,FOLLOW_21_in_arithmeticExpression409); 
							char_literal12_tree = (CommonTree)adaptor.create(char_literal12);
							adaptor.addChild(root_0, char_literal12_tree);

							retval.arithmeticExpression.setOperator("-");
							}
							break;
						case 3 :
							// Expression.g:144:4: '/'
							{
							char_literal13=(Token)match(input,22,FOLLOW_22_in_arithmeticExpression415); 
							char_literal13_tree = (CommonTree)adaptor.create(char_literal13);
							adaptor.addChild(root_0, char_literal13_tree);

							retval.arithmeticExpression.setOperator("/");
							}
							break;
						case 4 :
							// Expression.g:145:4: '*'
							{
							char_literal14=(Token)match(input,19,FOLLOW_19_in_arithmeticExpression421); 
							char_literal14_tree = (CommonTree)adaptor.create(char_literal14);
							adaptor.addChild(root_0, char_literal14_tree);

							retval.arithmeticExpression.setOperator("*");
							}
							break;
						case 5 :
							// Expression.g:146:4: '%'
							{
							char_literal15=(Token)match(input,15,FOLLOW_15_in_arithmeticExpression427); 
							char_literal15_tree = (CommonTree)adaptor.create(char_literal15);
							adaptor.addChild(root_0, char_literal15_tree);

							retval.arithmeticExpression.setOperator("%");
							}
							break;
						case 6 :
							// Expression.g:147:4: '^'
							{
							char_literal16=(Token)match(input,29,FOLLOW_29_in_arithmeticExpression433); 
							char_literal16_tree = (CommonTree)adaptor.create(char_literal16);
							adaptor.addChild(root_0, char_literal16_tree);

							retval.arithmeticExpression.setOperator("^");
							}
							break;

					}

					// Expression.g:150:4: (expr2= atom )
					// Expression.g:150:5: expr2= atom
					{
					pushFollow(FOLLOW_atom_in_arithmeticExpression450);
					expr2=atom();
					state._fsp--;

					adaptor.addChild(root_0, expr2.getTree());


									expressions.add((expr2!=null?((ExpressionParser.atom_return)expr2).expression:null));
							
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
	// Expression.g:156:1: atom returns [Expression expression] : (atomicExpr= atomicExpression |number1= signedUnaryExpression | '(' expr= expressions ')' );
	public final ExpressionParser.atom_return atom() throws RecognitionException {
		ExpressionParser.atom_return retval = new ExpressionParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal17=null;
		Token char_literal18=null;
		ParserRuleReturnScope atomicExpr =null;
		ParserRuleReturnScope number1 =null;
		ParserRuleReturnScope expr =null;

		CommonTree char_literal17_tree=null;
		CommonTree char_literal18_tree=null;

		try {
			// Expression.g:157:3: (atomicExpr= atomicExpression |number1= signedUnaryExpression | '(' expr= expressions ')' )
			int alt7=3;
			switch ( input.LA(1) ) {
			case ID:
			case NUMERIC:
				{
				alt7=1;
				}
				break;
			case 20:
			case 21:
				{
				alt7=2;
				}
				break;
			case 17:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// Expression.g:157:5: atomicExpr= atomicExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atomicExpression_in_atom485);
					atomicExpr=atomicExpression();
					state._fsp--;

					adaptor.addChild(root_0, atomicExpr.getTree());

					retval.expression = (atomicExpr!=null?((ExpressionParser.atomicExpression_return)atomicExpr).atomicExpression:null);
					}
					break;
				case 2 :
					// Expression.g:158:5: number1= signedUnaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_signedUnaryExpression_in_atom497);
					number1=signedUnaryExpression();
					state._fsp--;

					adaptor.addChild(root_0, number1.getTree());

					retval.expression = (number1!=null?((ExpressionParser.signedUnaryExpression_return)number1).signedUnaryExpression:null);
					}
					break;
				case 3 :
					// Expression.g:159:5: '(' expr= expressions ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal17=(Token)match(input,17,FOLLOW_17_in_atom505); 
					char_literal17_tree = (CommonTree)adaptor.create(char_literal17);
					adaptor.addChild(root_0, char_literal17_tree);

					pushFollow(FOLLOW_expressions_in_atom511);
					expr=expressions();
					state._fsp--;

					adaptor.addChild(root_0, expr.getTree());

					retval.expression = (expr!=null?((ExpressionParser.expressions_return)expr).expression:null);
					char_literal18=(Token)match(input,18,FOLLOW_18_in_atom515); 
					char_literal18_tree = (CommonTree)adaptor.create(char_literal18);
					adaptor.addChild(root_0, char_literal18_tree);

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
	// Expression.g:162:1: atomicExpression returns [AtomicExpression atomicExpression] : (number1= number | ID );
	public final ExpressionParser.atomicExpression_return atomicExpression() throws RecognitionException {
		ExpressionParser.atomicExpression_return retval = new ExpressionParser.atomicExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID19=null;
		ParserRuleReturnScope number1 =null;

		CommonTree ID19_tree=null;


			retval.atomicExpression = new AtomicExpression();

		try {
			// Expression.g:166:3: (number1= number | ID )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==NUMERIC) ) {
				alt8=1;
			}
			else if ( (LA8_0==ID) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// Expression.g:166:5: number1= number
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_number_in_atomicExpression543);
					number1=number();
					state._fsp--;

					adaptor.addChild(root_0, number1.getTree());


					 		retval.atomicExpression.setValue((number1!=null?((ExpressionParser.number_return)number1).value:0.0));

					}
					break;
				case 2 :
					// Expression.g:169:5: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					ID19=(Token)match(input,ID,FOLLOW_ID_in_atomicExpression551); 
					ID19_tree = (CommonTree)adaptor.create(ID19);
					adaptor.addChild(root_0, ID19_tree);


					      if(getRow().containsKey((ID19!=null?ID19.getText():null))) {
					        Object value = getRow().get((ID19!=null?ID19.getText():null));
					        if(value instanceof Integer) {
					          retval.atomicExpression.setValue((double)((Integer) value).intValue());
					        } else {
					          retval.atomicExpression.setValue(value);
					        }
					      } else {
					        if((ID19!=null?ID19.getText():null).toString().equals("true")) {
					            retval.atomicExpression.setValue(true);
					        } else if((ID19!=null?ID19.getText():null).toString().equals("false")) {
					            retval.atomicExpression.setValue(false);
					        } else {
					            retval.atomicExpression.setValue((ID19!=null?ID19.getText():null));
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
	// Expression.g:189:1: signedUnaryExpression returns [SignedUnaryExpression signedUnaryExpression] : ( '-' number1= number -> ^( SIGNEDUNARY '-' number ) | '+' number2= number -> ^( SIGNEDUNARY '+' number ) );
	public final ExpressionParser.signedUnaryExpression_return signedUnaryExpression() throws RecognitionException {
		ExpressionParser.signedUnaryExpression_return retval = new ExpressionParser.signedUnaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal20=null;
		Token char_literal21=null;
		ParserRuleReturnScope number1 =null;
		ParserRuleReturnScope number2 =null;

		CommonTree char_literal20_tree=null;
		CommonTree char_literal21_tree=null;
		RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
		RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
		RewriteRuleSubtreeStream stream_number=new RewriteRuleSubtreeStream(adaptor,"rule number");


			retval.signedUnaryExpression = new SignedUnaryExpression();

		try {
			// Expression.g:193:3: ( '-' number1= number -> ^( SIGNEDUNARY '-' number ) | '+' number2= number -> ^( SIGNEDUNARY '+' number ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==21) ) {
				alt9=1;
			}
			else if ( (LA9_0==20) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// Expression.g:193:5: '-' number1= number
					{
					char_literal20=(Token)match(input,21,FOLLOW_21_in_signedUnaryExpression575);  
					stream_21.add(char_literal20);

					pushFollow(FOLLOW_number_in_signedUnaryExpression581);
					number1=number();
					state._fsp--;

					stream_number.add(number1.getTree());

					  		retval.signedUnaryExpression.setValue((number1!=null?((ExpressionParser.number_return)number1).value:0.0));
					  		retval.signedUnaryExpression.setSign("-");
					 
					// AST REWRITE
					// elements: 21, number
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 196:4: -> ^( SIGNEDUNARY '-' number )
					{
						// Expression.g:196:7: ^( SIGNEDUNARY '-' number )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNEDUNARY, "SIGNEDUNARY"), root_1);
						adaptor.addChild(root_1, stream_21.nextNode());
						adaptor.addChild(root_1, stream_number.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Expression.g:198:5: '+' number2= number
					{
					char_literal21=(Token)match(input,20,FOLLOW_20_in_signedUnaryExpression601);  
					stream_20.add(char_literal21);

					pushFollow(FOLLOW_number_in_signedUnaryExpression607);
					number2=number();
					state._fsp--;

					stream_number.add(number2.getTree());

					  		retval.signedUnaryExpression.setValue((number2!=null?((ExpressionParser.number_return)number2).value:0.0));
					  		retval.signedUnaryExpression.setSign("+");
					 
					// AST REWRITE
					// elements: number, 20
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 201:4: -> ^( SIGNEDUNARY '+' number )
					{
						// Expression.g:201:7: ^( SIGNEDUNARY '+' number )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNEDUNARY, "SIGNEDUNARY"), root_1);
						adaptor.addChild(root_1, stream_20.nextNode());
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
	// Expression.g:205:1: number returns [double value] : digit1= NUMERIC ;
	public final ExpressionParser.number_return number() throws RecognitionException {
		ExpressionParser.number_return retval = new ExpressionParser.number_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token digit1=null;

		CommonTree digit1_tree=null;

		try {
			// Expression.g:206:3: (digit1= NUMERIC )
			// Expression.g:206:6: digit1= NUMERIC
			{
			root_0 = (CommonTree)adaptor.nil();


			digit1=(Token)match(input,NUMERIC,FOLLOW_NUMERIC_in_number644); 
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



	public static final BitSet FOLLOW_ID_in_expression124 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_expression126 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_expressions_in_expression132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalExpression_in_expressions169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationalExpression_in_logicalExpression207 = new BitSet(new long[]{0x0000000040010002L});
	public static final BitSet FOLLOW_16_in_logicalExpression220 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_30_in_logicalExpression226 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_relationalExpression_in_logicalExpression243 = new BitSet(new long[]{0x0000000040010002L});
	public static final BitSet FOLLOW_arithmeticExpression_in_relationalExpression287 = new BitSet(new long[]{0x000000001DB24C02L});
	public static final BitSet FOLLOW_26_in_relationalExpression300 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_14_in_relationalExpression306 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_27_in_relationalExpression312 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_23_in_relationalExpression318 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_24_in_relationalExpression324 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_28_in_relationalExpression330 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_arithmeticExpression_in_relationalExpression346 = new BitSet(new long[]{0x000000001DB24C02L});
	public static final BitSet FOLLOW_atom_in_arithmeticExpression390 = new BitSet(new long[]{0x0000000020788002L});
	public static final BitSet FOLLOW_20_in_arithmeticExpression402 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_21_in_arithmeticExpression409 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_22_in_arithmeticExpression415 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_19_in_arithmeticExpression421 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_15_in_arithmeticExpression427 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_29_in_arithmeticExpression433 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_atom_in_arithmeticExpression450 = new BitSet(new long[]{0x0000000020788002L});
	public static final BitSet FOLLOW_atomicExpression_in_atom485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signedUnaryExpression_in_atom497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_atom505 = new BitSet(new long[]{0x0000000000320C00L});
	public static final BitSet FOLLOW_expressions_in_atom511 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_atom515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_atomicExpression543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atomicExpression551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_signedUnaryExpression575 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_number_in_signedUnaryExpression581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_signedUnaryExpression601 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_number_in_signedUnaryExpression607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERIC_in_number644 = new BitSet(new long[]{0x0000000000000002L});
}
