package lab7;
import java.util.*;
import java.io.*;

public class Array1 {

	public static void main(String[] args) {
		String[] arr=new String[5];
		int a=arr.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product values");
		for(int i=0;i<a;i++) 
		{
			arr[i]=sc.nextLine(); 
	}
		Arrays.sort(arr);
		System.out.println("product names are");
		/*for(int i=0;i<a;i++) {
			System.out.println("product name"+i+"is"+arr[i]);
		}*/
		for(String ele:arr) {
			System.out.println("product nameis"+ele);
		}

}
}
