package lab3;

public class Arrays {

	public static void main(String[] args) {
	/*	int[] arr=new int[10];
		char[] arr1=new char[10];
		byte[] arr2=new byte[10];
		String[] arr3=new String[10];
		System.out.println(arr.getClass());
		System.out.println(arr1.getClass());
		System.out.println(arr2.getClass());
		System.out.println(arr3.getClass());
		System.out.println(arr.getClass().getSuperclass());
		
String x=arr.toString();
System.out.println(x);*/
		/*double[] mylist= {1.0,2.0,3.0};
		for(double element:mylist) {
			System.out.println(element);
		}*/
		char[] xy= {'d','e','h','e'};
		char[] c=new char[4];
		System.arraycopy(xy, 0, c, 1, 3);
		System.out.println(new String(c));
	}

}
