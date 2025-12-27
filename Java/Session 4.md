# Session 4
## Conditional Statements
- Execute the code only once based on condition

    	1) simple if
    	2) if - else
    	3) nested if
    	4) if - else - if - else -if - else (if else ladder)
    	5) switch
### Simple if
- To execute the statements based on condition
```java
	// if Syntax
	if ( condition ){
	    // stmt - 1
	    // stmt - 2
	    // stmt - 3
	}
	// or
	if (condition )
	    //stmt
```

```Java
	// Simple if Demo
	class SimpleIf{
		public static void main(String... args){
			int a = 100;
			int b = 20;
			if( a > b ) {
				System.out.println("a is greater than b");
				System.out.println("Completed");
			}
			System.out.println("Bye");
		}
	}
```
### if-else
- It is also used to execute the code based on condition
```java
	// if-else Demo
	class IfElseDemo{
		public static void main (String... args){
			int age = 16 ;
			if ( age >= 18 ) {
				System.out.println("Eligible For Vote") ;
			} else {
				System.out.println("Not eligible for Vote");
			}
		}
	}
```
### Nested if-else
```java
	// Nested if else demo
	class NetedIf{
		public static void main(String... args){
			int age = 16 ;
			boolean hasId = true;
			if ( age >= 18 ) {
				if(hasId){
					System.out.println("Eligible For Vote");
				}
			} else {
				System.out.println("Not eligible for Vote");
			}
		}
	}
```
### Dangling else Problem
- If we do not use flower brackets to properly indent our code then there is a chance of getting dangling else problem
- Compiler will always associate the `else` part with the closest unmatched `if`
- To avoid dangling else problem we need to use 
```java
	// Dangling else Problem
	class NetedIf{
		public static void main(String... args){
			int age = 16 ;
			boolean hasId = true;
			if ( age >= 18 )
				if(hasId)
					System.out.println("Eligible For Vote");
			else
				System.out.println("Not eligible for Vote");
		}
	}
```

**Requirement :**

		int  a = 20;
		if a > 0 -----> display msg as 'a is positive number'
		if a < 0 ----> display msg as 'a is negative number'
		When above both conditions are failed then display msg as 'a is zero'

#### else-if ladder

```java
	// else-if ladder syntax
	if ( condition_1 ) {
			// stmt - 1
	} else if ( condition_2 ) {
		// stmt - 2
	} else  if ( condition_3 ) {
		//stmt - 3
	} else {
	 	//stmt-4
	}
```

- if condition_1 is pass then it will execute only stmt-1
- if condition_1 is fail then it will check condition_2
- If condition_2 is pass then it will execute only stmt-2
- If condition_2 is fail then it will check condition_3
- If condition_3 is pass then it will execute only stmt-3
- If condition_3 is fail then directly stmt-4 will be executed

```java
	// else-if ladder Demo
	class IfElseLadderDemo {
		public static void main(String... args){
			int a = 0;
			if( a > 0) {
				System.out.println(" a is positive number ");
			} else if ( a < 0 ) {
				System.out.println("a is negative number");
			} else {
				System.out.println("a is zero");
			}
		}
	}
```

```java
	// Develop a java program to decide role of software engineer based on his/her experience
	// 0 - 2  year exp  -----> Associate Engineer
	// 3 - 5 years exp -----> Software Engineer
	// 6 - 9 years exp -----> Sr.Software Engineer
	// 10 - 13 years exp ----> Manager

	class RoleFinder {
		public static void main(String... args) {
			int exp = 13;
			if( exp >= 0 && exp <= 2 ){
				System.out.println("Associate Engineer");
			}else if ( exp >= 3 && exp <= 5 ){
				System.out.println("Software Engineer");
			}else if(  exp >= 6 && exp <= 9 ){
				System.out.println("Sr. Software Engineer");
			}else if( exp >= 10 && exp <= 13 ){
				System.out.println("Manager");
			}else {
				System.out.println("Role Not Found");
			}
		}
	}
```

- In above program we have hardcoded value for the variable
- If we want to test our program with different values we need compile and execute everytime
- To overcome this problem we can read the data from keyboard
### switch
- Using switch case we can make decision
```java
	// switch Syntax
	switch ( case ) {

	case 1 :  // stmt - 1
	break;

	case 2 : // stmt - 2
	break;

	case 3 : // stmt - 3
	break;
	.....
	default : // stmt - default
	}
```

```java
	// Write a java program to read a number from keyboard. Based on the given number print week of the day using 'switch' case.
	import java.io.*;
	class WeekDay {
		public static void main(String... args) {
			int num = 2;

			switch ( num ) {
				case 1 : System.out.println("Monday");
						 break;

				case 2 : System.out.println("Tuesday");
					     break;

				case 3 : System.out.println("Wednesday");
					 break;

				case 4 : System.out.println("Thursday");
					  break;

				case 5 : System.out.println("Friday");
					 break;

				case 6 : System.out.println("Saturday");
					  break;

				case 7 : System.out.println("Sunday");
					 break;

				default : System.out.println("Day not found");
			}
		}
	}
```
### fall-through concept
```java
// Write a java program to read a number from keyboard. Based on the given number print week of the day using 'switch' case.
	import java.io.*;
	class WeekDay {
		public static void main(String... args) {
			int num = 4;

			switch ( num ) {
				case 1 : System.out.println("Monday");

				case 2 : System.out.println("Tuesday");

				case 3 : System.out.println("Wednesday");

				case 4 : System.out.println("Thursday");

				case 5 : System.out.println("Friday");

				case 6 : System.out.println("Saturday");

				case 7 : System.out.println("Sunday");

				default : System.out.println("Day not found");
			}
		}
	}
```

**Conclusion**

	1) 'if' accepts only boolean value (or) boolean expression
	2) 'switch' accepts numbers, char & strings (added in java 1.7v)
	3) switch will not accept boolean and decimal values
	4) switch cases should belongs to same type
	5) switch case datatype and switch case input value should belongs to same datatype
	6) 'default' case is optional in 'switch case'
	7) 'break' keyword is also optional in 'switch case'
#### Switch Advancements (Java 14+)
- Works as an expression (returns a value)
- Uses arrow syntax (`->`)
- No need for `break`
```java
	// switch Advancements
	int day = 6;
	
	String type = switch (day) {
	    case 1, 2, 3, 4, 5 -> "Weekday";
	    case 6, 7 -> "Weekend";
	    default -> "Invalid";
	};
```
### Assignments (LeetCode)
1) [Number of Steps](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/)
2) [Power of Two](https://leetcode.com/problems/power-of-two/)