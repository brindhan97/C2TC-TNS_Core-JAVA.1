package Homework.Java;

public class Bank {

	public static void main(String[] args) {
		SavingsAccount brindhaSavings = new SavingsAccount();
		brindhaSavings.withdraw(500);
		brindhaSavings.deposit(800);
		brindhaSavings.addInterest();
		System.out.println(brindhaSavings.getBalance());
		

	}

}