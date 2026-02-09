# Session 5 - Loops (for, while, do-while)
## Loops
- Loops are used to execute statements repeatedly
- In java we have below loops

	    	1) while loop
	    	2) do-while loop
	    	3) for loop
	    	4) for-each loop
### while loop
- While loop is used to execute statements until condition is true
- while loop is called as conditional based loop
- If condition is true then loop statements will execute otherwise loop will be terminated
```java
	// while loop syntax
	while ( condition ){
		//stmts
	}
```

```java
	// Write a java program to print numbers from 1 to 10 using while loop
	class WhileDemo {
		public static void main (String... args){
			int i = 1;
			while ( i <= 10 ){
				System.out.println(i);
				i++;
			}
		}
	}
```
### do-while loop
- It is used to execute statements first then it will check the condition
- do-while is also called as conditional based loop only
```java
	// do-while loop syntax
	do{
		//stmts
	} while (condition );
```

```java
	// Write a java program to print numbers from 1 to 10 using do-while loop
	class DoWhile{
		public static void main(String... args){
			int i = 1;
			do {
				System.out.println(i);
				i++;
			} while (i <= 10);
		}
	}
```

**Q) What is the difference between while and do-while ?**  
**while ==>** It will check the condition first then it will execute the statements  
**do-while ==>** It will execute statement first then it will check condition.  
**Note: Even if condition is not satisfied our statement will execute once.**
### for loop
- It is used to execute statements multiple times
- For loop is called as Range based loop
```java
	// for-loop syntax
	for ( initialization ; condition ; increment / decrement ) {
		//stmts
	}
```

```java
	// Write java program to print numbers from 1 to 10 using for loop
	class ForLoop {
		public static void main(String... args) {
			for ( int i = 1 ; i <= 10 ; i++ ) {
				System.out.println(i);
			}
		}
	}
```
### break and continue
#### break
- It is used to come out from switch case and from loops
```java
	// break demo
	class Break {
		public static void main(String... args){
			for (int i = 1; i<= 10; i++ ){
				if (i >= 5 ){
					break;
				}
				System.out.println(i);
			}
		}
	}
```
#### continue
- It is used to skip one iteration in the loop execution then continue
```java
	// continue demo
	class Continue {
		public static void main(String... args){
			for (int i = 1; i<= 10; i++ ){
				if(i == 6 ) {
					continue;
				}
				System.out.println(i);
			}
		}
	}
```
### Infinite Loop
- A loop which does not have any termination (keeps running forever)
```java
	// Infinite loop
	while(true){
		System.out.println("Hello World !!");
	}
```

```java
	int i = 10;
	while(i == 10){
		System.out.println("Hello World !!");
	}
```
### Nested Loops
- A loop which contains another loop inside its body
```java
	 // Writing one loop inside another loop is called as Nested loop
		for ( int i = 1; i <= 5 ; i++ ){
			for ( int j = 1; j< = 5; j++){
			}
		}
```

```java
	// Write a java program to print below pattern using loops
	*
	* *
	* * *
	* * * *
	* * * * *

	class NestedLoop {
		public static void main(String... args){
			for ( int i = 1; i <=5 ; i++ ){
				for ( int j = 1; j <= i ; j++ ){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
```

```java
	// Write a java program to print below pattern
	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5

	class NestedLoop {
		public static void main(String... args){
			for ( int i = 1; i <=5 ; i++ ){
				for ( int j = 1; j <= i ; j++ ){
					System.out.print(j);
				}
				System.out.println();
			}
		}
	}
```
### Assignments (LeetCode)
1) [Fizz Buzz](https://leetcode.com/problems/fizz-buzz/)
2) [Count Primes](https://leetcode.com/problems/count-primes/)
