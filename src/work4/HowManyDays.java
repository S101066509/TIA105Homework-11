package work4;

import java.util.Scanner;

public class HowManyDays {

	public static void main(String[] args) {
		int[] arr =new int[3];
		HowManyDays test = new HowManyDays();
		Scanner sc = new Scanner(System.in);
		System.out.println("請依序輸入:年份/月份/日期，請用空格分隔");
		for (int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		test.theans(arr[0], arr[1], arr[2]);
		sc.close();
	}

	private void theans(int y, int m, int d) {
		m = m - 1;
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int day = 0;
		if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) {
			days[1] += 1;
		}
		boolean check = true;
		if (d > days[m] || d < 0) {
			System.out.println("請重新確認您輸入的日期");
			check = false;
		}
		if(check == true) {
			for (int i = 0; i < m; i++) {
				day += days[i];
			}
			day = day + d;
			System.out.println("輸入的日期為該年第" + day + "天");
		}
	}
}
