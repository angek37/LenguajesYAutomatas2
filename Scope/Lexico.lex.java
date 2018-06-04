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
		/* 21 */ YY_NOT_ACCEPT,
		/* 22 */ YY_NO_ANCHOR,
		/* 23 */ YY_NO_ANCHOR,
		/* 24 */ YY_NO_ANCHOR,
		/* 25 */ YY_NO_ANCHOR,
		/* 26 */ YY_NOT_ACCEPT,
		/* 27 */ YY_NO_ANCHOR,
		/* 28 */ YY_NO_ANCHOR,
		/* 29 */ YY_NO_ANCHOR,
		/* 30 */ YY_NOT_ACCEPT,
		/* 31 */ YY_NO_ANCHOR,
		/* 32 */ YY_NO_ANCHOR,
		/* 33 */ YY_NO_ANCHOR,
		/* 34 */ YY_NO_ANCHOR,
		/* 35 */ YY_NO_ANCHOR,
		/* 36 */ YY_NO_ANCHOR,
		/* 37 */ YY_NO_ANCHOR,
		/* 38 */ YY_NO_ANCHOR,
		/* 39 */ YY_NO_ANCHOR,
		/* 40 */ YY_NO_ANCHOR,
		/* 41 */ YY_NO_ANCHOR,
		/* 42 */ YY_NO_ANCHOR,
		/* 43 */ YY_NO_ANCHOR,
		/* 44 */ YY_NO_ANCHOR,
		/* 45 */ YY_NO_ANCHOR,
		/* 46 */ YY_NO_ANCHOR,
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
		/* 64 */ YY_NO_ANCHOR,
		/* 65 */ YY_NO_ANCHOR
	};
	private int yy_cmap[] = unpackFromString(1,258,
"29:9,28:2,29,28:2,29:18,28,29:7,20,21,29,26,29,26,27,29,25,24:9,29,22,29,19" +
",29:3,6,11,9,17,4,5,23:2,12,23:2,7,23,16,18,10,23,2,8,1,3,13,23:4,29:6,6,11" +
",9,17,4,5,23:2,12,23:2,7,23,16,18,10,23,2,8,1,3,13,23:4,14,29,15,29:130,0:2")[0];

	private int yy_rmap[] = unpackFromString(1,66,
"0,1,2,1:6,3,4,1,5,6,5:7,7,8,6,9,10,9,11,1,12:2,13,14,15,16,17,18,19,20,21,2" +
"2,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,5,40,41,42,43,44,45,46")[0];

	private int yy_nxt[][] = unpackFromString(47,30,
"1,2,58:3,60,58:3,61,62,63,22,64,3,4,58,65,58,5,6,7,8,58,9,23,10,24,11,28,-1" +
":31,58,38,58:11,-1:2,58:3,-1:4,58,39:2,-1:8,21,-1:19,9:2,-1,26,-1:26,13:2,-" +
"1,26,-1:3,58:13,-1:2,58:3,-1:4,58,39:2,-1:8,21,-1:19,13:2,-1,26,-1:26,29:2," +
"30,-1:4,58:4,12,58:8,-1:2,27,58:2,-1:4,58,39:2,-1:28,25:2,-1:8,21,-1:19,25:" +
"2,-1:5,14,58:12,-1:2,58:3,-1:4,58,39:2,-1:28,29:2,-1:5,58:3,15,58:9,-1:2,58" +
":3,-1:4,58,39:2,-1:5,58:13,-1:2,58,16,58,-1:4,58,39:2,-1:5,58:7,17,58:5,-1:" +
"2,58:3,-1:4,58,39:2,-1:5,58:8,18,58:4,-1:2,58:3,-1:4,58,39:2,-1:5,58:3,19,5" +
"8:9,-1:2,58:3,-1:4,58,39:2,-1:5,58:3,18,58:9,-1:2,58:3,-1:4,58,39:2,-1:5,58" +
":13,-1:2,20,58:2,-1:4,58,39:2,-1:5,58:2,31,58:10,-1:2,58:3,-1:4,58,39:2,-1:" +
"5,39:13,-1:2,39:3,-1:4,39:3,-1:5,58:6,47,58:6,-1:2,58:3,-1:4,58,39:2,-1:5,5" +
"8:5,48,58:7,-1:2,58:3,-1:4,58,39:2,-1:5,58:11,49,58,-1:2,58:3,-1:4,58,39:2," +
"-1:5,58:10,50,58:2,-1:2,58:3,-1:4,58,39:2,-1:5,58:13,-1:2,58:2,59,-1:4,58,3" +
"9:2,-1:5,58:11,32,58,-1:2,58:3,-1:4,58,39:2,-1:5,58:2,51,58:10,-1:2,58:3,-1" +
":4,58,39:2,-1:5,58:7,31,58:5,-1:2,58:3,-1:4,58,39:2,-1:5,58:7,33,58:5,-1:2," +
"58:3,-1:4,58,39:2,-1:5,58:12,52,-1:2,58:3,-1:4,58,39:2,-1:5,58:6,53,58:6,-1" +
":2,58:3,-1:4,58,39:2,-1:5,58:10,55,58:2,-1:2,58:3,-1:4,58,39:2,-1:5,58:5,56" +
",58:7,-1:2,58:3,-1:4,58,39:2,-1:5,58:11,34,58,-1:2,58:3,-1:4,58,39:2,-1:5,5" +
"8:3,57,58:9,-1:2,58:3,-1:4,58,39:2,-1:5,58:6,35,58:6,-1:2,58:3,-1:4,58,39:2" +
",-1:5,36,58:12,-1:2,58:3,-1:4,58,39:2,-1:5,58:5,37,58:7,-1:2,58:3,-1:4,58,3" +
"9:2,-1:5,58:6,54,58:6,-1:2,58:3,-1:4,58,39:2,-1:5,58:5,40,58:7,-1:2,58:3,-1" +
":4,58,39:2,-1:5,58:6,41,58:6,-1:2,58:3,-1:4,58,39:2,-1:5,58,42,43,58:10,-1:" +
"2,58:3,-1:4,58,39:2,-1:5,58:13,-1:2,58:2,44,-1:4,58,39:2,-1:5,58:13,-1:2,58" +
":2,45,-1:4,58,39:2,-1:5,58:13,-1:2,58:2,46,-1:4,58,39:2,-1:4");

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
						{return new Symbol(sym.LPAREN, new String(yytext()));}
					case -7:
						break;
					case 7:
						{return new Symbol(sym.RPAREN, new String(yytext()));}
					case -8:
						break;
					case 8:
						{return new Symbol(sym.SEMI, new String(yytext()));}
					case -9:
						break;
					case 9:
						{return new Symbol(sym.INTEGER, new Integer(yytext()));}
					case -10:
						break;
					case 10:
						{System.out.println("Caracter ilegal: "+yytext());}
					case -11:
						break;
					case 11:
						{ }
					case -12:
						break;
					case 12:
						{return new Symbol(sym.IF, new String(yytext()));}
					case -13:
						break;
					case 13:
						{return new Symbol(sym.DOUBLE, new Double(yytext()));}
					case -14:
						break;
					case 14:
						{return new Symbol(sym.TYPEINT, new String(yytext()));}
					case -15:
						break;
					case 15:
						{return new Symbol(sym.BOOLEAN, new Boolean(yytext()));}
					case -16:
						break;
					case 16:
						{return new Symbol(sym.VOID, new String(yytext()));}
					case -17:
						break;
					case 17:
						{return new Symbol(sym.CLASS, new String(yytext()));}
					case -18:
						break;
					case 18:
						{return new Symbol(sym.ACCESS, new String(yytext()));}
					case -19:
						break;
					case 19:
						{return new Symbol(sym.TYPEDOUBLE, new String(yytext()));}
					case -20:
						break;
					case 20:
						{return new Symbol(sym.TYPEBOOLEAN, new String(yytext()));}
					case -21:
						break;
					case 22:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -22:
						break;
					case 23:
						{return new Symbol(sym.INTEGER, new Integer(yytext()));}
					case -23:
						break;
					case 24:
						{System.out.println("Caracter ilegal: "+yytext());}
					case -24:
						break;
					case 25:
						{return new Symbol(sym.DOUBLE, new Double(yytext()));}
					case -25:
						break;
					case 27:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -26:
						break;
					case 28:
						{System.out.println("Caracter ilegal: "+yytext());}
					case -27:
						break;
					case 29:
						{return new Symbol(sym.DOUBLE, new Double(yytext()));}
					case -28:
						break;
					case 31:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -29:
						break;
					case 32:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -30:
						break;
					case 33:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -31:
						break;
					case 34:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -32:
						break;
					case 35:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -33:
						break;
					case 36:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -34:
						break;
					case 37:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -35:
						break;
					case 38:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -36:
						break;
					case 39:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -37:
						break;
					case 40:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -38:
						break;
					case 41:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -39:
						break;
					case 42:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -40:
						break;
					case 43:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -41:
						break;
					case 44:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -42:
						break;
					case 45:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -43:
						break;
					case 46:
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
					case 65:
						{return new Symbol(sym.ID, new String(yytext()));}
					case -63:
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
