package work5;

public class MaximumValue {
	public static void main(String[] args) {
		MaximumValue a1 = new MaximumValue();
		int[][] arr1= {
				{1,6,3},
				{9,5,2}
		};
		double[][] arr2 = {
				{1.2,3.5,2.2},
				{7.4,2.1,8.2}
		};
		System.out.println(a1.maxElement(arr1));
		System.out.println(a1.maxElement(arr2));
		
		
	}
	
	private int maxElement(int[][] arr) {
		int max = arr[0][0];
		for(int i = 0 ; i<arr.length;i++) {
			for(int j = 0 ; j<arr[i].length;j++) {
				if(arr[i][j] > max ) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}
	
	private double maxElement(double[][] arr) {
		double max = arr[0][0];
		for(int i = 0 ; i<arr.length;i++) {
			for(int j = 0 ; j<arr[i].length;j++) {
				if(arr[i][j] > max ) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}
}
