package lab7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 extends Employee {
	public static void main(String[] args) {
		HashMap<Employee,String> hp=new HashMap<Employee,String>();
		Employee e1=new Employee();
		Scanner sc=new Scanner(System.in);
		e1.setId(1);
		e1.setName("hemanth");
		e1.setSalary(2000.00);
		e1.setDesignation("analyst");
		System.out.println("enter scheme");
		e1.setInsuranceScheme(sc.nextLine());
		/*Employee e2=new Employee();
		e2.setId(1);
		e2.setName("vedanth");
		e2.setSalary(20002.00);
		e2.setDesignation("analyst");
		System.out.println("enter scheme");
		e1.setInsuranceScheme(sc.nextLine());*/
		if(e1.insuranceScheme.contentEquals("lic"))
		{
			Set<Entry<Employee, String>> s = hp.entrySet();
			Iterator it=s.iterator();
			while(it.hasNext()) {
		         Map.Entry mentry = (Map.Entry)it.next();
		         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
		         System.out.println(mentry.getValue());
		      }
			System.out.println("print");
		}
			sc.close();	
	}

}
