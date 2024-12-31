package work4;

import java.util.Scanner;

public class LoveFromCoworker {
	public static void main(String[] args) {
		int[][] cashtable = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		double input=0;
		LoveFromCoworker menber = new LoveFromCoworker();

		
		Scanner sc = new Scanner(System.in);
		System.out.println("小華你想借多少");
		input = sc.nextInt();
		while(input<0) {
			System.out.println("請輸入大於零的數字，謝謝!!");
			input = sc.nextInt();
		}

		menber.getLoan(cashtable, input);
		sc.close();
	}

	private void getLoan(int[][] arr, double loan) {
		String str = "";
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][1] >= loan) {
				str += arr[i][0] + " ";
				count++;	
			}
		}
		System.out.print("有錢可借的員工編號:" + str + "共" + count + "人");
	}

}
