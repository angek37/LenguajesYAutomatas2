import java_cup.runtime.Symbol;


class Yylex implements java_cup.runtime.Scanner {
	private final int YY_BUFFER_SIZE = 512;
	private final int YY_F = -1;
	private final int YY_NO_STATE = -1;
	private final int YY_NOT_ACCEPT = 0;
	private final int YY_START = 1;
	private final int YY_END = 2;
	private final int YY_NO_ANCHOR = 4;
	private final int YY_BOL = 256;
	private final int YY_EOF = 257;

  public static int linea = 1;
  public static int pos = 0;
	private java.io.BufferedReader yy_reader;
	private int yy_buffer_index;
	private int yy_buffer_read;
	private int yy_buffer_start;
	private int yy_buffer_end;
	private char yy_buffer[];
	private int yychar;
	private int yyline;
	private boolean yy_at_bol;
	private int yy_lexical_state;

	Yylex (java.io.Reader reader) {
		this ();
		if (null == reader) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(reader);
	}

	Yylex (java.io.InputStream instream) {
		this ();
		if (null == instream) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream));
	}

	private Yylex () {
		yy_buffer = new char[YY_BUFFER_SIZE];
		yy_buffer_read = 0;
		yy_buffer_index = 0;
		yy_buffer_start = 0;
		yy_buffer_end = 0;
		yychar = 0;
		yyline = 0;
		yy_at_bol = true;
		yy_lexical_state = YYINITIAL;
	}

	private boolean yy_eof_done = false;
	private final int YYINITIAL = 0;
	private final int yy_state_dtrans[] = {
		0
	};
	private void yybegin (int state) {
		yy_lexical_state = state;
	}
	private int yy_advance ()
		throws java.io.IOException {
		int next_read;
		int i;
		int j;

		if (yy_buffer_index < yy_buffer_read) {
			return yy_buffer[yy_buffer_index++];
		}

		if (0 != yy_buffer_start) {
			i = yy_buffer_start;
			j = 0;
			while (i < yy_buffer_read) {
				yy_buffer[j] = yy_buffer[i];
				++i;
				++j;
			}
			yy_buffer_end = yy_buffer_end - yy_buffer_start;
			yy_buffer_start = 0;
			yy_buffer_read = j;
			yy_buffer_index = j;
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}

		while (yy_buffer_index >= yy_buffer_read) {
			if (yy_buffer_index >= yy_buffer.length) {
				yy_buffer = yy_double(yy_buffer);
			}
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}
		return yy_buffer[yy_buffer_index++];
	}
	private void yy_move_end () {
		if (yy_buffer_end > yy_buffer_start &&
		    '\n' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
		if (yy_buffer_end > yy_buffer_start &&
		    '\r' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
	}
	private boolean yy_last_was_cr=false;
	private void yy_mark_start () {
		int i;
		for (i = yy_buffer_start; i < yy_buffer_index; ++i) {
			if ('\n' == yy_buffer[i] && !yy_last_was_cr) {
				++yyline;
			}
			if ('\r' == yy_buffer[i]) {
				++yyline;
				yy_last_was_cr=true;
			} else yy_last_was_cr=false;
		}
		yychar = yychar
			+ yy_buffer_index - yy_buffer_start;
		yy_buffer_start = yy_buffer_index;
	}
	private void yy_mark_end () {
		yy_buffer_end = yy_buffer_index;
	}
	private void yy_to_mark () {
		yy_buffer_index = yy_buffer_end;
		yy_at_bol = (yy_buffer_end > yy_buffer_start) &&
		            ('\r' == yy_buffer[yy_buffer_end-1] ||
		             '\n' == yy_buffer[yy_buffer_end-1] ||
		             2028/*LS*/ == yy_buffer[yy_buffer_end-1] ||
		             2029/*PS*/ == yy_buffer[yy_buffer_end-1]);
	}
	private java.lang.String yytext () {
		return (new java.lang.String(yy_buffer,
			yy_buffer_start,
			yy_buffer_end - yy_buffer_start));
	}
	private int yylength () {
		return yy_buffer_end - yy_buffer_start;
	}
	private char[] yy_double (char buf[]) {
		int i;
		char newbuf[];
		newbuf = new char[2*buf.length];
		for (i = 0; i < buf.length; ++i) {
			newbuf[i] = buf[i];
		}
		return newbuf;
	}
	private final int YY_E_INTERNAL = 0;
	private final int YY_E_MATCH = 1;
	private java.lang.String yy_error_string[] = {
		"Error: Internal error.\n",
		"Error: Unmatched input.\n"
	};
	private void yy_error (int code,boolean fatal) {
		java.lang.System.out.print(yy_error_string[code]);
		java.lang.System.out.flush();
		if (fatal) {
			throw new Error("Fatal Error.\n");
		}
	}
	private int[][] unpackFromString(int size1, int size2, String st) {
		int colonIndex = -1;
		String lengthString;
		int sequenceLength = 0;
		int sequenceInteger = 0;

		int commaIndex;
		String workString;

		int res[][] = new int[size1][size2];
		for (int i= 0; i < size1; i++) {
			for (int j= 0; j < size2; j++) {
				if (sequenceLength != 0) {
					res[i][j] = sequenceInteger;
					sequenceLength--;
					continue;
				}
				commaIndex = st.indexOf(',');
				workString = (commaIndex==-1) ? st :
					st.substring(0, commaIndex);
				st = st.substring(commaIndex+1);
				colonIndex = workString.indexOf(':');
				if (colonIndex == -1) {
					res[i][j]=Integer.parseInt(workString);
					continue;
				}
				lengthString =
					workString.substring(colonIndex+1);
				sequenceLength=Integer.parseInt(lengthString);
				workString=workString.substring(0,colonIndex);
				sequenceInteger=Integer.parseInt(workString);
				res[i][j] = sequenceInteger;
				sequenceLength--;
			}
		}
		return res;
	}
	private int yy_acpt[] = {
		/* 0 */ YY_NOT_ACCEPT,
		/* 1 */ YY_NO_ANCHOR,
		/* 2 */ YY_NO_ANCHOR,
		/* 3 */ YY_NO_ANCHOR,
		/* 4 */ YY_NO_ANCHOR,
		/* 5 */ YY_NO_ANCHOR,
		/* 6 */ YY_NO_ANCHOR,
		/* 7 */ YY_NO_ANCHOR,
		/* 8 */ YY_NO_ANCHOR,
		/* 9 */ YY_NO_ANCHOR,
		/* 10 */ YY_NO_ANCHOR,
		/* 11 */ YY_NO_ANCHOR,
		/* 12 */ YY_NO_ANCHOR,
		/* 13 */ YY_NO_ANCHOR,
		/* 14 */ YY_NO_ANCHOR,
		/* 15 */ YY_NO_ANCHOR,
		/* 16 */ YY_NO_ANCHOR,
		/* 17 */ YY_NO_ANCHOR,
		/* 18 */ YY_NO_ANCHOR,
		/* 19 */ YY_NO_ANCHOR,
		/* 20 */ YY_NO_ANCHOR,
		/* 21 */ YY_NO_ANCHOR,
		/* 22 */ YY_NO_ANCHOR,
		/* 23 */ YY_NO_ANCHOR,
		/* 24 */ YY_NO_ANCHOR,
		/* 25 */ YY_NO_ANCHOR,
		/* 26 */ YY_NO_ANCHOR,
		/* 27 */ YY_NO_ANCHOR,
		/* 28 */ YY_NO_ANCHOR,
		/* 29 */ YY_NO_ANCHOR,
		/* 30 */ YY_NO_ANCHOR,
		/* 31 */ YY_NOT_ACCEPT,
		/* 32 */ YY_NO_ANCHOR,
		/* 33 */ YY_NO_ANCHOR,
		/* 34 */ YY_NO_ANCHOR,
		/* 35 */ YY_NO_ANCHOR,
		/* 36 */ YY_NOT_ACCEPT,
		/* 37 */ YY_NO_ANCHOR,
		/* 38 */ YY_NO_ANCHOR,
		/* 39 */ YY_NO_ANCHOR,
		/* 40 */ YY_NO_ANCHOR,
		/* 41 */ YY_NO_ANCHOR,
		/* 42 */ YY_NO_ANCHOR,
		/* 43 */ YY_NO_ANCHOR,
		/* 44 */ YY_NO_ANCHOR,
		/* 45 */ YY_NO_ANCHOR,
		/* 46 */ YY_NOT_ACCEPT,
		/* 47 */ YY_NO_ANCHOR,
		/* 48 */ YY_NO_ANCHOR,
		/* 49 */ YY_NO_ANCHOR,
		/* 50 */ YY_NO_ANCHOR,
		/* 51 */ YY_NO_ANCHOR,
		/* 52 */ YY_NO_ANCHOR,
		/* 53 */ YY_NO_ANCHOR,
		/* 54 */ YY_NO_ANCHOR,
		/* 55 */ YY_NO_ANCHOR,
		/* 56 */ YY_NO_ANCHOR,
		/* 57 */ YY_NO_ANCHOR,
		/* 58 */ YY_NO_ANCHOR,
		/* 59 */ YY_NO_ANCHOR,
		/* 60 */ YY_NO_ANCHOR,
		/* 61 */ YY_NO_ANCHOR,
		/* 62 */ YY_NO_ANCHOR,
		/* 63 */ YY_NO_ANCHOR,
		/* 64 */ YY_NO_ANCHOR
	};
	private int yy_cmap[] = unpackFromString(1,258,
"36:9,35:2,36,35:2,36:18,35,21,36:4,19,36,28,29,27,24,36,25,34,26,33,32:9,36" +
",30,23,18,22,36:2,3,7,1,16,12,31:3,8,31:2,2,31,15,17,5,31,9,4,11,6,10,31:4," +
"36:6,3,7,1,16,12,31:3,8,31:2,2,31,15,17,5,31,9,4,11,6,10,31:4,13,20,14,36:1" +
"30,0:2")[0];

	private int yy_rmap[] = unpackFromString(1,65,
"0,1,2,1:2,3,4,5,6,7,8:2,1:5,9,1:7,10,11:5,12,13,14,10,15,16,17,12,18,19,1,2" +
"0,21,22,23,18,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,11,39,40")[0];

	private int yy_nxt[][] = unpackFromString(41,37,
"1,2,62:3,63,62:2,45,62,52,62:2,3,4,62,64,62,5,6,33,7,8,9,10,11,12,13,14,15," +
"16,62,17,34,38,18,41,-1:38,62,53,62:10,-1:2,62:3,-1:13,62,54:2,-1:21,19,-1:" +
"37,20,-1:35,22,-1:36,23,-1:36,24,-1:50,25:2,31,-1:14,36,-1:19,17:2,31,-1:14" +
",36,-1:19,25:2,31,-1:3,62:12,-1:2,62:3,-1:13,62,54:2,-1:35,35:2,-1:4,62:10," +
"26,62,-1:2,62:3,-1:13,62,54:2,-1:23,21,-1:28,36,-1:19,35:2,-1:27,46:2,-1:6," +
"39:2,-1:4,62:12,-1:2,62,27,62,-1:13,62,54:2,-1:35,39:2,-1:4,62:3,28,62:8,-1" +
":2,62:3,-1:13,62,54:2,-1:4,29,62:11,-1:2,62:3,-1:13,62,54:2,-1:4,62:11,30,-" +
"1:2,62:3,-1:13,62,54:2,-1:4,62:11,29,-1:2,62:3,-1:13,62,54:2,-1:4,62:12,-1:" +
"2,32,62:2,-1:13,62,54:2,-1:4,62:7,37,62:4,-1:2,62:3,-1:13,62,54:2,-1:4,62:3" +
",40,62:8,-1:2,62:3,-1:13,62,54:2,-1:4,62:7,42,62:4,-1:2,62:3,-1:13,62,54:2," +
"-1:4,62,43,62:10,-1:2,62:3,-1:13,62,54:2,-1:4,62:10,44,62,-1:2,62:3,-1:13,6" +
"2,54:2,-1:4,62:12,-1:2,62:2,47,-1:13,62,54:2,-1:4,62:2,48,62:9,-1:2,62:3,-1" +
":13,62,54:2,-1:4,54:12,-1:2,54:3,-1:13,54:3,-1:4,62:6,58,62:5,-1:2,62:3,-1:" +
"13,62,54:2,-1:4,62:7,59,62:4,-1:2,62:3,-1:13,62,54:2,-1:4,62:5,60,62:6,-1:2" +
",62:3,-1:13,62,54:2,-1:4,62,49,62:10,-1:2,62:3,-1:13,62,54:2,-1:4,62:9,61,6" +
"2:2,-1:2,62:3,-1:13,62,54:2,-1:4,62:6,50,62:5,-1:2,62:3,-1:13,62,54:2,-1:4," +
"62:2,51,62:9,-1:2,62:3,-1:13,62,54:2,-1:4,62:5,55,62:2,56,62:3,-1:2,62:3,-1" +
":13,62,54:2,-1:4,62:12,-1:2,62:2,57,-1:13,62,54:2,-1:3");

	public java_cup.runtime.Symbol next_token ()
		throws java.io.IOException {
		int yy_lookahead;
		int yy_anchor = YY_NO_ANCHOR;
		int yy_state = yy_state_dtrans[yy_lexical_state];
		int yy_next_state = YY_NO_STATE;
		int yy_last_accept_state = YY_NO_STATE;
		boolean yy_initial = true;
		int yy_this_accept;

		yy_mark_start();
		yy_this_accept = yy_acpt[yy_state];
		if (YY_NOT_ACCEPT != yy_this_accept) {
			yy_last_accept_state = yy_state;
			yy_mark_end();
		}
		while (true) {
			if (yy_initial && yy_at_bol) yy_lookahead = YY_BOL;
			else yy_lookahead = yy_advance();
			yy_next_state = YY_F;
			yy_next_state = yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]];
			if (YY_EOF == yy_lookahead && true == yy_initial) {

  return new Symbol(sym.EOF, new String("Fin de archivo"));
			}
			if (YY_F != yy_next_state) {
				yy_state = yy_next_state;
				yy_initial = false;
				yy_this_accept = yy_acpt[yy_state];
				if (YY_NOT_ACCEPT != yy_this_accept) {
					yy_last_accept_state = yy_state;
					yy_mark_end();
				}
			}
			else {
				if (YY_NO_STATE == yy_last_accept_state) {
					throw (new Error("Lexical Error: Unmatched Input."));
				}
				else {
					yy_anchor = yy_acpt[yy_last_accept_state];
					if (0 != (YY_END & yy_anchor)) {
						yy_move_end();
					}
					yy_to_mark();
					switch (yy_last_accept_state) {
					case 1:
						
					case -2:
						break;
					case 2:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -3:
						break;
					case 3:
						{return new Symbol(sym.LBRACKET, new String(yytext()));}
					case -4:
						break;
					case 4:
						{return new Symbol(sym.RBRACKET, new String(yytext()));}
					case -5:
						break;
					case 5:
						{return new Symbol(sym.ASSIGN, new String(yytext()));}
					case -6:
						break;
					case 6:
						{System.out.println("Caracter ilegal: "+yytext());}
					case -7:
						break;
					case 7:
						{return new Symbol(sym.NOT, new String(yytext()));}
					case -8:
						break;
					case 8:
						{return new Symbol(sym.GREATER, new String(yytext()));}
					case -9:
						break;
					case 9:
						{return new Symbol(sym.LESS, new String(yytext()));}
					case -10:
						break;
					case 10:
						{return new Symbol(sym.PLUS, new String(yytext()));}
					case -11:
						break;
					case 11:
						{return new Symbol(sym.MINUS, new String(yytext()));}
					case -12:
						break;
					case 12:
						{return new Symbol(sym.DIVIDE, new String(yytext()));}
					case -13:
						break;
					case 13:
						{return new Symbol(sym.TIMES, new String(yytext()));}
					case -14:
						break;
					case 14:
						{return new Symbol(sym.LPAREN, new String(yytext()));}
					case -15:
						break;
					case 15:
						{return new Symbol(sym.RPAREN, new String(yytext()));}
					case -16:
						break;
					case 16:
						{return new Symbol(sym.SEMI, new String(yytext()));}
					case -17:
						break;
					case 17:
						{return new Symbol(sym.INTEGER, new Integer(yytext()));}
					case -18:
						break;
					case 18:
						{ }
					case -19:
						break;
					case 19:
						{return new Symbol(sym.EQUAL, new String(yytext()));}
					case -20:
						break;
					case 20:
						{return new Symbol(sym.AND, new String(yytext()));}
					case -21:
						break;
					case 21:
						{return new Symbol(sym.OR, new String(yytext()));}
					case -22:
						break;
					case 22:
						{return new Symbol(sym.NOTEQUAL, new String(yytext()));}
					case -23:
						break;
					case 23:
						{return new Symbol(sym.GREATEREQUAL, new String(yytext()));}
					case -24:
						break;
					case 24:
						{return new Symbol(sym.LESSEQUAL, new String(yytext()));}
					case -25:
						break;
					case 25:
						{return new Symbol(sym.DOUBLE, new Double(yytext()));}
					case -26:
						break;
					case 26:
						{return new Symbol(sym.TYPEINT, new String(yytext()));}
					case -27:
						break;
					case 27:
						{return new Symbol(sym.VOID, new String(yytext()));}
					case -28:
						break;
					case 28:
						{return new Symbol(sym.CLASS, new String(yytext()));}
					case -29:
						break;
					case 29:
						{return new Symbol(sym.ACCESS, new String(yytext()));}
					case -30:
						break;
					case 30:
						{return new Symbol(sym.TYPEDOUBLE, new String(yytext()));}
					case -31:
						break;
					case 32:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -32:
						break;
					case 33:
						{System.out.println("Caracter ilegal: "+yytext());}
					case -33:
						break;
					case 34:
						{return new Symbol(sym.INTEGER, new Integer(yytext()));}
					case -34:
						break;
					case 35:
						{return new Symbol(sym.DOUBLE, new Double(yytext()));}
					case -35:
						break;
					case 37:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -36:
						break;
					case 38:
						{System.out.println("Caracter ilegal: "+yytext());}
					case -37:
						break;
					case 39:
						{return new Symbol(sym.DOUBLE, new Double(yytext()));}
					case -38:
						break;
					case 40:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -39:
						break;
					case 41:
						{System.out.println("Caracter ilegal: "+yytext());}
					case -40:
						break;
					case 42:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -41:
						break;
					case 43:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -42:
						break;
					case 44:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -43:
						break;
					case 45:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -44:
						break;
					case 47:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -45:
						break;
					case 48:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -46:
						break;
					case 49:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -47:
						break;
					case 50:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -48:
						break;
					case 51:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -49:
						break;
					case 52:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -50:
						break;
					case 53:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -51:
						break;
					case 54:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -52:
						break;
					case 55:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -53:
						break;
					case 56:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -54:
						break;
					case 57:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -55:
						break;
					case 58:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -56:
						break;
					case 59:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -57:
						break;
					case 60:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -58:
						break;
					case 61:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -59:
						break;
					case 62:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -60:
						break;
					case 63:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -61:
						break;
					case 64:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -62:
						break;
					default:
						yy_error(YY_E_INTERNAL,false);
					case -1:
					}
					yy_initial = true;
					yy_state = yy_state_dtrans[yy_lexical_state];
					yy_next_state = YY_NO_STATE;
					yy_last_accept_state = YY_NO_STATE;
					yy_mark_start();
					yy_this_accept = yy_acpt[yy_state];
					if (YY_NOT_ACCEPT != yy_this_accept) {
						yy_last_accept_state = yy_state;
						yy_mark_end();
					}
				}
			}
		}
	}
}
