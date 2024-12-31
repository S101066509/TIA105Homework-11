package work4;

public class GoodStudent {
	public static void main(String[] args) {
		int[][] arr = {{10,35,40,100,90,85,75,70},
					   {37,75,77,89,64,75,70,95},
					   {100,70,79,90,75,70,79,90},
					   {77,95,70,89,60,75,85,89},
					   {98,70,89,90,75,90,89,90},
					   {90,80,100,75,50,20,99,75}
					   };
		GoodStudent s1 = new GoodStudent();
		int[] ans1 = new int[6];
		ans1 = s1.getScore(arr);
		int[] ans2 = new int[8];
		ans2=s1.countNum(ans1);
		for (int i =1;i<ans2.length;i++)
			System.out.println(i+"號考了"+ans2[i]+"次全班最高分!!");
	
	}
	
	private int[] getScore(int[][] arr) {
		int[] numberOne = {1,1,1,1,1,1};
		for (int i = 0; i < arr.length; i++) {
			int max = arr[i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
					numberOne[i] = j+1;
				}
			}
		}
		return numberOne;
	}
	private int[] countNum(int[]arr) {
		
		int[] countnum =new int[9];
		for(int i =0  ; i<arr.length;i++) {
			countnum[arr[i]]+=1;
		}
		return countnum;
	
	}

}
