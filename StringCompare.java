package week3.day1.assignments;

public class StringCompare {

	public static void main(String[] args) {
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");			
		if (str3 == str4) 			
		{
			System.out.println(" Same text");
		} 
		else
			System.out.println("Diff text");

		System.out.println("***");
	}

}
/*
   * This "==" --> 'compares reference of the string' not the actual values.
   * so the output is like
   * Output:  
      Diff text
      ***
      *incase we use if(str3.equals(str4) -- this compares values in the string
      *so the output will be like
      *o/p : Same Text ***
 */
