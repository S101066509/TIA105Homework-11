package work2;

public class TestNineNine {
	public static void main(String[] args) {

		/*
		 * for+while
		 */
		int i = 1;
		while (i <= 9) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			i++;
			System.out.println();
		}
		System.out.println("===========================================================");
		/*
		 * for+do-while
		 */
		int a = 1;
		do {
			for (int b = 1; b <= 9; b++) {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
			}
			System.out.println();
			a++;
		} while (a <= 9);

		System.out.println("===========================================================");
		/*
		 * while+do-while
		 */

		int p = 1;
		while (p <= 9) {
			int q = 1;
			do {
				System.out.print(p + "*" + q + "=" + p * q + "\t");
				q++;
			} while (q <= 9);

			System.out.println();
			p++;
		}
		System.out.println("===========================================================");
	}

}
