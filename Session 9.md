# Session 9 - Constructors & Access Specifiers
## Constructor
- Constructor is a special method in java which is used to initialize instance variables
- Constructor name should be same as class name
- Constructor shouldn't have any return type (not even void)

```java
	class Demo {
		Demo ( ) {
			// logic
		}
	}
```

- **Note: At the time of object creation our class Constructor will be executed. Constructor is mandatory to create the object.**
- **Note: If we don't write the constructor in class, then java compiler will add one default constructor to our class.**
- **Note: If we write constructor in the class, then compiler will not add any constructor.**

- Constructors are divided into 2 types

        1) Zero Param Constructor / Default Constructor
        2) Parameterized Constructor

```java
	// Constructor without parameters
	class Student {
		Student ( ) {
			...
		}
	}
```

```java
	// Constructor which contains 1 or more paramters
	class Student {
		Student (int i, int b ) {
			...
		}
	}
```

```java
	class Employee {
		public Employee(String str) {
			System.out.println(str + ", Constructor Executed");
		}

		public static void main (String[] args) {
			Employee emp = new Employee("Hi");
		}
	}
```
## this keyword
- this is a predefined keyword in java
- It is used to represent current class object

```java
	class Employee {
		String name;
		float salary;

		public Employee(String name, float salary) {
			this.name = name;
			this.salary = salary;
			System.out.println(this.name + "--" + this.salary);
		}

		public static void main(String[] args) {
			Employee emp = new Employee("Raju", 55000.00f);
		}
	}
```
## Constructor Overloading
- Writing more than one constructor with different parameters is called as Constructor Overloading

```java
	// Constructor Overloading
	class Employee {
		Employee(int id){
			// logic
		}
		
		Employee(double d){
			// logic
		}
		
		Employee(int id, double d){
			// logic
		}
	}
```
## Constructor Chaining
- When one constructor calls another constructor it is called constructor chaining
```java
	// Constructor chaining
	class Employee {
		int id;
		double salary;
		String role;
		
		Employee() {
			this(100, 10000.0, "Teacher"); // constructor chaining
		}
		
		Employee(int id, double salary, String role) {
			this.id = id;
			this.salary = salary;
			this.role = role;
		}
		
		public static void main(String[] args) {
			Employee e = new Employee();
			System.out.println(e.toString());
		}
	}
```
## Access Specifiers
- These are used to specify accessibility for our classes, constructors, variables & methods
- In java we have below 4 access specifiers / modifiers

    	1) public
    	2) private
    	3) protected
    	4) default
### public
- It is used to specify global access for classes, variables, methods and Constructors

    	-> We can take class as public
    	-> We can take constructor as public
    	-> We can take variables as public
    	-> We can take methods as public

**Note: public means anybody can access from inside and outside the class also.**
### private
- It is used to specify local access (with in the class). private variables, private methods, private constructors can't be accessed outside of the class.

    	-> We can't use private for classes  (not allowed)
    	-> We can take variables as private
    	-> We can take constructor as private (no body can create obj from outside of cls)
    	-> We can take method as private (no body can call our method from outside of cls)
### protected
- Protected members can be accessed in same package & its sub classes
### default
- default members can be accessed in same package. When we don't specify any modifier then it comes under default modifier

			private  -->  default  -->  protected  -->  public

**Note: only public and default modifiers are allowed for classes. private and protected are not allowed.**
