import java.io.*;
import java.util.*;

public class Reverse

//The problem is to reverse a given string
//Source: http://javaconceptoftheday.com/java-program-to-reverse-a-string 
// Additional source: https://www.geeksforgeeks.org/reverse-a-string-in-java-5-different-ways
{

	    public static void main(String[] args)
	    {
	        String str = "MyJava";
	 
	        //1. Using StringBuffer Class
	 
	        StringBuffer buffer = new StringBuffer(str);
	 
	        System.out.println(buffer.reverse());    //Output : avaJyM
	 
	        //2. Using iterative method
	 
	        char[] strArray = str.toCharArray();
	 
	        for (int i = strArray.length - 1; i >= 0; i--)
	        {
	            System.out.print(strArray[i]);    //Output : avaJyM
	        }
	 
	        //3. Using Recursive Method
	        System.out.println();
	        System.out.println(recursiveMethod(str));    //Output : avaJyM
		    
		    public static void main(String[] args) {
        
		
		//HackerRank: Given a string , print Yes if it is a palindrome, print No otherwise.
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		/* Enter your code here. Print output to STDOUT. */
		 StringBuffer buffer = new StringBuffer(A);
		buffer.reverse();
		String str = buffer.toString();
	       // System.out.println("String "+ str);

		if (str.equals(A)){
		    System.out.println("Yes");
		}
		else{
		     System.out.println("No");
		}
    
    }
	    }
	    
	    //Recursive method to reverse string
	    
	    /*
	     * This reverse method stores the first character of the string(str.charAt(0) and it puts it at the end of the string
	     * 1st Call —>   recursiveMethod(“MyJava”)
		   * 2nd Call —> recursiveMethod(“yJava”) + “M”
		   * 3rd Call —>  (recursiveMethod(“Java”) + “y”) + “M”
		   * 4th call —>  ((recursiveMethod(“ava”) + “J”)+”y”) + “M”
		   *  5th Call —>  (((recursiveMethod(“va”) + “a”) + “J”)+”y”) + “M”
		   *  6th Call —>  ((((recursiveMethod(“a”) + “v”) + “a”) + “J”)+”y”) + “M” 
	    */
	    
	    public static String recursiveMethod(String str) {
	         if (str == null || (str.length() <= 1)) {
	                return str;
	         }
	         
	         else {
	        	
	        	 //System.out.println(str.charAt(0)); //M
	        	 //return str.substring(1); //yJava
	        	 
	         return recursiveMethod(str.substring(1)) + str.charAt(0);
	         }
	    }
}
