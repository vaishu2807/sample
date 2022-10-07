package org.bank;

public class BankInfo extends AxisBank {
 private void saving() {
	System.out.println("my account is saving account");
}
 private void fixed() {
	System.out.println("fixed account");

}
 public static void main(String[] args) {
	BankInfo a = new BankInfo();
	a.saving();
	a.fixed();
	a.deposit();
	
}
}
