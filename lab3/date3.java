package lab3;

import java.text.DateFormat;
import java.time.LocalDate;

public class date3 {
	public LocalDate product(LocalDate purchase,LocalDate warranty) {
		return warranty;
	}
public static void main(String[] args) {
	date3 d1=new date3();
	LocalDate purchase=LocalDate.of(2001,01,31);
	LocalDate warranty=purchase.plusMonths(6);
	LocalDate f2=d1.product(purchase,warranty);
	System.out.println("warranty date is"+f2);
}
}
