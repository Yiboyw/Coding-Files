//https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine()); //first input e.g. 3
		while(testCases>0){
			String pattern = in.nextLine(); //([A-Z])(.+)
          	//Write your code
            try{
                Pattern input = Pattern.compile(pattern); //compile the given input
                System.out.println("Valid");
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
            testCases--;
		}
	}
}
