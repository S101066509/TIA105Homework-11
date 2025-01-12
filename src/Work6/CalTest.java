package Work6;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		boolean loopSwitch = true;

		while (loopSwitch) {
			try {
				System.out.println("請輸入x的值: ");
				int x = sc.nextInt();
				System.out.println("請輸入y的值: ");
				int y = sc.nextInt();
				System.out.println(x + "的" + y + "次方等於" + calc.powerXY(x, y));
				loopSwitch = false; // 計算完畢，關閉迴圈。
				sc.close();
			} catch (InputMismatchException e) {
				System.out.println("資料格式不正確");// 捕捉scanner輸入型別錯誤。
				sc.nextLine(); // 清空scanner暫存。
			} catch (CalExceptionZero e) {
				System.out.println(e.getMessage());
			} catch (CalExceptionNegValue e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
