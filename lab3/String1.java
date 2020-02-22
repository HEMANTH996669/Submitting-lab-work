package lab3;

//import java.util.Scanner;

public class String1 {
	String in;
	String1(String inp){
		in=inp;
	}
public String userString(String1 s) {
	String s3=s.in;
	String s4=s3.concat(s3);
	System.out.println(s4);
	int len=s4.length();
	char[] arr=s4.toCharArray();
	for(int i=0;i<len;i++) {
		if(i % 2 != 0) {
			arr[i]='#';
		}
		else
			arr[i]=arr[i];
	}
	for(int i=0;i<len;i++) {
		System.out.print(arr[i]);
	}
	char[] arr1=s4.toCharArray();
	for(int i=0;i<len;i++) {
		if(i%2!=0) {
			arr1[i]=Character.toUpperCase(arr1[i]);
		}
		else
			arr[i]=arr[i];
	}
	for(int i=0;i<len;i++) {
		System.out.print(arr1[i]);
	}
	/*String str1="hemzanth;
	int n=str1.length();
	char[] ar=str1.toCharArray();
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(ar[i]==ar[j]) {
				ar[j]=ar[j+1];
			}
		}
		ar[i]=ar[i];
		
	}*/
	
	return s4;
}

	public static void main(String[] args) {
		String1 str=new String1("hhemanth");
		str.userString(str);
			}

}
