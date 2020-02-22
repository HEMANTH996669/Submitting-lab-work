package com.cg.eis.pl;

import java.util.*;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.EmployeeService;
public class InvokingPackage implements EmployeeService
{	
	String insuranceScheme;
	@Override
public String insurance(double salary, String designation) {
		
		if((salary<= 2000) && (designation.contentEquals("analyst")))
			insuranceScheme="a";
		else
			insuranceScheme="b";
		
		return insuranceScheme;
	}
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("enter id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("enter name");
		String name=sc.nextLine();
		System.out.print("enter salary");
		double salary=sc.nextDouble();
		try {
		if(salary < 3000) 
		{
			throw new EmployeeException("Salary should be greater than 3000");
		}
		}
		catch(EmployeeException e) {
			System.out.println("message is"+e.getMessage());
		}
		
		sc.nextLine();
		System.out.print("enter designation");
		String designation=sc.nextLine();	
		
		Employee e = new Employee(id, name, salary, designation);
		EmployeeService x=new InvokingPackage();
		
		String insu = x.insurance(salary,designation);
		
		System.out.println("id  is"+e.getId());
		System.out.println("name  is"+e.getName());
		System.out.println("salaryis"+e.getSalary());
		System.out.println("designation is"+e.getDesignation());
		System.out.println("insurance schema is"+insu);		
		
		sc.close();
	}
}