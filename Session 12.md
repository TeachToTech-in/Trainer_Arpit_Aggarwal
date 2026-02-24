# Session 12 - Packages
## Packages
- Packages are used to group the classes 
- In java language, so many classes are already available

	    Ex: String, StringBuffer, StringBuilder, Arrays, BufferedReader, Scanner etc....
- Sun people divided predefined classes, interfaces, Exceptions into several packages

    	1) java.lang
    	2) java.io
    	3) java.util
    	4) java.sql
- `java.lang` package is default package and it is available for all java classes by default
- If we want to use any predefined class which is not part of `java.lang` package then we have to import that class using `import` keyword
```java
	// Example of predefined package import
	import java.util.Scanner;

	public class ScannerExample {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter your name: ");
	        String name = sc.nextLine();
	        
	        System.out.println("Name: " + name);
	        
	        sc.close();
	    }
	}
```
## User Defined Packages
- In our project we will create our own packages to organize project related classes & interfaces
- To create a package we will use 'package' keyword
- In java class, package statement should be in first line and class should have only one package statement
- We can create user-defined package like below

    	package ashokit;
    	package com.tcs.aadhar;

- Sample package naming convention : `company-name.project-name.module-name`

		com.ibm.irctc.admin
			AdminLogin.java
			AdminService.java
			Request.java
## Static Imports
- Static import is used to access static members directly without using class name
```java
	// Person class
	package com.ibm.aadhar;
	
	public class Person {
		public static void speak() {
			System.out.println("Hi, i am ashok");
		}
		
		public static void m1() {
			System.out.println("hi, i am from m1()");
		}
		
		public static void m2() {
			System.out.println("hi, i am from m2()");
		}
	}
```

```java
	// Java Program with Normal Import to use Person class
	
	package in.ashokit;
	import com.ibm.aadhar.Person;
	
	public class Demo {
		public static void main(String[] args) {
			Person.speak();
			Person.m1();
			Person.m2();
		}
	}
```

```java
	// java program with static import
	
	package in.ashokit;
	import static com.ibm.aadhar.Person.*;
	
	public class Demo {
		public static void main(String[] args) {
			speak();
			m1();
			m2();
		}
	}
```
## Java Program Execution using CMD
- `javac` command is used to compile the java program

			javac <filename.java>
- After compilation `.class` file will be generated
- `java` command is used to execute the `.class` file

			java <filename>
## Jar Files
### How to create JAR file 
- JAR stands for Java Archive
- JAR contains collection of .class files
- **Executable jar (Runnable jar):** jar files with entry point
- **Note: All jar file doesn't have a entry point**

```bash
	// Syntax to create a jar file
	jar  cvfe  <filename.jar>  <main-class>  *.class
```

		a)  jar is a command to deal with jar files
				c - create
				v - verbose
				f - file
				e - entrypoint
		b)  main-class represents entrypoint for our application execution
		c) *.class means packaging all .class files available in current working directory
### How to run JAR file
```bash
	// Syntax to run jar file
	java  -jar  <jar-file-name.jar>
```

**Note: Only the jar files with entry point can be executed.**
### How to extract JAR file

```
	// Syntax to extract jar file
	jar -xvf  <jar-file-name.jar>
```

		x - extract
		v - verbose
		f - file

**Note: `-v` flag is optional while creating and extracting a jar file.**
## Classpath
- Classpath is used to locate where our .class files / jar files are available
- There are 2 ways to set classpath

			-cp : to set classpath for a particular command
			-classpath : to set classpath for a particular command

- To compile a java program, `javac` requires the source file and all the .class files which are being referred by the specified source file
- To run a java program, `java` command requires the .class file of the specified class and all the .class files which are being referred by the specified class
- If all these .class files are not present in the same directory, then we need to specify the path for all the .class files
- You can add any no of paths to the classpath which are separated by `";"`. You can add the current directory to the classpath by using `"."`
