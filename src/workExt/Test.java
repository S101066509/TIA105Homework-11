package workExt;

public class Test {
	public static void main(String[] args) {
		Pen p1 =new Pencil("STAEDTLER",10);
		Pen ink1 =new InkBrush("Cross",4000);
		System.out.println(p1.getBrand());
		System.out.println(p1.getPrice());
		p1.write();
		System.out.println("============================");
		System.out.println(ink1.getBrand());
		System.out.println(ink1.getPrice());
		ink1.write();
	}

}
