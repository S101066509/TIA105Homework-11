package work3;

import java.util.Arrays;
import java.util.Scanner;

public class LottoTwo {

	public static void main(String[] args) {

		LottoTwo lt = new LottoTwo();
		int[] ans = new int[6];

		ans = lt.latto();

		lt.getRandom(ans);
	}

	public int[] latto() {

		Scanner sc = new Scanner(System.in);

		int drop = 0, anser = 49, count = 0, ra = 0;
		int input;
		int[] table = new int[49];

		System.out.println("阿文....請輸你討厭哪個數字");
		input = sc.nextInt();

		for (int i = 1; i <= 49; i++) {
			if ((i >= input * 10 && (i - input * 10) < 10) || (i - input) % 10 == 0) {
				drop++;
			} else {
				System.out.print(i + "\t");
				table[ra] = i;
				ra++;
				count++;
			}

			if (count == 6) {
				System.out.println();
				count = 0;
			}
		}
		anser = anser - drop;

		System.out.println("可選擇的號碼共有" + anser + "個");

		int[] ans = new int[ra];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = table[i];
		}

		return ans;
	}

	public void getRandom(int[] temp) {

		int[] table = new int[6];
		int index = 0;
		int Count = 0;
		int number;

		while (Count < table.length) {

			index = (int) (temp.length * Math.random() + 1);
			number = temp[index];

			boolean isDuplicate = false;
			for (int i = 0; i < table.length; i++) {
				if (table[i] == number) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				table[Count] = number;
				Count++;
			}

		}
		Arrays.sort(table);
		System.out.println("電腦選號:");
		for (int i = 0; i < table.length; i++) {
			System.out.print(table[i] + "\t");
		}

	}

}
