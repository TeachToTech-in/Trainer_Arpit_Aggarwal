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
## for-each loop
- for-each loop is used to iterate arrays and collections
```java
	// for-each loop example
	class ArrayDemo {
		public static void main(String... args) {
			int arr [ ]  = { 101, 102, 103, 104 } ;
			for (int temp : arr){
				System.out.println(temp);
			}
		}
	}
```
## Types of Arrays
- Arrays are divided into 2 types
```java
	// 1) Single Dimensional Array
		int arr[ ] =  new int[size];
	// 2) Multi Dimensional Array
		int arr[ ][ ] = new int[rowsSize][columnsSize];
```
## 2D Arrays
- 2D arrays are having rows and columns
- Each row of 2D array is a 1D array
```java
	// Multi-Dimensional Arrays Demo
	class TwoDimensionArray{
		public static void main(String... args){
			int arr [ ] [ ] = new int [ 2 ] [ 2 ];
			arr [0] [0] = 100 ;
			arr [0] [1] = 200;
			arr [1] [0] = 300;
			arr [1] [1] = 400;
			for (int i = 0; i < arr.length ; i ++ ){
				for ( int j = 0; j <arr.length ; j ++ ){
					System.out.println(arr[i][j]);
				}
			}
		}
	}
```

```java
	// Iterating 2D array using for-each loop
	public class Demo {
		public static void main(String[] args) {
			int arr[][] = { { 100, 200 }, { 300, 400 } };

			for (int[] ar : arr) {
				for(int x : ar) {
					System.out.println(x);
				}
			}
		}
	}
```

```java
	// Converting Array to String
	import java.util.Arrays;
	
	public class Demo {
		public static void main(String[] args) {
			int arr[][] = { { 100, 200 }, { 300, 400 } };
			
			for (int[] temp : arr) {
				System.out.println(Arrays.toString(temp));
			}
		}
	}
```

```java
	// Add Two Matrix
	import java.util.Scanner;
	
	public class MatrixAddition {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();
	        
	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();
	        
	        int[][] matrix1 = new int[rows][cols];
	        int[][] matrix2 = new int[rows][cols];
	        int[][] result = new int[rows][cols];
	        
	        System.out.println("Enter elements of first matrix:");
	        for(int i = 0; i < rows; i++) {
	            for(int j = 0; j < cols; j++) {
	                matrix1[i][j] = sc.nextInt();
	            }
	        }
	        
	        System.out.println("Enter elements of second matrix:");
	        for(int i = 0; i < rows; i++) {
	            for(int j = 0; j < cols; j++) {
	                matrix2[i][j] = sc.nextInt();
	            }
	        }
	        
	        // Adding matrices
	        for(int i = 0; i < rows; i++) {
	            for(int j = 0; j < cols; j++) {
	                result[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }
	        
	        System.out.println("Result :");
	        for(int i = 0; i < rows; i++) {
	            for(int j = 0; j < cols; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        sc.close();
	    }
	}
```

