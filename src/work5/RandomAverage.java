package work5;


public class RandomAverage {
	public static void main(String[] args) {
		RandomAverage a1 = new RandomAverage();
		a1.randAvg();
	}
	private void randAvg() {
		int[] arr = new int[10];
		int sum = 0;
		int avg =0;
		for(int i = 0; i<arr.length;i++) {
			arr[i]=(int)(Math.random() * 101);
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		System.out.println();
		avg = sum /arr.length;
		System.out.println(avg);
	}

}
