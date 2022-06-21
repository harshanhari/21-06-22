package assignment5;

public class TestAccount {

	public static void main(String[] args) {
Account a1=new Account(904722031,230000.00);
	System.out.println(a1.toString());
	a1.credit(2300.345);
	System.out.println(a1);
	a1.debit(1234567890);
	}

}
