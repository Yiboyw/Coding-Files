/* Write a method to replace all spaces in a string with '%20'. 
 * You may assume that the string has sufficient space at the end of the string to hold the additional characters, 
 * and that you are given the "true" length of the string. 
 * (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)
 */
 
 public class StringEdit
 {
 
    	public static void main(String[] args)
	{
			String newstring = "This is a";
		
			char[] charArray = newstring.toCharArray();
			
			String string = new String(charArray);
			
			space(charArray, newstring.length());
			
	}
 
 
 	public static String space(char[] str, int length)
	{
			int newLength = 0;
			int spaceCount = 0;
			int index = 0;
	
			for(int i =0; i < str.length; i++)
			{
				
				if(str[i] == ' ') 
				{
					spaceCount++;
				}
			}
			newLength = str.length + (spaceCount*2);	//9 + 4 = 13
			
			char[] result = new char[newLength];		
		    
			for (int i =0; i < str.length; i++) 
			{
				
				if(str[i] == ' ') 
				{
					result[index] = '%';
					result[index+1] = '2';
					result[index+2] = '0';
					index = index + 3;
				}	
				
				else 
				{
					result[index] = str[i];
					index++;
				}
			}
		
			String print = new String(result);
			System.out.println("result: " + print);
			
			return print;
	}
    
}
