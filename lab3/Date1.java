package lab3;
import java.io.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
public class Date1 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		int x=date.getDayOfMonth();
		System.out.println("day is"+x);
		int y=date.getMonthValue();
		System.out.println("month id"+y);
		int z=date.getYear();
		System.out.println("year is"+z);
	}
}