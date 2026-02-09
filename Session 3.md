# Session 3 - Operators in Java
## Operators
- Operator is a symbol which performs some operation on operands
```java
	int a  = 10 ;
	int b = 20 ;
	int c = a + b;
```
- We have below operators in java

	    	1) Arithmetic Operators
	    	2) Logical Operators
	    	3) Relational Operators
	    	4) Assignment Operators
	    	5) new operator
	    	6) dot (.)  operator
	    	7) ternary operator ( Conditional Operator )
	    	8) Bitwise Operator
### Arithmetic Operators
- Arithmetic Operators are used to perform Arithmetic Operations ( Calculations )

	    	1) Addition -----> +
	    	2) Subtraction ---->  -
	    	3) Division ------------>  /  (quotient)
	    	4) Multiplication ----------> *
	    	5) Modulus ---------> %  (reminder)
	    	6) Increment -------> ++
	    	7) Decrement ------> --
- Increment ( ++ ) is used to increase the value of variable by 1
- Increment is divided into 2 types

	    	1) Post Increment   ( a ++ )
	    	2) Pre Increment  ( ++ a)

- Decrement ( -- ) is used to decrease the value of variable by 1  
- Decrement is divided into 2 types

    	1) Post Decrement ( a -- )
    	2) Pre-Decrement ( --a )

```java
	// Increment and Decrement Operators

	class PostIncrement {
		public static void main(String... args){
			int a = 5;
			System.out.println(a++); // it will print 5 then it will become 6
			a++;  // it will become 7
			System.out.println(a++); // it will print 7 then it will become 8
			System.out.println(a); // it will print 8
		}
	}

	class PreIncrement {
		public static void main(String... args){
			int a = 5;
			System.out.println ( ++ a );  // it will become 6 then it will print
			++ a ;  // it will become 7
			System.out.println(++a);  // it will become 8 then it will print
			System.out.println(a); // it will print 8
		}
	}

	class PostPreIncrement {
		public static void main(String... args){
			int a = 5;
			int b = ++a  + a++ + a++  + ++a;
			// int b = 6 + 6 + 7 + 9 ==> 28
			System.out.println(b);
		}
	}

	class Decrement {
		public static void main(String... args){
			int a = 5;
			System.out.println( a -- );  // it will print 5 then it will become 4
			System.out.println( -- a);  // it will become 3 then it will print 3
		}
	}

	class PostPreDecrement {
		public static void main(String... args){
			int a = 5;
			int b =  a-- + --a + a--;
			// int b = 5 + 3 + 3
			System.out.println ( b );
		}
	}
```
### Bitwise Operators
- Bitwise operators are used to manipulate individual bit of operands
- Bitwise operators can be applied to integral types

			Bitwise unary NOT    --->    ~
			Bitwise AND    --->    &
			Bitwise OR    --->    |
			Bitwise exclusive OR    --->    ^
			Shift right    --->    >>
			Shift right zero fill    --->    >>>
			Shift left    --->    <<
### Relational Operators
- Relations Operators are used to check relation between two Operands
```
    >, < , >= , <=, !=, ==
```
### Logical Operators
- To check more than one condition then we will use Logical operators

```
	AND  ---->  &&
	OR -----> ||
	NOT -----> !
```
### Assignment Operator
- Equals ( = ) is called as assignment operator
- It is used to assign the value for a variable

```java
	int a  = 10 ;
```
### new operator
- It is used to create the object for a class
```
	ClassName refVar = new ClassName( );
```

**Note: Creating object means allocating memory in heap area**
### Dot (.) Operator
- Dot operator is used to access class variables & methods
```
	System.out.println ( );
	java.lang.String;
	java.util.ArrayList;
```
### Ternary Operator / Conditional Operator
- Ternary operator is used for decision making
```
	// Conditional Operator Syntax
	( condition ) ? expression-1 : expression-2
```
- If condition satisfied then expression-1 will execute otherwise expression-2 will execute
### instanceof Operator
- It is used to check object reference belong to a class or not
```java
	String str = "ashokit";
	if (str instanceof String ) {
		//logic
	}
```
## Operator Precedence
- Operators at the same level follow associativity rules
- Parentheses `()` have the highest precedence
- Assignment operators have the lowest precedence

		1. ()                              → Parentheses
		2. ++  --                          → Postfix increment, decrement
		3. ++  --  +  -  !  ~              → Unary operators
		4. *  /  %                         → Multiplication, Division, Modulus
		5. +  -                            → Addition, Subtraction
		6. <<  >>  >>>                     → Shift operators
		7. <  <=  >  >=  instanceof        → Relational operators
		8. ==  !=                          → Equality operators
		9. &                               → Bitwise AND
		10. ^                              → Bitwise XOR
		11. |                              → Bitwise OR
		12. &&                             → Logical AND
		13. ||                             → Logical OR
		14. ?:                             → Ternary operator
		15. =  +=  -=  *=  /=  %=          → Assignment operators
### Assignments (LeetCode)
1. [Single Number](https://leetcode.com/problems/single-number/)
2. [Plus One](https://leetcode.com/problems/plus-one/)

