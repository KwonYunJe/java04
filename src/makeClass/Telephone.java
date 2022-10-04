package makeClass;

public class Telephone {
	//공통적인 성질 : 사이즈, 스피커
	//변수를 사용, 2개의 변수 필요
	//멤버변수, 선언만 한다
	//자동초기화 됨
	int size;	//0으로 자동 초기화 진행
	String speaker;//""
	String who;
	
	public void call() {
		System.out.println("Calling to " + who);
	}
	
	public void takePic() {
		System.out.println("Take a picture");
	}
}
