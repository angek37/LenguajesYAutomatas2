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

true|false {return new Symbol(sym.BOOLEAN, new Boolean(yytext()));}
"class" {return new Symbol(sym.CLASS, new String(yytext()));}
"public"|"private" {return new Symbol(sym.ACCESS, new String(yytext()));}
"if" {return new Symbol(sym.IF, new String(yytext()));}
"while" {return new Symbol(sym.WHILE, new String(yytext()));}
"{" {return new Symbol(sym.LBRACKET, new String(yytext()));}
"}" {return new Symbol(sym.RBRACKET, new String(yytext()));}
"int" {return new Symbol(sym.TYPEINT, new String(yytext()));}
"double" {return new Symbol(sym.TYPEDOUBLE, new String(yytext()));}
"boolean" {return new Symbol(sym.TYPEBOOLEAN, new String(yytext()));}
"void" {return new Symbol(sym.VOID, new String(yytext()));}
"=" {return new Symbol(sym.ASSIGN, new String(yytext()));}
"(" {return new Symbol(sym.LPAREN, new String(yytext()));}
")" {return new Symbol(sym.RPAREN, new String(yytext()));}
";" {return new Symbol(sym.SEMI, new String(yytext()));}
[A-Za-z]+[0-9a-zA-Z]* {return new Symbol(sym.ID, new String(yytext()));}
0|[1-9][0-9]* {return new Symbol(sym.INTEGER, new Integer(yytext()));}
[-+]?[0-9]*\.?[0-9]+([eE][-+]?[0-9]+)? {return new Symbol(sym.DOUBLE, new Double(yytext()));}
[\t\r\n\f ] { }
. {System.out.println("Caracter ilegal: "+yytext());}
