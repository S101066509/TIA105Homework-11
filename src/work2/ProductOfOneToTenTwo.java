package work2;

public class ProductOfOneToTenTwo {
	public static void main(String[] args) {
		int i = 0,answer=1;
		
		while(i++<=9) {
			answer=answer*i;
		}
		System.out.println(answer);
	}

}
