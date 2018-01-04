import java.io.*;
import java.util.*;

public class Duplicates {

	public static void main(String[] args) {
		
//		int[] arr1 = {10,20,30,40,50,60,70,80};
//		int[] arr2 = {10,20,30,40,50,60};
		
		int[] arr1 = {1,2,3,5,6,7};
		int[] arr2 = {3,6,7,8,20};
		
//		int[] arr1 = {10,20,30,40,50,60,70,80};
//		int[] arr2 = {10,20,30,40,50,60};
		
		
//		int[] arr1 = {1,3,5,9};
//		int[] arr2 = {2,4,6,10};

		findDuplicates(arr1, arr2);	
	}
	

	  public static int[] findDuplicates(int[] arr1, int[] arr2) {
		  int count = 0;
		  int[] result = new int[100];
		  
		  for(int i=0; i<arr1.length; i++){
			  for(int j=0; j<arr2.length; j++){
				  if (arr1[i] == arr2[j]){
					  System.out.println("These are matches "+ arr1[i]);
					  
//					  Why do these two codes give us different output?
//					  int index=0;
//					  result[index] = arr1[i];
//					  index++;
 					  
					  result[count] = arr1[i];
					  count++;					  
				  }
			  }
		  }
		  
		  for(int i=0; i <result.length; i++){
			  System.out.println("This is result "+ result[i]);
		  }
		  
		  int[] finalResult = new int[count];
		  
		  for(int i=0; i< count; i++){
			  finalResult[i] = result[i];
			  System.out.println("This is the final result " + finalResult[i]);
		  }
		  
		return finalResult;
	   
	  }

}