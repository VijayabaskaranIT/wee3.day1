package week3.day1.assignments;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Size is 15.6 inches ");
	}
	public static void main(String[] args) {
		Desktop ds = new Desktop();
		ds.computerModel();
		ds.desktopSize();
	}

}
