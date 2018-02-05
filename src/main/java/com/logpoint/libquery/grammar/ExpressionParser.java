// $ANTLR 3.5.2 Expression.g 2018-02-05 16:35:48

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
		"EQUALS", "FUNC", "ID", "SIGNEDUNARY", "WS", "'%'", "'('", "')'", "'*'", 
		"'+'", "'-'", "'/'", "'='", "'^'"
	};
	public static final int EOF=-1;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int CALL=4;
	public static final int CALLSIGNEDUNARY=5;
	public static final int DIGIT=6;
	public static final int EQUALS=7;
	public static final int FUNC=8;
	public static final int ID=9;
	public static final int SIGNEDUNARY=10;
	public static final int WS=11;

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
	// Expression.g:72:1: expression returns [Expression expression] : ID '=' expr= additiveExpression -> ^( EQUALS ID additiveExpression ) ;
	public final ExpressionParser.expression_return expression() throws ParseException, RecognitionException {
		ExpressionParser.expression_return retval = new ExpressionParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID1=null;
		Token char_literal2=null;
		ParserRuleReturnScope expr =null;

		CommonTree ID1_tree=null;
		CommonTree char_literal2_tree=null;
		RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_additiveExpression=new RewriteRuleSubtreeStream(adaptor,"rule additiveExpression");


			retval.expression = new BinaryArithmeticExpression();

		try {
			// Expression.g:76:2: ( ID '=' expr= additiveExpression -> ^( EQUALS ID additiveExpression ) )
			// Expression.g:76:6: ID '=' expr= additiveExpression
			{
			ID1=(Token)match(input,ID,FOLLOW_ID_in_expression129);  
			stream_ID.add(ID1);

			char_literal2=(Token)match(input,19,FOLLOW_19_in_expression131);  
			stream_19.add(char_literal2);

			pushFollow(FOLLOW_additiveExpression_in_expression137);
			expr=additiveExpression();
			state._fsp--;

			stream_additiveExpression.add(expr.getTree());
			retval.expression = (expr!=null?((ExpressionParser.additiveExpression_return)expr).additiveExpression:null);
			// AST REWRITE
			// elements: ID, additiveExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 76:81: -> ^( EQUALS ID additiveExpression )
			{
				// Expression.g:76:84: ^( EQUALS ID additiveExpression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EQUALS, "EQUALS"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_additiveExpression.nextTree());
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


	public static class additiveExpression_return extends ParserRuleReturnScope {
		public BinaryArithmeticExpression additiveExpression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "additiveExpression"
	// Expression.g:79:1: additiveExpression returns [BinaryArithmeticExpression additiveExpression] : (expr1= multiplicativeExpression ) ( ( '+' | '-' ) ^ (expr2= multiplicativeExpression ) )* ;
	public final ExpressionParser.additiveExpression_return additiveExpression() throws RecognitionException {
		ExpressionParser.additiveExpression_return retval = new ExpressionParser.additiveExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal3=null;
		Token char_literal4=null;
		ParserRuleReturnScope expr1 =null;
		ParserRuleReturnScope expr2 =null;

		CommonTree char_literal3_tree=null;
		CommonTree char_literal4_tree=null;


			retval.additiveExpression = new BinaryArithmeticExpression();
			List<Expression<Double>> expressions = new ArrayList<Expression<Double>>();

		try {
			// Expression.g:88:2: ( (expr1= multiplicativeExpression ) ( ( '+' | '-' ) ^ (expr2= multiplicativeExpression ) )* )
			// Expression.g:88:6: (expr1= multiplicativeExpression ) ( ( '+' | '-' ) ^ (expr2= multiplicativeExpression ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// Expression.g:88:6: (expr1= multiplicativeExpression )
			// Expression.g:88:7: expr1= multiplicativeExpression
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression185);
			expr1=multiplicativeExpression();
			state._fsp--;

			adaptor.addChild(root_0, expr1.getTree());


							expressions.add((expr1!=null?((ExpressionParser.multiplicativeExpression_return)expr1).multiplicativeExpression:null));
						
			}

			// Expression.g:91:5: ( ( '+' | '-' ) ^ (expr2= multiplicativeExpression ) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 16 && LA2_0 <= 17)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Expression.g:91:6: ( '+' | '-' ) ^ (expr2= multiplicativeExpression )
					{
					// Expression.g:91:6: ( '+' | '-' )
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==16) ) {
						alt1=1;
					}
					else if ( (LA1_0==17) ) {
						alt1=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}

					switch (alt1) {
						case 1 :
							// Expression.g:91:7: '+'
							{
							char_literal3=(Token)match(input,16,FOLLOW_16_in_additiveExpression195); 
							char_literal3_tree = (CommonTree)adaptor.create(char_literal3);
							adaptor.addChild(root_0, char_literal3_tree);

							retval.additiveExpression.setOperator('+');
							}
							break;
						case 2 :
							// Expression.g:91:51: '-'
							{
							char_literal4=(Token)match(input,17,FOLLOW_17_in_additiveExpression199); 
							char_literal4_tree = (CommonTree)adaptor.create(char_literal4);
							adaptor.addChild(root_0, char_literal4_tree);

							retval.additiveExpression.setOperator('-');
							}
							break;

					}

					// Expression.g:91:96: (expr2= multiplicativeExpression )
					// Expression.g:91:97: expr2= multiplicativeExpression
					{
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression209);
					expr2=multiplicativeExpression();
					state._fsp--;

					adaptor.addChild(root_0, expr2.getTree());


									expressions.add((expr2!=null?((ExpressionParser.multiplicativeExpression_return)expr2).multiplicativeExpression:null));
								
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


				retval.additiveExpression.setExpressions(expressions);

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
	// $ANTLR end "additiveExpression"


	public static class multiplicativeExpression_return extends ParserRuleReturnScope {
		public BinaryArithmeticExpression multiplicativeExpression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiplicativeExpression"
	// Expression.g:96:1: multiplicativeExpression returns [BinaryArithmeticExpression multiplicativeExpression] : (expr1= atom ) ( ( '*' | '/' | '%' | '^' ) ^ (expr2= atom ) )* ;
	public final ExpressionParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		ExpressionParser.multiplicativeExpression_return retval = new ExpressionParser.multiplicativeExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal5=null;
		Token char_literal6=null;
		Token char_literal7=null;
		Token char_literal8=null;
		ParserRuleReturnScope expr1 =null;
		ParserRuleReturnScope expr2 =null;

		CommonTree char_literal5_tree=null;
		CommonTree char_literal6_tree=null;
		CommonTree char_literal7_tree=null;
		CommonTree char_literal8_tree=null;


			retval.multiplicativeExpression = new BinaryArithmeticExpression();
			List<Expression<Double>> expressions = new ArrayList<Expression<Double>>();

		try {
			// Expression.g:105:5: ( (expr1= atom ) ( ( '*' | '/' | '%' | '^' ) ^ (expr2= atom ) )* )
			// Expression.g:105:9: (expr1= atom ) ( ( '*' | '/' | '%' | '^' ) ^ (expr2= atom ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// Expression.g:105:9: (expr1= atom )
			// Expression.g:105:10: expr1= atom
			{
			pushFollow(FOLLOW_atom_in_multiplicativeExpression253);
			expr1=atom();
			state._fsp--;

			adaptor.addChild(root_0, expr1.getTree());


			    				expressions.add((expr1!=null?((ExpressionParser.atom_return)expr1).expression:null));
			    			
			}

			// Expression.g:108:9: ( ( '*' | '/' | '%' | '^' ) ^ (expr2= atom ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==12||LA4_0==15||LA4_0==18||LA4_0==20) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Expression.g:108:10: ( '*' | '/' | '%' | '^' ) ^ (expr2= atom )
					{
					// Expression.g:108:10: ( '*' | '/' | '%' | '^' )
					int alt3=4;
					switch ( input.LA(1) ) {
					case 15:
						{
						alt3=1;
						}
						break;
					case 18:
						{
						alt3=2;
						}
						break;
					case 12:
						{
						alt3=3;
						}
						break;
					case 20:
						{
						alt3=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}
					switch (alt3) {
						case 1 :
							// Expression.g:108:11: '*'
							{
							char_literal5=(Token)match(input,15,FOLLOW_15_in_multiplicativeExpression267); 
							char_literal5_tree = (CommonTree)adaptor.create(char_literal5);
							adaptor.addChild(root_0, char_literal5_tree);

							retval.multiplicativeExpression.setOperator('*');
							}
							break;
						case 2 :
							// Expression.g:108:60: '/'
							{
							char_literal6=(Token)match(input,18,FOLLOW_18_in_multiplicativeExpression270); 
							char_literal6_tree = (CommonTree)adaptor.create(char_literal6);
							adaptor.addChild(root_0, char_literal6_tree);

							retval.multiplicativeExpression.setOperator('/');
							}
							break;
						case 3 :
							// Expression.g:108:109: '%'
							{
							char_literal7=(Token)match(input,12,FOLLOW_12_in_multiplicativeExpression273); 
							char_literal7_tree = (CommonTree)adaptor.create(char_literal7);
							adaptor.addChild(root_0, char_literal7_tree);

							retval.multiplicativeExpression.setOperator('%');
							}
							break;
						case 4 :
							// Expression.g:108:159: '^'
							{
							char_literal8=(Token)match(input,20,FOLLOW_20_in_multiplicativeExpression276); 
							char_literal8_tree = (CommonTree)adaptor.create(char_literal8);
							adaptor.addChild(root_0, char_literal8_tree);

							retval.multiplicativeExpression.setOperator('^');
							}
							break;

					}

					// Expression.g:108:210: (expr2= atom )
					// Expression.g:108:211: expr2= atom
					{
					pushFollow(FOLLOW_atom_in_multiplicativeExpression286);
					expr2=atom();
					state._fsp--;

					adaptor.addChild(root_0, expr2.getTree());


					    				expressions.add((expr2!=null?((ExpressionParser.atom_return)expr2).expression:null));
					    		
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


				retval.multiplicativeExpression.setExpressions(expressions);

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
	// $ANTLR end "multiplicativeExpression"


	public static class atom_return extends ParserRuleReturnScope {
		public Expression<Double> expression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// Expression.g:113:1: atom returns [Expression<Double> expression] : (number1= unsignedUnaryExpression |number2= signedUnaryExpression | '(' expr= additiveExpression ')' );
	public final ExpressionParser.atom_return atom() throws RecognitionException {
		ExpressionParser.atom_return retval = new ExpressionParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal9=null;
		Token char_literal10=null;
		ParserRuleReturnScope number1 =null;
		ParserRuleReturnScope number2 =null;
		ParserRuleReturnScope expr =null;

		CommonTree char_literal9_tree=null;
		CommonTree char_literal10_tree=null;

		try {
			// Expression.g:114:3: (number1= unsignedUnaryExpression |number2= signedUnaryExpression | '(' expr= additiveExpression ')' )
			int alt5=3;
			switch ( input.LA(1) ) {
			case DIGIT:
			case ID:
				{
				alt5=1;
				}
				break;
			case 16:
			case 17:
				{
				alt5=2;
				}
				break;
			case 13:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// Expression.g:114:5: number1= unsignedUnaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unsignedUnaryExpression_in_atom318);
					number1=unsignedUnaryExpression();
					state._fsp--;

					adaptor.addChild(root_0, number1.getTree());

					retval.expression = (number1!=null?((ExpressionParser.unsignedUnaryExpression_return)number1).unsignedUnaryExpression:null);
					}
					break;
				case 2 :
					// Expression.g:115:5: number2= signedUnaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_signedUnaryExpression_in_atom330);
					number2=signedUnaryExpression();
					state._fsp--;

					adaptor.addChild(root_0, number2.getTree());

					retval.expression = (number2!=null?((ExpressionParser.signedUnaryExpression_return)number2).signedUnaryExpression:null);
					}
					break;
				case 3 :
					// Expression.g:116:5: '(' expr= additiveExpression ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal9=(Token)match(input,13,FOLLOW_13_in_atom338); 
					char_literal9_tree = (CommonTree)adaptor.create(char_literal9);
					adaptor.addChild(root_0, char_literal9_tree);

					pushFollow(FOLLOW_additiveExpression_in_atom344);
					expr=additiveExpression();
					state._fsp--;

					adaptor.addChild(root_0, expr.getTree());

					retval.expression = (expr!=null?((ExpressionParser.additiveExpression_return)expr).additiveExpression:null);
					char_literal10=(Token)match(input,14,FOLLOW_14_in_atom348); 
					char_literal10_tree = (CommonTree)adaptor.create(char_literal10);
					adaptor.addChild(root_0, char_literal10_tree);

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


	public static class unsignedUnaryExpression_return extends ParserRuleReturnScope {
		public UnsignedUnaryExpression unsignedUnaryExpression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unsignedUnaryExpression"
	// Expression.g:119:1: unsignedUnaryExpression returns [UnsignedUnaryExpression unsignedUnaryExpression] : (number1= number | ID );
	public final ExpressionParser.unsignedUnaryExpression_return unsignedUnaryExpression() throws RecognitionException {
		ExpressionParser.unsignedUnaryExpression_return retval = new ExpressionParser.unsignedUnaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID11=null;
		ParserRuleReturnScope number1 =null;

		CommonTree ID11_tree=null;


			retval.unsignedUnaryExpression = new UnsignedUnaryExpression();

		try {
			// Expression.g:123:3: (number1= number | ID )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==DIGIT) ) {
				alt6=1;
			}
			else if ( (LA6_0==ID) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// Expression.g:123:5: number1= number
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_number_in_unsignedUnaryExpression376);
					number1=number();
					state._fsp--;

					adaptor.addChild(root_0, number1.getTree());


					 		retval.unsignedUnaryExpression.setValue((number1!=null?((ExpressionParser.number_return)number1).value:0.0));

					}
					break;
				case 2 :
					// Expression.g:127:5: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					ID11=(Token)match(input,ID,FOLLOW_ID_in_unsignedUnaryExpression385); 
					ID11_tree = (CommonTree)adaptor.create(ID11);
					adaptor.addChild(root_0, ID11_tree);



					      if(getRow().containsKey((ID11!=null?ID11.getText():null))) {
					        retval.unsignedUnaryExpression.setValue((double)((Integer)getRow().get((ID11!=null?ID11.getText():null))).intValue());
					      } else {
					        addErrorMessage((ID11!=null?ID11.getLine():0),ID11.getCharPositionInLine(),"unable to resolve value for '"+ (ID11!=null?ID11.getText():null)+"'");
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
	// $ANTLR end "unsignedUnaryExpression"


	public static class signedUnaryExpression_return extends ParserRuleReturnScope {
		public SignedUnaryExpression signedUnaryExpression;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "signedUnaryExpression"
	// Expression.g:137:1: signedUnaryExpression returns [SignedUnaryExpression signedUnaryExpression] : ( '-' number1= number -> ^( SIGNEDUNARY '-' number ) | '+' number2= number -> ^( SIGNEDUNARY '+' number ) );
	public final ExpressionParser.signedUnaryExpression_return signedUnaryExpression() throws RecognitionException {
		ExpressionParser.signedUnaryExpression_return retval = new ExpressionParser.signedUnaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal12=null;
		Token char_literal13=null;
		ParserRuleReturnScope number1 =null;
		ParserRuleReturnScope number2 =null;

		CommonTree char_literal12_tree=null;
		CommonTree char_literal13_tree=null;
		RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
		RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
		RewriteRuleSubtreeStream stream_number=new RewriteRuleSubtreeStream(adaptor,"rule number");


			retval.signedUnaryExpression = new SignedUnaryExpression();

		try {
			// Expression.g:141:3: ( '-' number1= number -> ^( SIGNEDUNARY '-' number ) | '+' number2= number -> ^( SIGNEDUNARY '+' number ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==17) ) {
				alt7=1;
			}
			else if ( (LA7_0==16) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// Expression.g:141:5: '-' number1= number
					{
					char_literal12=(Token)match(input,17,FOLLOW_17_in_signedUnaryExpression411);  
					stream_17.add(char_literal12);

					pushFollow(FOLLOW_number_in_signedUnaryExpression417);
					number1=number();
					state._fsp--;

					stream_number.add(number1.getTree());

					  		retval.signedUnaryExpression.setValue((number1!=null?((ExpressionParser.number_return)number1).value:0.0));
					  		retval.signedUnaryExpression.setSign("-");
					 
					// AST REWRITE
					// elements: number, 17
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 144:4: -> ^( SIGNEDUNARY '-' number )
					{
						// Expression.g:144:7: ^( SIGNEDUNARY '-' number )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNEDUNARY, "SIGNEDUNARY"), root_1);
						adaptor.addChild(root_1, stream_17.nextNode());
						adaptor.addChild(root_1, stream_number.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Expression.g:146:5: '+' number2= number
					{
					char_literal13=(Token)match(input,16,FOLLOW_16_in_signedUnaryExpression437);  
					stream_16.add(char_literal13);

					pushFollow(FOLLOW_number_in_signedUnaryExpression443);
					number2=number();
					state._fsp--;

					stream_number.add(number2.getTree());

					  		retval.signedUnaryExpression.setValue((number2!=null?((ExpressionParser.number_return)number2).value:0.0));
					  		retval.signedUnaryExpression.setSign("+");
					 
					// AST REWRITE
					// elements: 16, number
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 149:4: -> ^( SIGNEDUNARY '+' number )
					{
						// Expression.g:149:7: ^( SIGNEDUNARY '+' number )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNEDUNARY, "SIGNEDUNARY"), root_1);
						adaptor.addChild(root_1, stream_16.nextNode());
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
	// Expression.g:153:1: number returns [double value] : digit1= DIGIT ;
	public final ExpressionParser.number_return number() throws RecognitionException {
		ExpressionParser.number_return retval = new ExpressionParser.number_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token digit1=null;

		CommonTree digit1_tree=null;

		try {
			// Expression.g:154:3: (digit1= DIGIT )
			// Expression.g:154:6: digit1= DIGIT
			{
			root_0 = (CommonTree)adaptor.nil();


			digit1=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_number480); 
			digit1_tree = (CommonTree)adaptor.create(digit1);
			adaptor.addChild(root_0, digit1_tree);

			retval.value = (double)Integer.parseInt((digit1!=null?digit1.getText():null));
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



	public static final BitSet FOLLOW_ID_in_expression129 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_expression131 = new BitSet(new long[]{0x0000000000032240L});
	public static final BitSet FOLLOW_additiveExpression_in_expression137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression185 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_16_in_additiveExpression195 = new BitSet(new long[]{0x0000000000032240L});
	public static final BitSet FOLLOW_17_in_additiveExpression199 = new BitSet(new long[]{0x0000000000032240L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression209 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_atom_in_multiplicativeExpression253 = new BitSet(new long[]{0x0000000000149002L});
	public static final BitSet FOLLOW_15_in_multiplicativeExpression267 = new BitSet(new long[]{0x0000000000032240L});
	public static final BitSet FOLLOW_18_in_multiplicativeExpression270 = new BitSet(new long[]{0x0000000000032240L});
	public static final BitSet FOLLOW_12_in_multiplicativeExpression273 = new BitSet(new long[]{0x0000000000032240L});
	public static final BitSet FOLLOW_20_in_multiplicativeExpression276 = new BitSet(new long[]{0x0000000000032240L});
	public static final BitSet FOLLOW_atom_in_multiplicativeExpression286 = new BitSet(new long[]{0x0000000000149002L});
	public static final BitSet FOLLOW_unsignedUnaryExpression_in_atom318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signedUnaryExpression_in_atom330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_atom338 = new BitSet(new long[]{0x0000000000032240L});
	public static final BitSet FOLLOW_additiveExpression_in_atom344 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_atom348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_unsignedUnaryExpression376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_unsignedUnaryExpression385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_signedUnaryExpression411 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_number_in_signedUnaryExpression417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_signedUnaryExpression437 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_number_in_signedUnaryExpression443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGIT_in_number480 = new BitSet(new long[]{0x0000000000000002L});
}
