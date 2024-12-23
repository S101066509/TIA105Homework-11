package work1;

public class Interest {
	public static void main(String[] args) {
		double accountl = 1_500_000, rate = 0.02;
		double account2 = accountl * Math.pow((1 + rate), 10);
		System.out.printf("本金加利息共有: %.0f元", account2);
	}

}
