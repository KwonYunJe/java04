package makeClass;

public class AssemblyComputer {

	public static void main(String[] args) {
		Computer com1 = new Computer(600000, "Apple", "30");
		Computer com2 = new Computer(300000, "Samsung", "27");
		
		System.out.println(com1);
		System.out.println(com2);
	}

}
