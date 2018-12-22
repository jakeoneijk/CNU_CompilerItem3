grammar MiniGo;
program   : import_decl* decl+    ;
import_decl: IMPORT ARRAYLIST;
decl      : var_decl
         | fun_decl ;
var_decl   : VAR IDENT type_spec ARRAYLIST
         | VAR IDENT ',' IDENT type_spec
         | VAR IDENT type_spec
         | VAR IDENT '[' LITERAL ']' type_spec ;
type_spec  : INT 
         | VOID
         | BOOL
         | ; 
fun_decl   : FUNC IDENT '(' params ')' type_spec compound_stmt  
         | FUNC IDENT '(' params ')' '(' type_spec ',' type_spec ')' compound_stmt;
params    :  
         | param(',' param)* ;
param     : IDENT type_spec 
         | IDENT '[' ']' type_spec ;
stmt      : expr_stmt
         | compound_stmt
         | assign_stmt
         | if_stmt
         | for_stmt
         | return_stmt;
expr_stmt  : expr ;
assign_stmt : VAR IDENT ',' IDENT type_spec '=' LITERAL ',' LITERAL
         | VAR IDENT type_spec '=' expr
         | IDENT type_spec '=' expr
         | IDENT '[' expr ']' '=' expr ;
compound_stmt: '{' local_decl* stmt* '}';
if_stmt       : IF expr compound_stmt
         | IF expr compound_stmt ELSE compound_stmt ;
for_stmt    : FOR expr compound_stmt;
return_stmt    : RETURN expr ',' expr
         | RETURN expr
         | RETURN ;
local_decl : VAR IDENT type_spec ARRAYLIST
           | VAR IDENT type_spec
           | VAR IDENT '[' LITERAL ']' type_spec;
expr      :  '(' expr ')'
         | arrayList_expr
         | IDENT '[' expr ']' 
         | IDENT '(' args ')' 
         | FMT '.' IDENT '(' args ')' 
         | op=('-'|'+'|'--'|'++'|'!') expr 
         | left=expr op=('*'|'/'|'%') right=expr 
         | left=expr op=('+'|'-') right=expr 
         | left=expr op=(EQ|NE|LE|'<'|GE|'>'|AND|OR) right=expr
         | LITERAL ',' LITERAL
         | IDENT '=' expr
         | IDENT '[' expr ']' '=' expr
         |(LITERAL|IDENT);

args      : expr (',' expr) * 
         | ;

arrayList_expr: IDENT '.add''('expr')' //원소 추가
              | IDENT '.find''('expr')'//찾을 원소 입력, 인덱스 반환
              | IDENT '.size''('')'
              | IDENT '.get''('expr')' // 찾을 Index
              | IDENT '.get''('expr')' '=' expr
              | IDENT '.delete''('expr')'; // 삭제할 Index expr에는 숫자만 허용
         
VOID      : 'void'     ;
VAR          : 'var'   ;
FUNC      : 'func'  ;
FMT          : 'fmt'      ;
INT          : 'int'   ;
BOOL         : 'bool'  ;
ARRAYLIST    : 'ArrayList';
FOR          : 'for'   ;
IF       : 'if'    ;
ELSE      : 'else'  ;
RETURN    : 'return';
OR       : 'or'    ;
AND          : 'and'   ;
LE       : '<='    ;
GE       : '>='    ;
EQ       : '=='    ;
NE       : '!='    ;
IMPORT   : 'import';

IDENT     : [a-zA-Z_] 
         ( [a-zA-Z_]
         | [0-9]
         )*;
         
LITERAL       : DecimalConstant | OctalConstant | HexadecimalConstant ;

DecimalConstant    : '0' | [1-9] [0-9]* ;
OctalConstant  : '0' [0-7]* ;
HexadecimalConstant    : '0' [xX] [0-9a-fA-F]+ ;
WS       : (' '
         | '\t'
         | '\r'
         | '\n'        
         )+
   -> channel(HIDDEN)  
    ;