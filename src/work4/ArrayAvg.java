package work4;

public class ArrayAvg {
	public static void main(String[] args) {

		int[] arr = new int[] { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int arravg;
		int anslen;
		ArrayAvg testobj = new ArrayAvg();
		arravg = testobj.avg(arr);
		testobj.isGreaterThan(arr, arravg);
		anslen = testobj.isGreaterThan(arr, arravg).length;
		int[] ans = new int[anslen];
		ans = testobj.isGreaterThan(arr, arravg);
		System.out.print("平均數是:" + arravg + " ,大於平均數的陣列數字有 ");
		for (int i = 0; i < anslen; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	private int avg(int[] arr) {
		int sum = 0, count = 0;

		while (count < arr.length) {
			sum += arr[count];
			count++;
		}
		return sum / count;
	}

	private int[] isGreaterThan(int[] arr, int avg) {
		int count = 0, count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg) {
				count++;
			}
		}
		int[] ans = new int[count];
		int arrindex = 0;

		while (count2 < arr.length) {
			if (arr[count2] > avg) {
				ans[arrindex] = arr[count2];
				arrindex++;
			}
			count2++;
		}

		return ans;
	}
}
