package lab3;

import java.util.Arrays;

public class String2 {
	public String positiveString(String str) {
	boolean b =	str.isEmpty();
		System.out.println(b);
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		
		
		return new String(arr);
	}
	public static void main(String[] args) {
		String2 st=new String2();
		String s1=st.positiveString("hemanth");
		System.out.println(s1);
	}
}
