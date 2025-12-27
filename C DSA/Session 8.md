# Session 8
## Introduction to Pointers
- A **pointer** is a variable that stores the **memory address** of another variable. Pointers allow direct memory access and are widely used in system programming, arrays, strings, and functions.
```c
	int x = 10;
	int *p = &x;
```
### Memory Diagram

```
+------+        +------------+
|  p   | -----> |   x = 10   |
+------+        +------------+
```
### Pointer Declaration
```
data_type *pointer_name;
```

```c
	int a = 5;
	int *ptr = &a;
```
### Dereferencing a Pointer
- Dereferencing means accessing the value stored at the address pointed to by the pointer.
```c
	#include <stdio.h>
	int main() {
	    int a = 10;
	    int *p = &a;
	    
	    printf("Value of a: %d", *p);
	    return 0;
	}
```
## Pointer Arithmetic
- Pointer arithmetic allows moving the pointer to the next or previous memory location.
- `p + 1` moves to the next element of the same data type
- Actual jump depends on data type size
```c
	#include <stdio.h>
	int main() {
	    int arr[3] = {10, 20, 30};
	    int *p = arr;
	    
	    printf("%d %d %d", *p, *(p+1), *(p+2));
	    return 0;
	}
```
## Pointers with Arrays
- Array name is a pointer to the first element
```c
	arr[i]  ==  *(arr + i)
```

```c
	#include <stdio.h>
	int main() {
	    int arr[] = {1,2,3};
	    int *p = arr;
	    
	    for(int i=0; i<3; i++)
	        printf("%d ", *(p+i));
	        
	    return 0;
	}
```
## Pointers with Strings
- Strings are character arrays terminated by `\0`.
```c
	#include <stdio.h>
	int main() {
	    char str[] = "Hello";
	    char *p = str;
	    
	    while(*p != '\0') {
	        printf("%c", *p);
	        p++;
	    }
	    return 0;
	}
```
## Types of Pointers in C
### Data Pointer
- Points to a variable of a specific data type.
```c
	int x = 10;
	int *ip = &x;

	char c = 'A';
	char *cp = &c;
```
### Null Pointer
- A pointer that points to **no valid memory location**.

```c
	int *p = NULL;
```
#### Use
- Safety check
- Avoid accidental access
### Void Pointer
- A generic pointer that can point to any data type.
```c
	#include <stdio.h>
	int main() {
	    int x = 10;
	    void *p = &x;

	    printf("%d", *(int*)p);
	    return 0;
	}
```

**Note: Must be type-cast before dereferencing.**
### Wild Pointer
- A pointer declared but **not initialized**.

```c
	int *p;   // Wild pointer
```

**Note: It is dangerous because it may access random memory.**
### Function Pointer
- A pointer that stores the address of a function
```c
	#include <stdio.h>

	void add() {
	    printf("Addition Function\n");
	}

	int main() {
	    void (*fp)() = add;
	    fp();
	    return 0;
	}
```
### Dangling Pointer
- A pointer pointing to freed memory
```c
	#include <stdlib.h>
	int main() {
	    int *p = (int*)malloc(sizeof(int));
	    free(p);
	    // p is now dangling
	    p = NULL;
	    return 0;
	}
```
### Constant Pointers
- Used to enforce immutability
#### Pointer to a Constant
- Data cannot be modified
- Pointer can change
```c
	int x = 10;
	const int *p = &x;
```
#### Constant Pointer
- Pointer cannot change
- Data can be modified
```c
	int x = 10;
	int *const p = &x;
	*p = 20;
```
#### Constant Pointer to a Constant
- Neither pointer nor data can change
```c
	const int x = 10;
	const int *const p = &x;
```
## Summary Table

|Pointer Type|Change Data|Change Address|
|---|---|---|
|Data Pointer|Yes|Yes|
|Null Pointer|No|No|
|Void Pointer|Yes (cast)|Yes|
|Wild Pointer|No|No|
|Function Pointer|—|Yes|
|Dangling Pointer|No|No|
|Pointer to Constant|No|Yes|
|Constant Pointer|Yes|No|
|Constant Pointer to Constant|No|No|
