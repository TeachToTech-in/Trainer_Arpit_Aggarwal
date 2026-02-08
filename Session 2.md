# Session 2
## Data Types
- Data types are used to specify type of the data
- Data types are divided into 2 categories

    	1) Primitive / Pre-Defined Data Types
    		2) Integral Data Types
    			- byte
    			- short
    			- int
    			- long
    		2) Decimal Data Types
    			- float
    			- double
    		3) Character Data Type
    			- char
    		4) Boolean Data Type
    			- boolean
    
    	2) Non-Primitive / Referenced Data Types
    		- Arrays
    		- Strings
    		- Classes
### Integral Data Types

- Integral data types are used to store numbers without decimal points
- We can store both positive and negative numbers using integral data types

```java
	// Intergral Data Type
	age = 30;
	phno = 66868686868;
	studentscnt = 40;
	balance = - 3000;
```
- We have 4 data types in this category
- For These 4 data types memory & range is different

	    	1)  byte   ----> default value is 0  ----> 1 byte
	    	2)  short	----> default value is 0  ----> 2 bytes
	    	3)  int    ----> default value is 0  ----> 4 bytes
	    	4)  long   ----> default value is 0l   ----> 8 bytes
### Decimal Data Types
- Decimal data types are used to store numbers with decimal values
- We can store both postive and negative values
```java
	// Decimal Data Types
	petrol price  = 110.567979;
	stockPrice = 334.3279797979797979;
	percentage = 9.8;
	weight = 55.6;
	height = 5.6;
	length = 10.2;
```
- In this category we have 2 data types

	    	1) float   ----> 4 bytes ---> upto 6 decimal points
	    	2) double  -----> 8 bytes  --> upto 15 decimal points
### Character Data Type
- Character data type is used to store single character
- Any single character ( alphabet / digit / special character ) we can store using 'char' data type
- char datatype will occupy 2 bytes of memory
- When we are storing data into 'char' data type single quote is mandatory
- default value is 'u0002'
```java
	// Character Data Type
	gender = 'm';
	rank = '1';
```

**Note: In C language 'char' will take only 1 byte where as in java 'char' will take 2 bytes**
### Boolean Data Type
- It is used to store true or false values only
- It will occupy 1 bit memory
- Note: 8 bits = 1 byte
- default value for boolean is false
```java
	// Boolean Data Type
	isPass = true;
	isFail = false;
	isMarried = true;
	isOdd = true;
	isEven = false;
```
## How memory allocated ?
- Memory (RAM) is divided into two parts : Stack, Heap
- For primitive data types memory will be inside stack
- For referenced data types memory will be allocated inside heap
## Type Casting
- Type casting in Java is the process of converting one data type into another
- Java supports two types of type casting:

			Implicit Type Casting (Widening)
			Explicit Type Casting (Narrowing)
### Implicit Type Casting
- Done automatically by the compiler
- Converts a smaller data type to a larger data type
- No data loss and safe conversion

			byte → short → int → long → float → double
```java
	int a = 10;
	double d = a;   // implicit casting
	System.out.println(d); // Output: 10.0
```
### Explicit Type Casting (Narrowing)
- Done manually by the programmer
- Converts a larger data type to a smaller data type
- Possibility of data loss
- Requires casting operator `(type)`

			double → float → long → int → short → byte
```java
	double d = 10.75;
	int i = (int) d;   // explicit casting
	System.out.println(i); // Output: 10
```
## Wrapper classes
- Java is a Object Oriented Programming Language
- In java we can represent everything in the form of Object
- To represent primitive types data in object format java provided Wrapper classes
- For every primitive type corresponding Wrapper class is available
- All wrapper classes are part of `java.lang` package

			byte  ----> Byte
			short  ---> Short
			int  --->   Integer
			long  ---> Long
			float   ----> Float
			double   ----> Double
			char   ---> Character
			boolean   ---> Boolean
```java
	int var = 10;
	System.out.println(var); // output 10
	
	Integer obj = new Integer(10);
	System.out.println(i); // output 10
```

			Integer   i1 = new Integer (10) ;
			Integer   i2 = new Integer ("20");
			
			Double  d1  = new Double (10.05);
			Double  d2 =  new Double ("20.10");
			
			Character c1 = new Character ('a');
			Character c1 = new Character ("a");   // invalid
## Scanner Class
- Scanner class in Java is used to take input from the user
- It is part of the `java.util` package
- It is commonly used to read primitive data types and strings from keyboard

			nextInt()    --->    Reads an integer
			nextFloat()    --->    Reads a float
			nextDouble()    --->    Reads a double
			next()    --->    Reads a single word
			nextLine()    --->    Reads a full line
```java
	import java.util.Scanner;

	public class ScannerExample {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter your name: ");
	        String name = sc.nextLine();
	        
	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();
	        
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        
	        sc.close();
	    }
	}
```
## Assignments (LeetCode)
1) [Reverse Integer](https://leetcode.com/problems/reverse-integer/)
2) [Palindrome Number](https://leetcode.com/problems/palindrome-number/)
