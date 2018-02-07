// $ANTLR 3.5.2 Expression.g 2018-02-08 01:25:11

  package com.logpoint.libquery.grammar;
    import java.util.LinkedList;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExpressionLexer extends Lexer {
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

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:20:7: ( '!=' )
			// Expression.g:20:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:21:7: ( '%' )
			// Expression.g:21:9: '%'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:22:7: ( '&&' )
			// Expression.g:22:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:27:7: ( '<' )
			// Expression.g:27:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:28:7: ( '<=' )
			// Expression.g:28:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:29:7: ( '=' )
			// Expression.g:29:9: '='
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:30:7: ( '==' )
			// Expression.g:30:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:31:7: ( '>' )
			// Expression.g:31:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:32:7: ( '>=' )
			// Expression.g:32:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:33:7: ( '^' )
			// Expression.g:33:9: '^'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:34:7: ( '||' )
			// Expression.g:34:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:238:5: ( 'IF' )
			// Expression.g:238:7: 'IF'
			{
			match("IF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:239:7: ( 'CASE' )
			// Expression.g:239:9: 'CASE'
			{
			match("CASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:240:9: ( 'DEFAULT' )
			// Expression.g:240:11: 'DEFAULT'
			{
			match("DEFAULT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT"

	// $ANTLR start "LPARAM"
	public final void mLPARAM() throws RecognitionException {
		try {
			int _type = LPARAM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:241:9: ( '(' )
			// Expression.g:241:11: '('
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
	// $ANTLR end "LPARAM"

	// $ANTLR start "RPARAM"
	public final void mRPARAM() throws RecognitionException {
		try {
			int _type = RPARAM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:242:9: ( ')' )
			// Expression.g:242:11: ')'
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
	// $ANTLR end "RPARAM"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:243:9: ( ',' )
			// Expression.g:243:11: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:246:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '?' | '\"' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '?' | '\"' | DIGIT )* )
			// Expression.g:246:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '?' | '\"' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '?' | '\"' | DIGIT )*
			{
			if ( input.LA(1)=='\"'||input.LA(1)=='.'||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Expression.g:246:52: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '?' | '\"' | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\"'||LA1_0=='.'||(LA1_0 >= '0' && LA1_0 <= '9')||LA1_0=='?'||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Expression.g:
					{
					if ( input.LA(1)=='\"'||input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

	// $ANTLR start "NUMERIC"
	public final void mNUMERIC() throws RecognitionException {
		try {
			int _type = NUMERIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:250:3: ( ( DIGIT )+ '.' ( DIGIT )+ ( EXPONENT )? | ( '.' )? ( DIGIT )+ ( EXPONENT )? )
			int alt8=2;
			alt8 = dfa8.predict(input);
			switch (alt8) {
				case 1 :
					// Expression.g:250:6: ( DIGIT )+ '.' ( DIGIT )+ ( EXPONENT )?
					{
					// Expression.g:250:6: ( DIGIT )+
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

					match('.'); 
					// Expression.g:250:17: ( DIGIT )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
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
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					// Expression.g:250:24: ( EXPONENT )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='E'||LA4_0=='e') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// Expression.g:250:24: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// Expression.g:251:6: ( '.' )? ( DIGIT )+ ( EXPONENT )?
					{
					// Expression.g:251:6: ( '.' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='.') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Expression.g:251:6: '.'
							{
							match('.'); 
							}
							break;

					}

					// Expression.g:251:11: ( DIGIT )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
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
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// Expression.g:251:18: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// Expression.g:251:18: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERIC"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// Expression.g:257:3: ( ( 'e' | 'E' ) ( '+' | '-' )? ( DIGIT )+ )
			// Expression.g:257:6: ( 'e' | 'E' ) ( '+' | '-' )? ( DIGIT )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Expression.g:257:18: ( '+' | '-' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='+'||LA9_0=='-') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Expression.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// Expression.g:257:31: ( DIGIT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
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
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// Expression.g:262:3: ( '0' .. '9' )
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
			// Expression.g:264:5: ( ( ' ' | '\\t' )+ )
			// Expression.g:264:9: ( ' ' | '\\t' )+
			{
			// Expression.g:264:9: ( ' ' | '\\t' )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='\t'||LA11_0==' ') ) {
					alt11=1;
				}

				switch (alt11) {
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
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
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
		// Expression.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | IF | CASE | DEFAULT | LPARAM | RPARAM | COMMA | ID | NUMERIC | WS )
		int alt12=24;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// Expression.g:1:10: T__20
				{
				mT__20(); 

				}
				break;
			case 2 :
				// Expression.g:1:16: T__21
				{
				mT__21(); 

				}
				break;
			case 3 :
				// Expression.g:1:22: T__22
				{
				mT__22(); 

				}
				break;
			case 4 :
				// Expression.g:1:28: T__23
				{
				mT__23(); 

				}
				break;
			case 5 :
				// Expression.g:1:34: T__24
				{
				mT__24(); 

				}
				break;
			case 6 :
				// Expression.g:1:40: T__25
				{
				mT__25(); 

				}
				break;
			case 7 :
				// Expression.g:1:46: T__26
				{
				mT__26(); 

				}
				break;
			case 8 :
				// Expression.g:1:52: T__27
				{
				mT__27(); 

				}
				break;
			case 9 :
				// Expression.g:1:58: T__28
				{
				mT__28(); 

				}
				break;
			case 10 :
				// Expression.g:1:64: T__29
				{
				mT__29(); 

				}
				break;
			case 11 :
				// Expression.g:1:70: T__30
				{
				mT__30(); 

				}
				break;
			case 12 :
				// Expression.g:1:76: T__31
				{
				mT__31(); 

				}
				break;
			case 13 :
				// Expression.g:1:82: T__32
				{
				mT__32(); 

				}
				break;
			case 14 :
				// Expression.g:1:88: T__33
				{
				mT__33(); 

				}
				break;
			case 15 :
				// Expression.g:1:94: T__34
				{
				mT__34(); 

				}
				break;
			case 16 :
				// Expression.g:1:100: IF
				{
				mIF(); 

				}
				break;
			case 17 :
				// Expression.g:1:103: CASE
				{
				mCASE(); 

				}
				break;
			case 18 :
				// Expression.g:1:108: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 19 :
				// Expression.g:1:116: LPARAM
				{
				mLPARAM(); 

				}
				break;
			case 20 :
				// Expression.g:1:123: RPARAM
				{
				mRPARAM(); 

				}
				break;
			case 21 :
				// Expression.g:1:130: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 22 :
				// Expression.g:1:136: ID
				{
				mID(); 

				}
				break;
			case 23 :
				// Expression.g:1:139: NUMERIC
				{
				mNUMERIC(); 

				}
				break;
			case 24 :
				// Expression.g:1:147: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA8_eotS =
		"\1\uffff\1\2\2\uffff";
	static final String DFA8_eofS =
		"\4\uffff";
	static final String DFA8_minS =
		"\2\56\2\uffff";
	static final String DFA8_maxS =
		"\2\71\2\uffff";
	static final String DFA8_acceptS =
		"\2\uffff\1\2\1\1";
	static final String DFA8_specialS =
		"\4\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "249:1: NUMERIC : ( ( DIGIT )+ '.' ( DIGIT )+ ( EXPONENT )? | ( '.' )? ( DIGIT )+ ( EXPONENT )? );";
		}
	}

	static final String DFA12_eotS =
		"\10\uffff\1\30\1\32\1\34\2\uffff\3\25\3\uffff\1\25\11\uffff\1\41\3\25"+
		"\1\uffff\3\25\1\50\2\25\1\uffff\2\25\1\54\1\uffff";
	static final String DFA12_eofS =
		"\55\uffff";
	static final String DFA12_minS =
		"\1\11\7\uffff\3\75\2\uffff\1\106\1\101\1\105\3\uffff\1\60\11\uffff\1\42"+
		"\1\123\1\106\1\60\1\uffff\1\105\1\101\1\53\1\42\1\125\1\60\1\uffff\1\114"+
		"\1\124\1\42\1\uffff";
	static final String DFA12_maxS =
		"\1\174\7\uffff\3\75\2\uffff\1\106\1\101\1\105\3\uffff\1\71\11\uffff\1"+
		"\172\1\123\1\106\1\145\1\uffff\1\105\1\101\1\71\1\172\1\125\1\71\1\uffff"+
		"\1\114\1\124\1\172\1\uffff";
	static final String DFA12_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff\1\16\1\17\3\uffff\1\23\1"+
		"\24\1\25\1\uffff\1\27\1\26\1\30\1\11\1\10\1\13\1\12\1\15\1\14\4\uffff"+
		"\1\20\6\uffff\1\21\3\uffff\1\22";
	static final String DFA12_specialS =
		"\55\uffff}>";
	static final String[] DFA12_transitionS = {
			"\1\26\26\uffff\1\26\1\1\1\25\2\uffff\1\2\1\3\1\uffff\1\20\1\21\1\4\1"+
			"\5\1\22\1\6\1\23\1\7\12\24\2\uffff\1\10\1\11\1\12\1\25\1\uffff\2\25\1"+
			"\16\1\17\4\25\1\15\21\25\3\uffff\1\13\1\25\1\uffff\32\25\1\uffff\1\14",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\27",
			"\1\31",
			"\1\33",
			"",
			"",
			"\1\35",
			"\1\36",
			"\1\37",
			"",
			"",
			"",
			"\12\40",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\25\13\uffff\1\25\1\uffff\12\25\5\uffff\1\25\1\uffff\32\25\4\uffff"+
			"\1\25\1\uffff\32\25",
			"\1\42",
			"\1\43",
			"\12\40\13\uffff\1\44\37\uffff\1\44",
			"",
			"\1\45",
			"\1\46",
			"\1\24\1\uffff\1\24\2\uffff\12\47",
			"\1\25\13\uffff\1\25\1\uffff\12\25\5\uffff\1\25\1\uffff\32\25\4\uffff"+
			"\1\25\1\uffff\32\25",
			"\1\51",
			"\12\47",
			"",
			"\1\52",
			"\1\53",
			"\1\25\13\uffff\1\25\1\uffff\12\25\5\uffff\1\25\1\uffff\32\25\4\uffff"+
			"\1\25\1\uffff\32\25",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | IF | CASE | DEFAULT | LPARAM | RPARAM | COMMA | ID | NUMERIC | WS );";
		}
	}

}
