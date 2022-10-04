package makeClass;

public class Calculator {

	public static void main(String[] args) {
		CalculatorParts cal = new CalculatorParts();
		int result = cal.add(3, 6);
		double result2 = cal.add(100, 22.2);
		double result3 = cal.add(11.1, 22.2);
		String result4 = cal.add("Cal", 10);
		int result5 = cal.multi(3000, 4);
		int result6 = cal.div(result5, 4);
		
		System.out.println("Result : " + result);
		System.out.println("Result : " + result2);
		System.out.println("Result : " + result3);
		System.out.println("Result : " + result4);
		System.out.println("Result : " + result5);
		System.out.println("Result : " + result6);
	}

}
