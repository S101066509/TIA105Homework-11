package work1;

public class Circle {
	public static void main(String[] args) {
		double pi1 = 3.1415, radius = 5;
		double area = pi1 * Math.pow(radius, 2), perimeter = 2 * radius * pi1;
		System.out.printf("半徑為5的圓面積為: %.4f%n", area);
		System.out.printf("半徑為5的圓周長為: %.4f", perimeter);
	}

}
