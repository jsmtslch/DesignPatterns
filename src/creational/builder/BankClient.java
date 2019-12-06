package creational.builder;

import creational.builder.BankAccount.BankAccBuilder;

public class BankClient {

	public static void main(String[] args) {
		BankAccount ba = new BankAccBuilder().accNum(123L).atBranch("Westboro")
				.custName("Jasmeet").hasBalance(1000.00).build();
		System.out.println(ba);
		
	}
}
