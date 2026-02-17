# Session 8 - Classes & Objects
## Class
- Class is a plan or model or template
- Class is a blue print of object
- Class is used to declare variables & methods
- Once class is created then we can create any no of objects for a class
- `class` keyword is used to create Classes in java

```java
	// class sytax
	class ClassName {
		// variables
		// methods
	}
```

**Note: Classes will not exist physically.**
## Object
- Any real-world entity is called as Object
- Objects exist physically
- Objects will be created based on the Classes
- Without having the class, we can't create object (class is mandatory to create objects)
- Object creation means allocating memory in Heap
- `new` keyword is used to create the objects

```java
	// obj creation syntax
	ClassName   refVariable = new ClassName();
```

```java
	User  u1  = new User();
	User u2 = new User() ;
```
## Variables
- Variables are used to store the data

```java
	int a  = 10 ;

	User u1 = new User ( );
	Student s1 = new Student ( );
```

- Variables are divided into 3 types

    	1) Global Variables / instance variables / non-static variables
    	2) static variables
    	3) local variables
### Instance Variables
- Variables which are declared inside the class and outside the method are called as instance variables
- instance variables can be accessed by all the methods available in the class thats why the are called as Global Variables
- Instance variables are called as object variables
- When we create the object, then only memory will be allocated for instance variables
- Every Object will maintain its own copy of the instance variable

**Note: If we create 2 objects, then 2 times memory will be allocated for instance variables**

```java
	public class User {
		int age;
		
		public static void main(String[] args) {
			User raju = new User();
			raju.age = 20;
			System.out.println(raju.age);
			
			User rani = new User();
			rani.age = 25;
			System.out.println(rani.age);
		}
	}
```
### Static Variables
- The variables which are declared inside the class and outside the method with `static` keyword are called as static variables
- Static variables are class level variables
- When class is loaded into JVM then immediately memory will be allocated for static variables
- Memory will be allocated for static variables only once when the class is loaded into JVM
- All objects of the class will maintain same copy of the static variables
- Static variables we will access using classname

```java
	public class Student {
		String name;
		String email;
		long phno;
		static String institute;

		public static void main(String[] args) {
			Student.institute = "TeachToTech";

			Student ankit = new Student();
			ankit.name = "Ankit";
			Student goutham = new Student();
			goutham.name = "Goutham";
		}
	}
```

**When to declare variable as static or non-static ?**
- If we want to store different value based on object then use instance variable
- If we want to store same value for all objects then use static variable
### Local Variables
- The variables which are declared inside the method or constructor or block are called as Local Variables
- If we declare a variable with in the method, then that variable can be used / accessed only with in that method
- Before using local variables, we have to initialize them
- If we create a variable with in the method, memory will be allocated for that variable when that method is executing. After that method execution completed, local variable will be deleted from memory

```java
	class Demo {
		public static void main(String[ ] args){
			int a = 20;
			int b = 20;
			System.out.println(a);
			System.out.prinltn(b);
		}
	}
```
## Methods
- Methods are used to perform some operation
- In a class we can write any no of methods including main method
- If we want to execute our method then we have to call our methods from main ( ) method

```java
	// metod syntax
	returnType methodName (param1, param2, para3 ..... paramN) {
		//logic
		return value;
	}
```

```java
	// Write a method to print a msg on console
	void hello ( ) {
		System.out.println("Hello");
	}
```

```java
	// Take 2 numbers as input and return sum as ouput
	int  add ( int a, int b ) {
		int c = a + b ;
		return c;
	}
```

```java
	// take 2 names as input, concat them and print on console
	void  fullname (String fname, String lname) {
		String name = fname + lname;
		System.out.println(name);
	}
```

```java
	// take person age as input, if person age >=18 then return true else return false
	boolean  check (int age ){
		if ( age >= 18 ) {
			return true;
			} else {
			return false;
		}
	}
```
## Types of Methods
- Methods are divided into 2 types

		1) instance methods   ---> Object level methods
    	1) static methods ----> Class level method

- instance method will be called by using Object
- static method will be called by using Class

```java
	public class Student {
		public static void main(String[] args) {
			Student s1 = new Student();
			s1.hello();
			Student.greet();
		}

		void hello() {
			System.out.println("Hello My Friend...");
		}

		static void greet() {
			System.out.println("Good Evening..");
		}
	}
```

```java
	// Write a java method to print data available in the Student object
	class Student {
		int id;
		String name;
	}

	public class Driver {
		public static void main(String[] args) {
			Driver d = new Driver();

			Student s = new Student();
			s.id = 101;
			s.name = "raju";

			d.print(s);
		}
		void print(Student s) {
			System.out.println(s.id + "  " + s.name);
		}
	}
```

```java
	//  Take employee class with id and salary as properties
	//  Take Driver class and write the method to print employee object data & call the print method from main method
	class Employee {
		int id;
		double salary;
	}

	public class Driver {
		public static void main(String[] args) {
			Driver d = new Driver();

			Employee e = new Employee();
			e.id = 101;
			e.salary = 15000.00;

			d.print(e);
		}

		void print(Employee e) {
			System.out.println(e.id + "--" + e.salary);
		}
	}
```