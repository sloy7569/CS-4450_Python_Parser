grammar deliverable2;

// Start
program: statement* ;

// Statements
statement
    : assignment
    | expression
    | ifstatement
    ;

// If Statements (includes if, any # of elif, and an optional else)
ifstatement
    : IF condition COLON block (ELIF condition COLON block)* (ELSE COLON block)?
    ;

// Block (1+ statements that would be executed if a given condition is met)
block
    : statement+
    ;

// Conditions
condition
    : expression comparisonOperator expression
    | NOT condition
    | condition AND condition
    | condition OR condition
    | '(' condition ')'
    | expression
    ;

// Assignments
assignment
    : VAR EQUALS expression
    | VAR PLUS_EQUALS expression
    | VAR MINUS_EQUALS expression
    | VAR TIMES_EQUALS expression
    | VAR DIV_EQUALS expression
    ;

// Expressions
expression
    : literal
    | VAR
    | ('+' | '-') expression                // to handle unary operator in 2nd deliverable
    | expression op=('*'|'/') expression
    | expression op=('+'|'-'|'%') expression
    | '(' expression ')'
    ;

// Literals
literal
    : NUMBER
    | FLOAT
    | STRING
    | BOOLEAN
    | array
    ;

// Array 
array
    : LBRACKET (expression (COMMA expression)*)? RBRACKET
    ;

// Comparison Operators
comparisonOperator
    : '<'
    | '<='
    | '>'
    | '>='
    | '=='
    | '!='
    ;


// Tokens

// Assignment Operator definitions
EQUALS: '=';
PLUS_EQUALS: '+=';
MINUS_EQUALS: '-=';
TIMES_EQUALS: '*=';
DIV_EQUALS: '/=';

// Array definitions
LBRACKET: '[';
RBRACKET: ']';
COMMA: ',';
COLON: ':';

// Conditional definitions
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
AND: 'and';
OR: 'or';
NOT: 'not';


// Literal definitions
BOOLEAN: 'True' | 'False';
STRING: ('"' (~["\\\r\n])* '"' | '\'' (~['\\\r\n])* '\'');
NUMBER: [0-9]+;
FLOAT: [0-9]+'.'[0-9]+;
VAR: [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\r\n]+ -> skip;