package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product values");
		al.add("hemanth");
		al.add("ved");
		al.add("a");
		Collections.sort(al);
		System.out.println("product names are");
		for(int i=0;i<al.size();i++) {
			System.out.println("product name"+i+"is"+al.get(i));
		}
		for(String ele:al) {
			System.out.println("product nameis"+ele);
		}
	}

}
