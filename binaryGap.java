import java.util.*;

/* Find longest gap of zeros in binary representation of an integer.
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. 
 * The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. 
 * The number 20 has binary representation 10100 and contains one binary gap of length 1. 
 * the number 15 has binary representation 1111 and has no binary gaps. 
 * The number 32 has binary representation 100000 and has no binary gaps.
 */

public class binaryGap {
	
	public static void main(String[] args) {
		System.out.println("answer: " + binaryGap(213));
		System.out.println(binaryString(213));
	}
	
	//Check to see if the number is a power of 2, if so it has no gaps.
    	//If number = 2, 4, 8, 16, 32, 64, etc it has no gaps.
    	public static boolean isPowerofTwoMethod(int n) {
    		if (n == 0 || n == 1) {
    			return false;
    		}
    		//continue to reduce the number
    		int remainder = n;
    		while (n > 1) {
    			remainder = n % 2;
    			if (remainder == 1) {
    				return false;
    			}
    			n = n / 2;
    		}
    		return true;
    	}
	//Method to convert number to binary string representation
	public static String binaryString(int n) {
    		String result = "";
    		while (n >= 1) {
    			int remainder = n % 2;
    			String binary = Integer.toString(remainder);
    			result = binary + result;
    			
    			if (remainder == 1) {
    				n = n - 1;
    			}
    			n = n / 2;
    		}
    		return result;
    	}
    	//Method to calculate largest binary gap in the number
    	public static int binaryGap(int N) {
    		//The number has no binary gaps if equal of 0, 1, or is an exponent of 2
		if (N == 0 || N == 1 || isPowerofTwoMethod(N) == true) { 
			return 0;
		}
		
		//convert number to a binary string
		//List to store indexes where the 1's are in the binary number
		ArrayList<Integer> indexofOnes = new ArrayList<Integer>();
		int maxGap = 0;
		
		String binaryNum = Integer.toBinaryString(N);
		
		//goes through the binary number and get index of 1's location
		for (int i = 0; i < binaryNum.length(); i++) {
			char current = binaryNum.charAt(i);
			if (current == '1') {
				indexofOnes.add(i); //add to ArrayList
			}
		}
		
		//calculate largest binary gap
		for (int j = 0; j < indexofOnes.size(); j++) {
			int end = j + 1; //end of closest binary index
			if (end <= indexofOnes.size() - 1) {
				int max = indexofOnes.get(end) - indexofOnes.get(j) - 1;
				if (max > maxGap) {
					maxGap = max;
				}
			}
		}
		return maxGap;
	}
}
