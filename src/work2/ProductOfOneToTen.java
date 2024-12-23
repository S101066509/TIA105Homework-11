package work2;

public class ProductOfOneToTen {
	public static void main(String[] args) {

		int answer = 1;
		for (int i = 1; i <= 10; i++) {
			answer *= i;
		}
		System.out.println(answer);
	}

}
