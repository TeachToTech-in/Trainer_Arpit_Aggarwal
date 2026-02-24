# Session 11 - Abstraction & Interfaces
## Abstraction
- The process of hiding un-necessary part and showing only useful part is called as Abstraction
- We can achieve abstraction using Interfaces & Abstract classes
## Method Types
- In java we can write 2 types of methods

    	1) Concrete Method
    	2) Abstract Method

- The method which contains body is called as Concrete method
```java
	public void m1( ){
		// logic
	}
```

- The method which doesn't contain body is called as Abstract method
```java
	public abstract void m2( );
```

**Note: By using `abstract` keyword we can create abstract methods & abstract classes.**
## Abstract Classes
- The class which contains both concrete and abstract methods is called as abstract class
- Abstract classes are used to achieve partial abstraction
- We will use `abstract` keyword to represent class as abstract class
- We can write constructor in abstract class but we can't create object
- Abstract classes can have child classes
- When we extend properties from abstract class then it is mandatory to override all abstract methods of that class
- Abstract class constructor will be executed when we create object for child class

```java
	// Abstract class declared with the abstract keyword
	abstract class Animal {
	    public abstract void makeSound();
	    
	    public void sleep() {
	        System.out.println("Animal Sleeping");
	    }
	}

	class Dog extends Animal {
	    public void makeSound() {
	        System.out.println("Woof Woof");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Dog myDog = new Dog();
	        myDog.makeSound();
	        myDog.sleep();
	    }
	}
```
## Interfaces
- Interfaces are used to achieve loosely coupling & abstraction
- Interfaces contains only abstract methods (upto 1.7v of java)
- To create a interface we will use `interface` keyword
- Interface doesn't contain constructor
- We can't create object for the interface
- Once interface is created then anybody can provide implementation for the interface
- Implementing interface means overriding interface abstract methods
- When we are implementing a interface then it is mandatory to implement all abstract methods of that interface
- To implement a interface we will use `implements` keyword 

**Note: One java class can implement Multiple Interfaces at a time.**

```java
	// Interface example
	public interface Bank {
		public void moneyTransfer();
		public void checkBalance();
	}

	public class HdfcBank implements Bank {
		public void moneyTransfer() {
			System.out.println("Money Transfer from HDFC....");
		}

		public void checkBalance() {
			System.out.println("Checking Balance from HDFC.....");
		}
	}

	public class AxisBank implements Bank {
		public void moneyTransfer() {
			System.out.println("Money Transfer from Axis ....");
		}

		public void checkBalance() {
			System.out.println("Check Balance from Axis....");
		}
	}

	public class BankDemo {
		public static void main(String[] args) {
			Bank b; // reference variable

			b = new AxisBank(); // storing impl obj into ref variable
			b.moneyTransfer(); // axis-bank method will be called
			b.checkBalance(); // axis-bank method will be called

			b = new HdfcBank();  // storing impl obj into ref variable
			b.moneyTransfer(); // hdfc-bank method will be called
			b.checkBalance(); // hdfc-bank method will be called
		}
	}
```

**Note: Interface reference variable can hold its implementation class object.**

- When method is taking interface as parameter that means that method is expecting interface implementation class object as parameter
- In Interface we can declare variables also, by default they are public static final
```java
	public interface Bank {
		int rateOfInterest = 12;
	}
```
## Multiple Inheritance using Interfaces
- In Java we can achieve multiple inheritance using interfaces
- A class can multiple interfaces
```java
	public interface A {
		public void m1();
	}
	
	public interface B {
		public void m1();
	}
	
	public class Demo implements A, B {
		public void m1() {
			System.out.println("Demo :: m1()");
		}
		
		public static void main(String[] args) {
			Demo d = new Demo();
			d.m1(); // Demo m1() will called
		}
	}
```