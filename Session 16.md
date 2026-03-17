# Session 16 - Java New Features
## Functional Interfaces
- The interface which contains only one abstract method is called as Functional Interface
- Functional Interfaces are used to invoke Lambda expressions

```java
	// Java Program using Functional Interface
	interface MyInterface {
	    void display();
	}
	
	class Test implements MyInterface {
	    public void display() {
	        System.out.println("Hello from Functional Interface");
	    }
	    
	    public static void main(String[] args) {
	        Test obj = new Test();
	        obj.display();
	    }
	}
```
## Lambda Expression
- Lambda is an anonymous function

			No Name
			No Modifier
			No Return Type

```java
	// Example-1
	public void m1 ( ){
		s.o.p("hi");
	}
	
	( ) -> { s.o.p ("hi") }
	( ) -> s.o.p ("hi");
	
	// Example-2
	public void add (int a, int b){
		s.o.p(a+b);
	}
	
	(int a, int b)  -> { s.o.p (a+b) };
	(int a, int b) -> s.o.p (a+b);
	(a, b) -> s.o.p(a+b);
```

```java
	// Java Program using Lambda Expression
	interface MyInterface {  
		void show();  
	}
	
	public class Demo {
		public static void main(String[] args) {  
			MyInterface obj = () -> {  
			System.out.println("Hello using Lambda");  
			};
			obj.show();  
		}  
	}
```
## Default & Static Methods
- Interface can have concreate methods from 1.8v
- Interface concrete method should be default or static
- We can write multiple default & static methods in interface
- Default & Static method introduced to provide backward compatibility

```java
	// Program using default and static method of interface
	interface Vehicle {
		public void start();
		
		public default void applyBreak() {
			System.out.println("break applied...");
		}
		
		public static void clean() {
			System.out.println("cleaning completed...");
		}
	}
	
	public class Car implements Vehicle {
		public void start() {
			System.out.println("car started...");
		}
		public static void main(String[] args) {
			Car c = new Car();
			c.applyBreak();
			Vehicle.clean();
			c.start();
		}
	}
```
## Method Reference
- Method reference means Reference to one method from another method

```java
	// Invoking static method using Method Reference
	interface MyInterface {
		public void m1();
	}
	
	public class MethodRef {
		public static void m2() {
			System.out.println("This is m2( ) method");
		}
		
		public static void main(String[] args) {
			MyInterface mi = MethodRef::m2;
			mi.m1();
		}
	}
```
## Base64 Encode and Decode
- Base64 is a predefined class available in java.util package
- Base64 class providing methods to perform encoding and decoding

```java
	// Java Program using Base64
	import java.util.Base64;
	import java.util.Base64.Decoder;
	import java.util.Base64.Encoder;
	
	class Test {
		public static void main(String[] args) {
			String pwd = "Arpit@123";
			
			Encoder encoder = Base64.getEncoder();
			byte[] encode = encoder.encode(pwd.getBytes());
			String encodedPwd = new String(encode);
			System.out.println(encodedPwd);
			
			Decoder decoder = Base64.getDecoder();
			byte[] decode = decoder.decode(encodedPwd);
			String decodedPwd = new String(decode);
			System.out.println(decodedPwd);
		}
	}
```
## forEach Method
- forEach method introduced in java 1.8v
- forEach ( ) method is a default method (it is having body)
- This is method is used to access each element of the collection

```java
	// Java Program using forEach method
	import java.util.ArrayList;
	
	public class NumbersSort1 {
		public static void main(String[] args) {
			ArrayList<Integer> al = new ArrayList<>();
			al.add(5);
			al.add(3);
			al.add(4);
			al.add(1);
			al.add(2);
			
			al.forEach(i -> System.out.println(i));
		}
	}
```


