package work5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle a1 = new MyRectangle();
		a1.setWidth(10);
		a1.setDepth(20);
		System.out.println(a1.getArea());

		MyRectangle a2 = new MyRectangle(10, 20);
		System.out.println(a2.getArea());
	}

}
