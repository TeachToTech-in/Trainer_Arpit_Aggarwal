# Session 6 - Arrays (1D & 2D Arrays)
## Arrays
- It is a referenced data type
- It is used to store multiple values
- In Arrays, size is fixed ( we can't change the size in runtime )
- Arrays supports only homogeneous elements (same type of elements)
- Array is a container which is used to store collection of elements with same data type
```java
	// Array Declaration
	datatype [ ]  variableName;
	dataype variableName [ ] ;
	datatype  [ ]variableName ;

	// Array Creation
	variableName = new datatype [ size ] ;
	datatype[ ] variableName = new datatype [ size ] ;\
	int[ ]  arr = new int [ 5 ];
```
**Note: At the time of creating the array the size is mandatory**
- Array Size represents how many values we can store into Array
- Array will store the data based on indexes
- Array index always will start from zero
```java
	// Array Demo
	class ArrayDemo {
		public static void main(String... args){
			int [ ]  arr  = new int [ 3 ] ;
			
			arr[0] = 100;
			arr[1] = 101;
			arr[2] = 102;
			
			System.out.println ( arr [ 0 ] ) ;
			System.out.println ( arr [ 1 ] ) ;
			System.out.println ( arr [ 2 ] ) ;
		}
	}
```
- We can find size of the array using length property
```java
	// Array length Property
	class ArrayDemo {
		public static void main(String... args){
			int [ ]  arr  = new int [ 5 ] ;
			arr[0] = 100;
			arr[1] = 101;
			arr[2] = 102;
			
			System.out.println ( arr.length ) ;
		}
	}
```

```java
	class ArrayDemo {
		public static void main (String... args) {
			int arr[ ]  = new int [ 3 ] ;

			arr[0] = 100;
			arr[1] = 101;
			arr[2] = 102;

			for( int i = 0 ; i < arr.length ; i ++ ) {
				System.out.println ( arr [i] );
			}
		}
	}
```

```java
	class ArrayDemo {
		public static void main(String... args) {
			boolean [ ]  arr  = new boolean [ 3 ] ;

			arr [2] = true;

			for( int i = 0 ; i < arr.length ; i ++ ) {
				System.out.println ( arr [i] );
			}
		}
	}
```

```java
	class ArrayDemo {
		public static void main(String... args) {
			int arr [ ]  = { 101, 102, 103, 104 } ;
			for ( int i = 0; i < arr.length; i++){
				System.out.println(arr[i]);
			}
		}
	}
```

```java
	class ArrayDemo {
		public static void main(String... args) {
			int arr [ ]  = { 101, 102, 103, 104 } ;
			arr [ 0 ] = 200 ;	// it will update 0th index value from 101 to 200
			arr [ 1 ] = 300 ;  // it will update 1st index value from 102 to 300
			System.out.println ( arr [ 101 ] ) ;  // AIOBE ( 101 index not available in array )
		}
	}
```
**Note: Array size should be positive integer only**
- Decimal value can't be used for Array Size
- Negative value also can't be used for Array Size
## Types of Arrays
- Arrays are divided into 2 types
```java
	// 1) Single Dimensional Array
		int arr[ ] =  new int[size];
	// 2) Multi Dimensional Array
		int arr[ ][ ] = new int[rowsSize][columnsSize];
```


