package makeClass;

public class Bank {

	public static void main(String[] args) {
		Account dad = new Account("Hong gil dong" , "980314-0000000", 500000);
		
		System.out.println(dad.name);
		System.out.println(dad.ssn);
		System.out.println(dad.money);
	}

}
