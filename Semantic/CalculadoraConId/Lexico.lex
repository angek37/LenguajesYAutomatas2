import java_cup.runtime.Symbol;
%%
%{
  public static int linea = 1;
  public static int pos = 0;
%}

%cup
%full
%line
%char
%ignorecase
%eofval{
  return new Symbol(sym.EOF, new String("Fin de archivo"));
%eofval}
%%
[A-Za-z]+[0-9a-zA-Z]* {return new Symbol(sym.ID, new String(yytext()));}
"=" {return new Symbol(sym.ASSIGN, new String(yytext()));}
";" {return new Symbol(sym.SEMI, new String(yytext()));}
"+" {return new Symbol(sym.PLUS, new String(yytext()));}
"-" {return new Symbol(sym.MINUS, new String(yytext()));}
"/" {return new Symbol(sym.DIVIDE, new String(yytext()));}
"%" {return new Symbol(sym.MOD, new String(yytext()));}
"*" {return new Symbol(sym.TIMES, new String(yytext()));}
"(" {return new Symbol(sym.LPAREN, new String(yytext()));}
")" {return new Symbol(sym.RPAREN, new String(yytext()));}
[0-9]+ {return new Symbol(sym.NUMBER, new Integer(yytext()));}
[\t\r\n\f] { }
"." {return new Symbol(sym.PUNTO);}
. {System.out.println("Caracter ilegal: "+yytext());}
