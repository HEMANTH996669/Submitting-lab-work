package lab10;
import java.io.*;
import java.util.*;
public class Program1 {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		FileWriter f=new FileWriter("PersonProps.properties");
		p.setProperty("uname","hemanth");
		p.setProperty("pass","hemanth9951");
		p.store(f, null);
		System.out.println("work done");
		f.close();
	}

}
