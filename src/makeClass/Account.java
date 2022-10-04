package makeClass;

public class Account  {
	String name;
	String aname;
	String ssn;
	int money;
	
	public Account (String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}
	public void deposit(int y) {
		int sum = money + y;
		money = sum;
		System.out.println(y + "원 입금에 성공하였습니다. 현재 잔액은 " + money +"원 입니다 ");
		money = sum;
	}
	public void withdraw(int x) {
		int y = 0;
		y =x;
		int sum = money - y;
		money = sum;
		System.out.println(y + "원 출금에 성공하였습니다. 현재 잔액은 " + money +"원 입니다 ");
	}
}
