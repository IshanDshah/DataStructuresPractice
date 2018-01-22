package basics;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj = new Bank();
		System.out.println(obj.getBankBalance());
		obj.setBankAccount(14113131);
		obj.setBankBalance(10000);
		obj.setCustomerName("Ishan");
		obj.setEmail("Ishanshah301190@gmail.com");
		obj.setPhoneNo("9898187919");

		obj.deposit(12121);
		System.out.println(obj.getBankBalance());

		obj.withdraw(1414141411);

	}

}
 