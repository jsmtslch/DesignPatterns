package creational.builder;

public class BankAccount {
	
	private String name;
	private Long accountNum;
	private Double balance;
	private String branch;
	
	
	private BankAccount() {
		
	}
	
	public static class BankAccBuilder{
		private String name;
		private Long accountNum;
		private Double balance;
		private String branch;
		
		public BankAccBuilder custName(String name) {
			this.name = name;
			return this;
		}
		
		public BankAccBuilder accNum(Long accNum) {
			this.accountNum = accNum;
			return this;
		}
		
		public BankAccBuilder hasBalance(Double bal) {
			this.balance = bal;
			return this;
		}
		
		public BankAccBuilder atBranch(String branch) {
			this.branch = branch;
			return this;
		}
		
		public BankAccount build() {
			BankAccount ba = new BankAccount();
			ba.accountNum = this.accountNum;
			ba.name = this.name;
			ba.branch = this.branch;
			ba.balance = this.balance;
			return ba;
		}
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNum=" + accountNum + ", balance=" + balance + ", branch="
				+ branch + "]";
	}
}
