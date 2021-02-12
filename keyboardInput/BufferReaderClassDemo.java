package keyboardInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderClassDemo {

	public static void main(String[] args) throws IOException {
	
	String name;
	int age;
	String salary;
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 
	System.out.println("Enter your name");
   //Read a line of Text -- String type	
	name=br.readLine();
	System.out.println("Enter age");
	age=Integer.parseInt(br.readLine());
	
	System.out.println("Enter Salary");
	salary=br.readLine();
	
	System.out.println("name"+name+"age"+age+""+"Salary"+salary);
	
	}

}
