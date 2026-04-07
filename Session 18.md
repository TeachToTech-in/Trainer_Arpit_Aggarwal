# Session 18 - Spring & Spring Boot
## Spring Framework
- Spring Framework released in 2004 (First Production Release)
- It is an application development framework
- Entire project can be developed by using Spring framework
- It is a free & open source framework
- Spring is very light weight framework
## Dependency Injection
- The process of injecting one class object into another class object is called as Dependency Injection
- We can perform Dependency Injection in 3 ways

	      	1) Setter Injection
	      	2) Constructor Injection
	      	3) Field Injection

```java
	// IPayment interface
	public interface IPayment {
		public String pay(double amount);
	}
	
	// BillCollector class
	public class BillCollector {
		private IPayment payment;
		
		public void setPayment(IPayment payment) {
			this.payment = payment;
		}
		
		public BillCollector() { }
		
		public BillCollector(IPayment payment) {
			this.payment = payment;
		}
		
		public void payBill(double amount) {
			String status = payment.pay(amount);
			System.out.println(status);
		}
	}
```
### Setter Injection
- The process of injecting one class object into another class object using setter method is called as Setter Injection.

```java
	// injecting dependent obj into target obj using setter method
	BillCollector bc = new BillCollector();
	bc.setPayment(new CreditCardPayment()); // setter injection
	bc.payBill(1400.0);
```
### Constructor Injection
- The process of injecting one class object into another class object using constructor is called as Constructor Injection

```java
	// injecting dependent obj into target obj using constructor
	BillCollector bc = new BillCollector(new DebitCardPayment()); // constructor injection
	bc.payBill(1500.0);
```
### Field Injection
- The process of injecting one class object into another class object using variable (field) is called as Field Injection
## Inversion of Control (IOC)
- IOC is a principle which is responsible to manage and collaborate dependencies among the classes available in the application
- If we develop the project using spring framework then Spring IOC will take care of dependency injections in our application
## Aspect Oriented Programming (AOP)
- AOP is used to separate cross-cutting logic from business logic

		Eg: We write separte exception handling logic
## Bean Scopes
- Bean scope will decide how many objects should be created for a spring bean
- The default scope of spring bean is singleton (that means only one object will be created)
- We can configure below scopes for spring bean

      	1) Singleton
      	2) Prototype
      	3) Request
      	4) Session
      	5) Application
      	6) WebSocket

- For singleton beans objects will be created when IOC starts
- For prototype beans every time new object will be created
- For request scope one bean per request will be created
- For session scope one bean per session will be created
- For application scope one bean per entire app will be created
- For websocket scope one bean per websocket session
- Default scope for spring beans is singleton
## Autowiring
- Autowiring is used to perform dependency injection
- In Spring framework IOC container will perform dependency injection
- We will provide instructions to IOC to perform DI in 2 ways
- To perform autowiring we will use `@Autowired` annotation
- `@Autowired` annotation we can use at 3 places

	      	1) setter method level (Setter Injection - SI)
	      	2) constructor level (Constructor Injection - CI)
	      	3) variable level (Field Injection - FI)
## Lifecycle Callbacks in Spring
- Lifecycle callbacks are methods that Spring calls automatically at different stages of a bean’s life
- These are used to initialize the resources & cleaning up the resources
- There are two types of lifecycle callbacks

		1) Initialization Callback
		2) Destruction Callback

```java
	// Initialization Callback
	@Component
	class MyBean {
	    @PostConstruct
	    public void init() {
	        System.out.println("Bean initialized");
	    }
	}
	
	// Destruction Callback
	@Component
	class MyBean {
	    @PreDestroy
	    public void destroy() {
	        System.out.println("Bean destroyed");
	    }
	}
```
## Bean Configuration Styles
- We can configure Spring Beans in 3 ways

		1) XML Approach (Outdated)
		2) Java Config
		3) Annotations
### XML Approach
- We can define configuration using XML
```xml
	<beans>
	    <bean id="engine" class="com.example.Engine"/>
	    
	    <bean id="car" class="com.example.Car">
	        <property name="engine" ref="engine"/>
	    </bean>
	</beans>
```
### Java Config
- We can create a Java configuration class
```java
	@Configuration
	public class AppConfig {
	    @Bean
	    public Engine engine() {
	        return new Engine();
	    }
	    
	    @Bean
	    public Car car() {
	        return new Car(engine());
	    }
	}
```
### Annotations
- We can configure our Java classes using annotations directly
```java
	@Componenet
	public class Engine {
		// logic
	}
```





