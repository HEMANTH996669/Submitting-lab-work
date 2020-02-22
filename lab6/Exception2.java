package lab6;
import java.io.*; 
  
class Exception2 { 
  
    // Main Method 
    public static void main(String[] args) 
        throws Exception 
    { 
  
        try { 
  
            // divide the numbers 
            divide(2, 0); 
        } 
  
        catch (ArithmeticException e) { 
  
            System.out.println("Message String = "
                               + e.getMessage()); 
        } 
    } 
  
    // method which divide two numbers 
    public static void divide(int a, int b) 
        throws ArithmeticException 
    { 
  
        int c = a / b; 
  
        System.out.println("Result:" + c); 
    } 
} 