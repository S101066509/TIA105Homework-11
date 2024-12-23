package work3;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {

		GuessNumber gn = new GuessNumber();

		gn.randomNumber();

	}

	public int randomNumber() {
		Scanner sc = new Scanner(System.in);
		int temp;
		int input;
		System.out.println("開始猜數字吧!");
		temp = (int) (Math.random() * 10);
		while (true) {
			input = sc.nextInt();
			if (temp == input) {
				System.out.println("答對了!答案就是" + temp);
				break;
			} else if (temp > input) {
				System.out.println("猜錯囉,數字小於目標數!");
			} else {
				System.out.println("猜錯囉,數字大於目標數!");
			}
		}
		return temp;

	}

}
