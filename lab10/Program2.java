package lab10;
import java.util.*;
import java.io.*;
public class Program2{
	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		FileReader f=new FileReader("PersonProps.properties");
		p.load(f);
		System.out.println("property details");
		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("pass"));
		f.close();
	}
}
