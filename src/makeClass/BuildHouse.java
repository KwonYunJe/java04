package makeClass;

public class BuildHouse {

	public static void main(String[] args) {
		BrickTool brick1 = new BrickTool();
		BrickTool brick2 = new BrickTool();
		
		brick1.x = 50;
		brick1.y = 50;
		
		brick2.x = 150;
		brick2.y = 150;
		
		brick1.stack();
		brick2.stack();
		
		System.out.println(brick1);
		System.out.println(brick2);
	}

}
