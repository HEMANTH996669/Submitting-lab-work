package lab8;
import java.util.*;
import java.io.*;
public class file2 {

	public static void main(String[] args) throws Exception {
		String s=null;
		try {
		FileReader f1=new FileReader("C:\\example files\\numbers.txt");
		Scanner sc=new Scanner(f1);
		s=sc.nextLine();
		System.out.println(s);
		Scanner sca=new Scanner(s);
		//System.out.println(sca);
		while(sca.hasNext()) {
			sca.useDelimiter(",");
			int n=Integer.parseInt(sca.next());
			if(n%2==0) {
				System.out.print(n);
			}
		}
		//StringBuffer bf=new StringBuffer(s);
		//System.out.println(bf);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
