package basics;

public class Bank {

	private long bankAccount;
	private double bankBalance;
	private String customerName;
	private String Email;
	private String phoneNo;
	
	public Bank(){
		
		this(1123,123123,"Ishan","ishanshah92@yahoo.com","408213");
		System.out.println("Default called");
	}

	public Bank(long bankAccount, double bankBalance, String customerName, String email, String phoneNo) {
		this.bankAccount = bankAccount;
		this.bankBalance = bankBalance;
		this.customerName = customerName;
		Email = email;
		this.phoneNo = phoneNo;
	}

	public long getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(long bankAccount) {
		this.bankAccount = bankAccount;
	}

	public double getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void deposit(double amount) {
		bankBalance += amount;

	}

	public void withdraw(float amount) {
		if (amount > bankBalance) {
			System.out.println("You can not withdraw money from the account");
		} else {

			bankBalance -= amount;
			System.out.println("The remaining balance is now" + bankBalance);
		}
	}

}
