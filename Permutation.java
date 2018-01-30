//Problem: Given two strings, write a method to decide if one is a permutation of the other

import java.util.Arrays;

public class Permutation
{
        public static void main(String[] args)
        {
        	System.out.println(sort("dog"));
        	System.out.println(sort("gdo"));
            System.out.println(permutation("dog", "gdo"));
        }

        public static String sort(String s) 
        {
            char[] charArray = s.toCharArray(); //take the String parameter s and change it to a character array
             Arrays.sort(charArray); //sort the character array
            return new String(charArray); //return the new string content
        }
       

        public static boolean permutation(String s, String t) 
        {
        	
        	if (s.length() != t. length()) //if the length of the two Strings are not equal, return false
            {
                return false; 
            }
        	
        	return sort(s).equals(sort(t));
        }
}
