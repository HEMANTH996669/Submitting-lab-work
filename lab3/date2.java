package lab3;
	import java.io.*;
	import java.text.*;
	import java.time.LocalDate;
import java.time.Period;
import java.util.*;
	public class date2 {
		public static void main(String[] args) {
			LocalDate date = LocalDate.now();
			LocalDate d1=LocalDate.of(2001,01,31);
			Period diff=Period.between(d1,date);
			System.out.println("printing difference between years "+diff.getYears());
			System.out.println("printing difference between months "+diff.getMonths());
			System.out.println("printing difference between days "+diff.getDays());
			
			
			
		}
			
}
