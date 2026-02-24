# Session 14 - IO Streams
## IO Streams
- To perform operations on the file we need to use I/O Streams
- Using I/O streams we can establish link between java program and file (physical file)
- IO streams are divided into 2 types

	    1) Byte Stream : To read/write binary data (images, audios, videos, pdfs etc...)
		2) Character Stream : To read/write character data (text files)

- Byte Stream providing 2 types of classes

	   	1) Input Stream Related Classes (Ex: FileInputStream)
	   	2) Ouput Stream realted classes (Ex: FileOuputStream)
- Character Stream providing 2 types of classes

		1) Reader classes (Ex: FileReader)
		2) Writer classes (Ex: FileWriter)

![IO Streams](assets/io-streams.png)
## Byte Stream
- The byte stream deals with mainly byte data
- We know that one byte is equal to eight-bit
- Thus, this stream mainly deals with 8 bit of data
- This stream performs an Input-output operation per 8 bit of data
```java
	// Java Program using File Streams
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	
	public class FileCopyExample {
	    public static void main(String[] args) throws Exception {
	        FileInputStream fis = new FileInputStream("input.txt");
	        FileOutputStream fos = new FileOutputStream("output.txt");
	        
	        int data;
	        
	        while ((data = fis.read()) != -1) {
		        fos.write(data);
	        }
	        
	        System.out.println("File copied successfully!");
	        
	        // Close the streams
	        fis.close();
	        fos.close();
	    }
	}
```
## Character Stream
- There is also Character Stream which allows I/O operation on 16bit of Unicode data at a time
- Character Stream takes 2 bytes of data at a time
- It is faster as it can take double the intake as compared to a byte stream
- Character streams usually use Byte Stream classes to implement operations
```java
	// Java Program to write the data to a file using FileWriter class
	
	import java.io.*;
	
	public class Demo {
		public static void main(String... args) throws IOException {
			
			FileWriter  fw = new FileWriter("data.txt");
			fw.write("Hi, good evening");
			fw.write("\n");  // it represents new line
			fw.write("How are you?");
			fw.flush ( );
			fw.close( ) ;
		}
	}
```

```java
	// Java program to read file data using FileReader class
	
	import java.io.*;
	
	public class Demo {
		public static void main(String... args) throws IOException {
			FileReader fr = new FileReader ("data.txt");
			int  i = fr.read ( );
			
			while ( i != -1 ){
				System.out.print( (char) i );
				i = fr.read ( );	// read next character and re-initialize i var
			}
			fr.close ( );
		}
	}
```

```java
	// Java Program to read file data using BufferedReader
	
	import java.io.*;
	
	public class Demo {
		public static void main(String... args) throws IOException {
			FileReader fr = new FileReader("data.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine ( ); // reading first line data
			
			while ( line != null ) {
				System.out.println( line );
				line = br.readLine ( ) ; // reading next line and re-initialzing line variable
			}
		}
	}
```

**Note: FileReader will read the data character by character where as BufferedReader will read the data Line by Line.**