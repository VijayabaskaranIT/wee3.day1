package week3.day1.assignments;

public class StringReplace {

	public static void main(String[] args) {
		
		  String sent = "I am working with Java8";
		  String add = "#";
		  System.out.println("reaplaced String:");
		  System.out.println(sent.replace("8","11"));
		  System.out.println("Indexed String: ");
		  System.out.println(sent.substring(5, 14));
		  System.out.println("Concatenated: "); 
		  System.out.println(sent.concat(add));
		
	}

}
