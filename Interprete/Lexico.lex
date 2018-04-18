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

"=" {return new Symbol(sym.ASSIGN, new String(yytext()));}
"&&" {return new Symbol(sym.AND, new String(yytext()));}
"||" {return new Symbol(sym.OR, new String(yytext()));}
"!" {return new Symbol(sym.NOT, new String(yytext()));}
">" {return new Symbol(sym.GREATER, new String(yytext()));}
">=" {return new Symbol(sym.GREATEREQUAL, new String(yytext()));}
"<" {return new Symbol(sym.LESS, new String(yytext()));}
"<=" {return new Symbol(sym.LESSEQUAL, new String(yytext()));}
"==" {return new Symbol(sym.EQUAL, new String(yytext()));}
"!=" {return new Symbol(sym.NOTEQUAL, new String(yytext()));}
"+" {return new Symbol(sym.PLUS, new String(yytext()));}
"-" {return new Symbol(sym.MINUS, new String(yytext()));}
"/" {return new Symbol(sym.DIVIDE, new String(yytext()));}
"*" {return new Symbol(sym.TIMES, new String(yytext()));}
"(" {return new Symbol(sym.LPAREN, new String(yytext()));}
")" {return new Symbol(sym.RPAREN, new String(yytext()));}
";" {return new Symbol(sym.SEMI, new String(yytext()));}
[A-Za-z]+[0-9a-zA-Z]* {return new Symbol(sym.ID, new String(yytext()));}
0|[1-9][0-9]* {return new Symbol(sym.INTEGER, new Integer(yytext()));}
True|False {return new Symbol(sym.BOOL, new String(yytext()));}
[\t\r\n\f ] { }
. {System.out.println("Caracter ilegal: "+yytext());}
