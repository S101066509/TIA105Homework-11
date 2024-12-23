package work2;

public class Lotto {
	public static void main(String[] args) {
		int drop = 0, anser = 49;
		System.out.println("以下為可以選擇的號碼");

		for (int i = 1; i <= 49; i++) {
			if ((i >= 40 && (i - 40) < 10) || (i - 4) % 10 == 0) {
				drop++;
			} else {
				System.out.print(i + " ");
			}
		}
		anser = anser - drop;
		System.out.println();
		System.out.println("可選擇的號碼共有" + anser + "個");
	}

}
