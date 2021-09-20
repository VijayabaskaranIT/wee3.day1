package week3.day1.assignments;

public class Students {
public void getStudentsInfo(int id) {
	System.out.println("Student ID: "+id);
	
}
public void getStudentsInfo(int id,String name) {
	System.out.println("Student ID: "+id);
	System.out.println("Student Name: "+name);

}
public void getStudentsInfo(String email, long mob) {
	System.out.println("Student eMail: "+email);
	System.out.println("Student Phone number: "+mob);
}
	public static void main(String[] args) {
		Students st=new Students();
		st.getStudentsInfo(55);
		st.getStudentsInfo(55,"Vijay" );
		st.getStudentsInfo("svijayabaskaranit@gmail.com", 9487679696l);

	}

}
