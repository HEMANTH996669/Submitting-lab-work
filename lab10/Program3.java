package lab10;

import java.io.FileReader;
import java.util.Properties;

public class Program3 {
	public void getProperties() throws Exception
	{
		Properties p=new Properties();
		FileReader f=new FileReader("PersonProps.properties");
		p.load(f);
		System.out.println("property details");
		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("pass"));
		f.close();
	}
	public static void main(String[] args) throws Exception{
		Program3 p=new Program3();
		p.getProperties();

	}

}
