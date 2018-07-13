import java.io.*;
import java.util.*;
//https://www.hackerrank.com/challenges/java-anagrams/problem

public class Solution {

 static boolean isAnagram(String a, String b) {
        // Complete the function
        
        if (a.length() != b.length()){
            return false;
        }
         String first = a.toLowerCase();
         String second = b.toLowerCase();
        //System.out.println("first: " + first + " second: " + second);
        char[] fir = first.toCharArray();
        char[] sec = second.toCharArray();
        Arrays.sort(fir);
        Arrays.sort(sec);
        String x = new String(fir);
        String y = new String(sec);       
        //System.out.println("x:" + x + " y: " + y);
        return x.equals(y);
        
    }
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
