// $ANTLR 3.5.2 Expression.g 2018-02-05 16:35:49

	package com.logpoint.libquery.grammar;
    import java.util.LinkedList;
                


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExpressionLexer extends Lexer {
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


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExpressionLexer() {} 
	public ExpressionLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExpressionLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Expression.g"; }

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:20:7: ( '%' )
			// Expression.g:20:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:21:7: ( '(' )
			// Expression.g:21:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:22:7: ( ')' )
			// Expression.g:22:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:23:7: ( '*' )
			// Expression.g:23:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:24:7: ( '+' )
			// Expression.g:24:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:25:7: ( '-' )
			// Expression.g:25:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:26:7: ( '/' )
			// Expression.g:26:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:27:7: ( '=' )
			// Expression.g:27:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:28:7: ( '^' )
			// Expression.g:28:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:158:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '?' | '\"' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '?' | '\"' | DIGIT )* )
			// Expression.g:158:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '?' | '\"' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '?' | '\"' | DIGIT )*
			{
			if ( input.LA(1)=='\"'||input.LA(1)=='.'||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Expression.g:158:52: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '?' | '\"' | DIGIT )*
			loop1:
			while (true) {
				int alt1=8;
				switch ( input.LA(1) ) {
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt1=1;
					}
					break;
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					{
					alt1=2;
					}
					break;
				case '_':
					{
					alt1=3;
					}
					break;
				case '.':
					{
					alt1=4;
					}
					break;
				case '?':
					{
					alt1=5;
					}
					break;
				case '\"':
					{
					alt1=6;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					{
					alt1=7;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// Expression.g:158:53: 'a' .. 'z'
					{
					matchRange('a','z'); 
					}
					break;
				case 2 :
					// Expression.g:158:64: 'A' .. 'Z'
					{
					matchRange('A','Z'); 
					}
					break;
				case 3 :
					// Expression.g:158:75: '_'
					{
					match('_'); 
					}
					break;
				case 4 :
					// Expression.g:158:81: '.'
					{
					match('.'); 
					}
					break;
				case 5 :
					// Expression.g:158:87: '?'
					{
					match('?'); 
					}
					break;
				case 6 :
					// Expression.g:158:93: '\"'
					{
					match('\"'); 
					}
					break;
				case 7 :
					// Expression.g:158:98: DIGIT
					{
					mDIGIT(); 

					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			int _type = DIGIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:162:3: ( ( '0' .. '9' )+ )
			// Expression.g:162:6: ( '0' .. '9' )+
			{
			// Expression.g:162:6: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Expression.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:165:5: ( ( ' ' | '\\t' )+ )
			// Expression.g:165:9: ( ' ' | '\\t' )+
			{
			// Expression.g:165:9: ( ' ' | '\\t' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='\t'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Expression.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// Expression.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | ID | DIGIT | WS )
		int alt4=12;
		switch ( input.LA(1) ) {
		case '%':
			{
			alt4=1;
			}
			break;
		case '(':
			{
			alt4=2;
			}
			break;
		case ')':
			{
			alt4=3;
			}
			break;
		case '*':
			{
			alt4=4;
			}
			break;
		case '+':
			{
			alt4=5;
			}
			break;
		case '-':
			{
			alt4=6;
			}
			break;
		case '/':
			{
			alt4=7;
			}
			break;
		case '=':
			{
			alt4=8;
			}
			break;
		case '^':
			{
			alt4=9;
			}
			break;
		case '\"':
		case '.':
		case '?':
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=10;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=11;
			}
			break;
		case '\t':
		case ' ':
			{
			alt4=12;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// Expression.g:1:10: T__12
				{
				mT__12(); 

				}
				break;
			case 2 :
				// Expression.g:1:16: T__13
				{
				mT__13(); 

				}
				break;
			case 3 :
				// Expression.g:1:22: T__14
				{
				mT__14(); 

				}
				break;
			case 4 :
				// Expression.g:1:28: T__15
				{
				mT__15(); 

				}
				break;
			case 5 :
				// Expression.g:1:34: T__16
				{
				mT__16(); 

				}
				break;
			case 6 :
				// Expression.g:1:40: T__17
				{
				mT__17(); 

				}
				break;
			case 7 :
				// Expression.g:1:46: T__18
				{
				mT__18(); 

				}
				break;
			case 8 :
				// Expression.g:1:52: T__19
				{
				mT__19(); 

				}
				break;
			case 9 :
				// Expression.g:1:58: T__20
				{
				mT__20(); 

				}
				break;
			case 10 :
				// Expression.g:1:64: ID
				{
				mID(); 

				}
				break;
			case 11 :
				// Expression.g:1:67: DIGIT
				{
				mDIGIT(); 

				}
				break;
			case 12 :
				// Expression.g:1:73: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
