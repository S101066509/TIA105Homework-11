package work3;

import java.util.Arrays;
import java.util.Scanner;

public class isTriangle {
	public static void main(String[] args) {
		isTriangle tr = new isTriangle();
		tr.triangle_test();
	}

	// 兩邊長度相加大於第三邊
	public void triangle_test() {
		int[] tri = new int[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入三個整數");

		for (int i = 0; i < tri.length; i++) {
			tri[i] = sc.nextInt();
		}

		Arrays.sort(tri);

		if (tri[0] == 0 || tri[0] + tri[1] < tri[2]) {
			System.out.println("不是三角形");
		} else if (tri[0] == tri[1]) {
			System.out.println("等腰三角形");
		} else if (tri[0] == tri[1] && tri[1] == tri[2]) {
			System.out.println("正三角形");
		} else if (Math.pow(tri[0], 2) + Math.pow(tri[1], 2) == Math.pow(tri[2], 2)) {
			System.out.println("直角三角形");
		} else {
			System.out.println("其他三角形");
		}

	}

}
