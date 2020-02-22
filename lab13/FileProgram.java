package MultiThreading;
import java.io.*;
import java.util.*;
public class FileProgram{
	public void run() {
	try {
		Thread.sleep(100000);
	} catch (InterruptedException e) {
		System.out.println(e);
	}
}
		public static void main(String[] args) {
		 String s,s2,s6="";
		 String a=null,b=null;
		 int i=0;
		try
		{
		//FileReader f1=new FileReader("C:\\example files\\source.txt");
		//FileWriter f2=new FileWriter("C:\\example files\\target.txt");
		CopyDataThread u=new CopyDataThread(a,b);
		Scanner sc=new Scanner(u.f1);
		s=sc.nextLine();
		System.out.println(s);
		int len=s.length();
		System.out.println(len);
		//CopyDataThread c=new CopyDataThread();
			int j=0;
			for(j=0;j<len;j=j+10) {
				s2=u.condition(s.substring(j, j+10));
				s6=s6.concat(s2);
				}
			System.out.println(s6);
			u.f2.write(s6);
			u.f2.close();
			}	
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}

