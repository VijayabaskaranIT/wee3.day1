package week3.day1.assignments;

public class AxisBank extends BankInfo {
public int deposit(int amt) {
	return amt;
}
	public static void main(String[] args) {
		AxisBank Acc = new AxisBank();
		Acc.saving();
		Acc.fixed();
		Acc.deposit();
		System.out.println();
		int axisDep = Acc.deposit(25000);
		System.out.println("Deposited in axis bank is:");
		System.out.println(axisDep);

	}

}
