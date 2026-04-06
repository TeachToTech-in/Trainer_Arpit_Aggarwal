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
## Stream API
- Stream API introduced in Java 8
- Stream is used to process the data
- Stream can be defined as a sequence of elements that comes from a source
### Stream Creation
- In Java we can create Stream in 2 ways

		1) Stream.of (e1, e2, e3, e4.....)
		2) stream ()
### Stream Operations
- We can perform below operations using Streams

		1) filter
		2) map
		3) count

```java
	// Stream API Example
	public class Demo {
	    public static void main(String[] args) {
	        Stream st = Stream.of(5, 12, 8, 20, 3, 15);
	        
	        long count = st
	                .filter(n -> n > 10)     // Step 1: filter numbers > 10
	                .map(n -> n * 2)         // Step 2: multiply each by 2
	                .count();                // Step 3: count elements
	                
	        System.out.println("Count: " + count);
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
## try with resources
- try with resources is a feature introduced in Java 7
- It is used to automatically close resources like files

```java
	// try with resources example
	import java.io.FileInputStream;
	import java.io.IOException;
	
	public class Demo {
	    public static void main(String[] args) {
	        try (FileInputStream fis = new FileInputStream("test.txt")) {
	            int data;
	            while ((data = fis.read()) != -1) {
	                System.out.print((char) data);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
```
## Type Annotations
- Type annotations introduced in Java 8
- It allows us to add metadata to types
- It improves code safety and readability
- It can be applied to variables, generics & casting
```java
	// Variable
	@NonNull String name = "Arpit";
	
	// Generic
	List<@NonNull String> list = new ArrayList<>();
	
	// Casting
	String str = (@NonNull String) obj;
```

```java
	// Creating Custom Annotation
	import java.lang.annotation.*;
	
	@Target(ElementType.TYPE_USE)
	@Retention(RetentionPolicy.RUNTIME)
	@interface NonNull {
		// logic
	}
```

```java
	// Type Annotation Example
	public class Demo {
	    public static void main(String[] args) {
	        @NonNull String name = "Java";
	        System.out.println(name);
    }
}
```
## Repeating Annotations
- Repeating Annotations introduced in Java 8
- Repeating annotations can be used more than once on the same declaration

```java
	// Create Annotation
	import java.lang.annotation.*;
	
	@Retention(RetentionPolicy.RUNTIME)
	@Repeatable(Roles.class)   // Link to container
	@interface Role {
	    String value();
	}
```

```java
	// Create Container Annotation
	@Retention(RetentionPolicy.RUNTIME)
	@interface Roles {
	    Role[] value();
	}
```

```java
	// Using Repeating Annotations
	@Role("Admin")
	@Role("User")
	class Demo {
		// logic
	}
```
## Java Module System
- Java module system introduced in Java 9
- A module is a collection of packages
- Module system helps in organizing large applications and Provides strong encapsulation
- Controls access between different parts of a program

```java
	// module-info.java
	module calculator {
	    exports com.calc;
	}
```

```java
	// Add Class
	package com.calc;
	
	public class Add {
	    public int sum(int a, int b) {
	        return a + b;
	    }
	}
```
## Diamond Syntax with Anonymous Inner Class
### What is Diamond Syntax ?
- It is introduced in Java 7
- It is used with generics
- It reduces the repeating type parameters

```java
	// Without Diamond Syntax
	List<String> list = new ArrayList<String>();
	
	// With Diamond Syntax
	List<String> list = new ArrayList<>();
```
### What is Anonymous Inner Class ?
- A anonymous inner class is a class with no name
- It is created inside another class

```java
	// Anonymous Inner Class
	public class MyThread {
		public static void main(String[] args) {
			Runnable r = new Runnable() {
				public void run() {
					System.out.println("Running...");
				}
			};
			
			Thread t = new Thread(r);
			t.start();
		}
	}
```

- Before Java 9 we can't use diamond syntax with anonymous inner classes
```java
	// Not Allowed Before Java 9
	ArrayList<String> list = new ArrayList<>() {
	    // anonymous class
	};
```

```java
	// Anonymous Inner Class with Diamond Syntax
	ArrayList<String> list = new ArrayList<>() {
	    @Override
	    public boolean add(String e) {
	        System.out.println("Adding: " + e);
	        return super.add(e);
	    }
	};
```
## Local Variable Type Inference
- Local Variable Type Inference introduced in Java 10
- It allows compiler to automatically infer (detect) the type
- It uses `var` keyword

```java
	var x = 10;        // int
	var name = "Arpit"; // String
	var price = 99.99; // double
```
## Switch Expressions
- It is introduced in Java 14
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
## Yield Keyword
- It is introduced in Java 14
- It is used inside `switch` expression
- It us used to return a value when a case is having more than one statement

```java
	// yield keyword
	int num = 5;
	
	String result = switch (num) {
	    case 1 -> "One";
	    case 5 -> {
	        System.out.println("Matched 5");
	        yield "Five";
	    }
	    default -> "Other";
	};
	
	System.out.println(result);
```
## Text Blocks
- Text blocks are introduced in Java 15
- It is used to write multi-line strings easily
- It uses triple qoutes `"""`
```java
	String text = """
	              Hello
	              World
	              """;
```
## Record Class
- It is introduced in Java 16
- It is used to create immutable class
- It generates getters, parametrized constructor etc. automatically
- It helps reducing boilerplate code

```java
	// Creating record class object
	record Student(String name, int age) {}
	
	public class Main {
	    public static void main(String[] args) {
	        Student s = new Student("Arpit", 21);
	        System.out.println(s.name());
	        System.out.println(s.age());
	    }
	}
```
## Sealed Classes
- It is introduced in Java 17
- `sealed` is a keyword which is used to restrict which classes can extend our class
- If a class extends a sealed class then the class should be `sealed`, `non-sealed` or `final`

```java
	sealed class Vehicle permits Car, Bike {}
	
	final class Car extends Vehicle {}
	
	non-sealed class Bike extends Vehicle {}
```
## Enum (Enumration)
- Enum is special data type in Java
- It is used to define a set of constants
- We can use these set of constants as data type in our program

```java
	// Enum Day
	enum Day {
	    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	public class Demo {
	    public static void main(String[] args) {
	        Day today = Day.MONDAY;
	        System.out.println(today);
	    }
	}
```


