
//Problem: https://www.hackerrank.com/challenges/java-string-compare/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 
	static String string;
	static Set<String> set = new TreeSet<String>();
    
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        
        for (int i =0; i < s.length(); i++) { //Goes through the input String s 
	        	if (i + k <= s.length()) {//Substring doesn't go over the given subsize
                        String string1 = s.substring(i,i+k); //createss substrings of size k
	        			set.add(string1); //adds the substring to the TreeSet	
	        	}
		}
	        
	        int count =0;
	        for (String item : set) {
                    //sets the first one as the smallest substring 
	        	     if (count == 0) {
	        			smallest = item;
	        		}
                    //sets the last substring as the smallest substring 
	        		if (count == set.size()-1) {
	        			largest = item;
	        		}
	        		count++;  
	        }
	         
	        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
