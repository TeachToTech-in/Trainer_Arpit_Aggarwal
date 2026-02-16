# Session 7 - Strings & StringBuilder
## Strings
- String is a pre-defined class available in `java.lang` package
- String is used to store group of characters

```java
	String name = "abc" ;
```

- String is immutable in java ( can't be modified )
- We can create String object in 2 ways

```java
	// approach - 1  (string literal)
	String  name = "arpit";
	
	// approach -2 (using new operator)
	String str = new String ("arpit");
```
## String Constant Pool
- It is special memory in JVM to store String objects
- It will not allow us to create duplicate objects

```java
	String s1 =  "hi" ;
	String s2 = "hi" ;
```

- s1 and s2 objects are having same content hence only one object will be created and two variables will be pointing to same object.

```java
	class StringDemo {
		public static void main(String[ ] args) {
			String s1 =  "hi" ;
			String s2 = "hi" ;
			
			if ( s1 == s2 ) {
				System.out.println (" Both are same ");
			}else {
				System.out.println(" Both are not same" );
			}
		}
	}
```

- If we create String objects using 'new' operator always new object will be created in Heap area.

```java
	class StringDemo {
		public static void main(String[ ] args) {
			String s1 =  new String ("hello") ;

			String s2 = new String ("hello") ;

			if ( s1 == s2 ) {
				System.out.println (" Both are same ");
			}else {
				System.out.println(" Both are not same" );
			}
		}
	}
```

**Note: In Strings == will compare address of the objects not content.**
### String class Methods
#### charAt ( )
- To get a character based on given index

```java
	String s1 = "arpit";
	System.out.println(s1.charAt(0));
```
#### length ( )
- To get size of string ( no.of characters available in String )

```java
	String s1 = "arpit";
	System.out.println(s1.length( ) );
```
#### concat ( )
- To join two strings (appending)

```java
	String s1 = "arp";
	String s2 = "it";
	String s3 = s1.concat(s2);
	// String s4 = s1 + s2 ;
	System.out.println(s3);
```
#### equals ( )
- To compare content of two Strings

```java
	String s1 = "hi";
	String s2 = "hello";
	System.out.println( s1.equals(s2) );
```

**Note: In Strings, == operator will compare address of string objects where as `equals()` method will compare content of the objects.**
#### toUpperCase ( )
- To convert string to uppercase string

```java
	String s1 = "hi"
	Sytem.out.println(s1.toUpperCase());
```
#### toLowerCase ( )
- To convert String to lowercase String

```java
	String s1 = "Hello"
	Sytem.out.println(s1.toLowerCase());
```
#### indexOf ( )
- To get first occurrence of char

```java
	String s1 = "arpit";
	System.out.println(s1.indexOf('a'));
```
#### lastIndexOf ( )
- to get last occurrence of char

```java
	String s1 = "Hello"
	System.out.println(s1.lastIndexOf('l'));
```

**Note: If given char is not available then it will return '-1'**
#### substring ( )
- It is used to get some part of the string. It will take start index & end index.

```java
	// start-index : inclusive
	// end-index : exclusive
	System.out.println(s1.substring(0,5));
```

**Note: If we don't give end index, it will print from start index to last index.**
#### valueOf ( )
- It is used convert any type value into String type

```java
	int a = 10 ;
	int b = 20 ;

	a + b   ===> 30

	String s1 = "10";
	String s2 = "20";

	s1 + s2  ==> "1020"

	String.valueOf (a) + String.valueOf (b) ==> 1020
	"10" + "20" ==> 1020
```

**Note: valueOf ( ) is a static method in String class. Static methods will be called using classname. Non-Static methods will be called using Object.**
#### trim ( )
- It is used to remove starting and ending spaces of String

```java
	String str = "     hello    ";
	str.trim ( );
```
#### toString ( )
- It is used to convert object into string format.
#### toCharArray ( )
- This method is used to convert String to char array

```java
	String s1 = "java";
	char arr[ ]  = s1.toCharArray ( );
```
## StringBuffer
- It is a predefined class available in `java.lang` package
- It is also used to store group of characters
- StringBuffer is a mutable object (we can modify the content)
- StringBuffer is thread-safe (only one thread can access at a time)

```java
	StringBuffer sb  = new StringBuffer("hello");
```

```java
	// StringBuffer example
	class SBDemo {
		public static void main (String[ ] args){
			StringBuffer sb1 = new StringBuffer("hi");
			sb1.append(" hello");
			System.out.println(sb1);
			
			StringBuffer sb2 = new StringBuffer("java");
			System.out.println(sb2.reverse());
		}
	}
```
## StringBuilder
- StringBuilder is a predefined class available in `java.lang` package
- This class introduced in JDK 1.5v
- StringBuilder objects are mutable (content can be modified)
- StringBuilder objects are not thread safe (Multiple threads can access at a time)

```java
	StringBuilder sb = new StringBuilder("java");
	sb.length ( );
	sb.append("program");
```

```java
	class BuilderDemo {
		public static void main (String[ ]  args){
			StringBuilder sb =  new StringBuilder("java") ;
			System.out.println(sb.length());
			
			sb.append(" program");
			
			System.out.println(sb);
			System.out.println(sb.length());
		}
	}
```

**Q) What is the difference between String, StringBuffer & StringBuilder ?**  
**String ->** Immutable --> Jdk 1.0  
**StringBuffer ->** Mutable + Thread-Safe --> Jdk 1.0  
**StringBuilder ->** Mutable + Not-Thread-Safe --> Introduced in jdk 1.5v