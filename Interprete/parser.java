
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java.io.*;
import java_cup.runtime.*;
import java.util.HashMap;
import java.util.Map;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\044\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\004\000\002\003\003\000\002\004\003" +
    "\000\002\004\005\000\002\004\003\000\002\005\003\000" +
    "\002\005\003\000\002\005\003\000\002\013\005\000\002" +
    "\013\005\000\002\013\003\000\002\014\004\000\002\014" +
    "\003\000\002\014\004\000\002\014\005\000\002\014\005" +
    "\000\002\015\003\000\002\015\003\000\002\012\005\000" +
    "\002\012\005\000\002\012\005\000\002\012\005\000\002" +
    "\012\005\000\002\012\005\000\002\007\003\000\002\007" +
    "\005\000\002\007\005\000\002\010\003\000\002\010\005" +
    "\000\002\010\005\000\002\011\003\000\002\011\003\000" +
    "\002\011\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\100\000\022\003\022\014\014\022\010\023\015\026" +
    "\004\027\013\030\020\031\024\001\002\000\004\025\ufffa" +
    "\001\002\000\004\025\ufffc\001\002\000\004\025\ufff9\001" +
    "\002\000\026\004\uffe6\005\uffe6\006\uffe6\007\uffe6\010\uffe6" +
    "\011\uffe6\012\077\013\100\015\uffe6\025\uffe6\001\002\000" +
    "\014\014\033\022\010\023\031\027\013\030\020\001\002" +
    "\000\024\002\uffff\003\uffff\014\uffff\022\uffff\023\uffff\026" +
    "\uffff\027\uffff\030\uffff\031\uffff\001\002\000\032\004\uffe3" +
    "\005\uffe3\006\uffe3\007\uffe3\010\uffe3\011\uffe3\012\uffe3\013" +
    "\uffe3\015\uffe3\016\072\017\073\025\uffe3\001\002\000\012" +
    "\015\uffee\020\uffee\021\uffee\025\uffee\001\002\000\016\014" +
    "\014\022\010\023\037\027\013\030\020\031\024\001\002" +
    "\000\032\004\uffe0\005\uffe0\006\uffe0\007\uffe0\010\uffe0\011" +
    "\uffe0\012\uffe0\013\uffe0\016\uffe0\017\uffe0\024\067\025\uffe0" +
    "\001\002\000\004\025\066\001\002\000\012\015\ufff2\020" +
    "\ufff2\021\ufff2\025\ufff2\001\002\000\012\015\uffed\020\uffed" +
    "\021\uffed\025\uffed\001\002\000\020\004\041\005\043\006" +
    "\045\007\042\010\044\011\046\025\ufff7\001\002\000\024" +
    "\002\ufffd\003\ufffd\014\ufffd\022\ufffd\023\ufffd\026\ufffd\027" +
    "\ufffd\030\ufffd\031\ufffd\001\002\000\004\025\ufff8\001\002" +
    "\000\032\004\uffdf\005\uffdf\006\uffdf\007\uffdf\010\uffdf\011" +
    "\uffdf\012\uffdf\013\uffdf\015\uffdf\016\uffdf\017\uffdf\025\uffdf" +
    "\001\002\000\024\002\065\003\022\014\014\022\010\023" +
    "\015\026\004\027\013\030\020\031\024\001\002\000\012" +
    "\015\ufff4\020\027\021\030\025\ufff4\001\002\000\014\014" +
    "\033\022\010\023\031\027\013\030\020\001\002\000\014" +
    "\014\033\022\010\023\031\027\013\030\020\001\002\000" +
    "\002\001\002\000\006\015\ufff5\025\ufff5\001\002\000\016" +
    "\014\014\022\010\023\037\027\013\030\020\031\024\001" +
    "\002\000\004\015\062\001\002\000\004\015\061\001\002" +
    "\000\016\004\041\005\043\006\045\007\042\010\044\011" +
    "\046\001\002\000\032\004\uffe0\005\uffe0\006\uffe0\007\uffe0" +
    "\010\uffe0\011\uffe0\012\uffe0\013\uffe0\015\uffe0\016\uffe0\017" +
    "\uffe0\025\uffe0\001\002\000\012\015\ufff3\020\ufff3\021\ufff3" +
    "\025\ufff3\001\002\000\010\014\050\023\047\031\024\001" +
    "\002\000\010\014\050\023\047\031\024\001\002\000\010" +
    "\014\050\023\047\031\024\001\002\000\010\014\050\023" +
    "\047\031\024\001\002\000\010\014\050\023\047\031\024" +
    "\001\002\000\010\014\050\023\047\031\024\001\002\000" +
    "\032\004\uffe0\005\uffe0\006\uffe0\007\uffe0\010\uffe0\011\uffe0" +
    "\012\uffe0\013\uffe0\015\uffe0\016\uffe0\017\uffe0\025\uffe0\001" +
    "\002\000\010\014\050\023\047\031\024\001\002\000\006" +
    "\015\uffe7\025\uffe7\001\002\000\004\015\053\001\002\000" +
    "\032\004\uffde\005\uffde\006\uffde\007\uffde\010\uffde\011\uffde" +
    "\012\uffde\013\uffde\015\uffde\016\uffde\017\uffde\025\uffde\001" +
    "\002\000\006\015\uffea\025\uffea\001\002\000\006\015\uffe8" +
    "\025\uffe8\001\002\000\006\015\uffeb\025\uffeb\001\002\000" +
    "\006\015\uffe9\025\uffe9\001\002\000\006\015\uffec\025\uffec" +
    "\001\002\000\012\015\uffef\020\uffef\021\uffef\025\uffef\001" +
    "\002\000\012\015\ufff0\020\ufff0\021\ufff0\025\ufff0\001\002" +
    "\000\006\015\ufff6\025\ufff6\001\002\000\024\002\001\003" +
    "\001\014\001\022\001\023\001\026\001\027\001\030\001" +
    "\031\001\001\002\000\004\002\000\001\002\000\024\002" +
    "\ufffe\003\ufffe\014\ufffe\022\ufffe\023\ufffe\026\ufffe\027\ufffe" +
    "\030\ufffe\031\ufffe\001\002\000\016\014\014\022\010\023" +
    "\037\027\013\030\020\031\024\001\002\000\004\025\ufffb" +
    "\001\002\000\020\004\041\005\043\006\045\007\042\010" +
    "\044\011\046\015\053\001\002\000\010\014\050\023\047" +
    "\031\024\001\002\000\010\014\050\023\047\031\024\001" +
    "\002\000\026\004\uffe1\005\uffe1\006\uffe1\007\uffe1\010\uffe1" +
    "\011\uffe1\012\uffe1\013\uffe1\015\uffe1\025\uffe1\001\002\000" +
    "\026\004\uffe2\005\uffe2\006\uffe2\007\uffe2\010\uffe2\011\uffe2" +
    "\012\uffe2\013\uffe2\015\uffe2\025\uffe2\001\002\000\012\015" +
    "\ufff1\020\ufff1\021\ufff1\025\ufff1\001\002\000\010\014\050" +
    "\023\047\031\024\001\002\000\010\014\050\023\047\031" +
    "\024\001\002\000\022\004\uffe5\005\uffe5\006\uffe5\007\uffe5" +
    "\010\uffe5\011\uffe5\015\uffe5\025\uffe5\001\002\000\022\004" +
    "\uffe4\005\uffe4\006\uffe4\007\uffe4\010\uffe4\011\uffe4\015\uffe4" +
    "\025\uffe4\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\100\000\030\002\024\003\010\004\015\005\004\007" +
    "\020\010\006\011\011\012\022\013\005\014\025\015\016" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\014\075\015\016\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\020\007\070\010\006\011\011\012\034\013\033\014\025" +
    "\015\016\001\001\000\004\006\037\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\026\003\063\004\015\005\004\007\020\010\006\011\011" +
    "\012\022\013\005\014\025\015\016\001\001\000\002\001" +
    "\001\000\006\014\062\015\016\001\001\000\006\014\031" +
    "\015\016\001\001\000\004\006\037\001\001\000\002\001" +
    "\001\000\020\007\035\010\006\011\011\012\034\013\033" +
    "\014\025\015\016\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\006\037\001\001\000\002" +
    "\001\001\000\010\007\057\010\006\011\011\001\001\000" +
    "\010\007\056\010\006\011\011\001\001\000\010\007\055" +
    "\010\006\011\011\001\001\000\010\007\054\010\006\011" +
    "\011\001\001\000\010\007\053\010\006\011\011\001\001" +
    "\000\010\007\050\010\006\011\011\001\001\000\002\001" +
    "\001\000\010\007\051\010\006\011\011\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\022\005\067\007\020\010\006\011\011\012" +
    "\022\013\005\014\025\015\016\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\011\074\001\001\000\004\011" +
    "\073\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\010\101\011\011\001\001\000\006\010" +
    "\100\011\011\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



  public static void main(String[] args) throws Exception{
    new parser(new Yylex(System.in)).parse();
  }
  public void Syntax_error(Symbol s){
    report_error("Error de sintaxis linea"+ Integer.toString(Yylex.linea+1)+
      "Columna: "+ Integer.toString(Yylex.pos + 1 ) + "En \""+ s.value + "\"", null);
  }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {


  List l = new List();

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // stmt ::= stmt stmt_part 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= stmt EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // stmt ::= stmt_part 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // stmt_part ::= stmt_list SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt_part",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // stmt_part ::= error 
            {
              Object RESULT =null;
		System.out.println("Error de sintaxis");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt_part",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // stmt_list ::= expr 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 System.out.println(e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt_list",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // stmt_list ::= ID ASSIGN expr 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int dataleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int dataright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object data = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 l.add(""+id, data); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt_list",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // stmt_list ::= EXIT 
            {
              Object RESULT =null;
		 System.exit(1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt_list",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= log_term 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean e = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= relation_expr 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean e = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= arithm_expr 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // log_term ::= log_factor AND log_factor 
            {
              Boolean RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Boolean e1 = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean e2 = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Boolean(e1.booleanValue() && e2.booleanValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("log_term",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // log_term ::= log_factor OR log_factor 
            {
              Boolean RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Boolean e1 = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean e2 = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Boolean(e1.booleanValue() || e2.booleanValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("log_term",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // log_term ::= log_factor 
            {
              Boolean RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean e = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("log_term",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // log_factor ::= ID emp 
            {
              Boolean RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
              if(l.Type(""+n).equals("Boolean")){
                RESULT = new Boolean((Boolean)l.get(""+n));
              }else {
                System.out.println("La variable no es de tipo Boolean");
              }
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("log_factor",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // log_factor ::= bool 
            {
              Boolean RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean e = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("log_factor",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // log_factor ::= NOT log_factor 
            {
              Boolean RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean e = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Boolean(!e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("log_factor",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // log_factor ::= LPAREN log_term RPAREN 
            {
              Boolean RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Boolean e = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("log_factor",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // log_factor ::= LPAREN relation_expr RPAREN 
            {
              Boolean RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Boolean e = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("log_factor",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // bool ::= TRUE 
            {
              Boolean RESULT =null;
		 RESULT = new Boolean(true); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // bool ::= FALSE 
            {
              Boolean RESULT =null;
		 RESULT = new Boolean(false); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // relation_expr ::= arithm_expr GREATER arithm_expr 
            {
              Boolean RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Boolean(e1>e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("relation_expr",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // relation_expr ::= arithm_expr GREATEREQUAL arithm_expr 
            {
              Boolean RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Boolean(e1>=e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("relation_expr",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // relation_expr ::= arithm_expr LESS arithm_expr 
            {
              Boolean RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Boolean(e1<e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("relation_expr",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // relation_expr ::= arithm_expr LESSEQUAL arithm_expr 
            {
              Boolean RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Boolean(e1<=e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("relation_expr",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // relation_expr ::= arithm_expr EQUAL arithm_expr 
            {
              Boolean RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Boolean(e1==e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("relation_expr",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // relation_expr ::= arithm_expr NOTEQUAL arithm_expr 
            {
              Boolean RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Boolean(e1!=e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("relation_expr",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // arithm_expr ::= arithm_term 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = n; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("arithm_expr",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // arithm_expr ::= arithm_term TIMES arithm_term 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Integer(e1.intValue() * e2.intValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("arithm_expr",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // arithm_expr ::= arithm_term DIVIDE arithm_term 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Integer(e1.intValue() / e2.intValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("arithm_expr",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // arithm_term ::= arithm_factor 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = n; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("arithm_term",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // arithm_term ::= arithm_factor PLUS arithm_factor 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Integer(e1.intValue() + e2.intValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("arithm_term",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // arithm_term ::= arithm_factor MINUS arithm_factor 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Integer(e1.intValue() - e2.intValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("arithm_term",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // arithm_factor ::= ID 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
              if(l.Type(""+n).equals("Integer")){
                RESULT = new Integer((Integer)l.get(""+n));
              }else {
                System.out.println("La variable no es de tipo Integer");
              }
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("arithm_factor",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // arithm_factor ::= INTEGER 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = n; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("arithm_factor",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // arithm_factor ::= LPAREN arithm_expr RPAREN 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = n; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("arithm_factor",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
