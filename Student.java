package week3.day1.assignments;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student Name: Vijayabskaran");
	}
	public void studentDept() {
		System.out.println("Student Department: Information technology");
	}
	public void studentId() {
		System.out.println("Student ID: 1331");
	}
	public static void main(String[] args) {
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
	}

}
