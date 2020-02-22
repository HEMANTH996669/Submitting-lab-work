package lab6;
//import java.util.Scanner;
class MyException extends Exception
{
	MyException(String a){
		super(a);
	}
}

public class Exception1{
	int age;
	Exception1(int age){
		this.age=age;
	}
	
	public static void main(String[] args) {
		Exception1 e=new Exception1(15);
	try {
		if(e.age <= 15) {
			throw new MyException("Age of a person should be above 15");
		}
		else
			System.out.println("age is"+e.age);
	}
	catch(MyException ae) {
		System.out.println("message is"+ae.getMessage());
	}

	}

}
