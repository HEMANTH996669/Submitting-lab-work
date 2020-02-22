package lab8;
import java.io.*;
import java.util.*;
public class File1 {

	   public static void main(String args[]) throws IOException {  
		   try {
		   String s = null;
		   FileReader f=new FileReader("C:\\example files\\f2.txt");
		   Scanner sc=new Scanner(f);
		   while(sc.hasNextLine()) {
			   s=sc.nextLine();
		   }
		   System.out.println(s);
		   StringBuffer s3=new StringBuffer(s);
		   s3=s3.reverse();
		   String s4=s3.toString();
		   FileWriter f2=new FileWriter("C:\\example files\\f2.txt");
		   f2.write(s4);
		   f.close();
		   f2.close();
		   System.out.println("finished");
		   }
		   catch(Exception e) {
			   System.out.println(e);
		   }
	   }
}
