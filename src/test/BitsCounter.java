package test;

import java.util.ArrayList;
import java.util.List;

public class BitsCounter {

	public static void main(String[] args) {
		int n = 55;
		BitsCounter a = new BitsCounter();
		int[] ans = a.countBits(n);
		System.out.print("[");
		for(int i=0;i<n;i++) {
			System.out.print(ans[i]);
			if(i!=n-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

	public int[] countBits(int n) {
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			int lsb = 0;
			int c = 0;
			int temp = i;
			while (temp > 0) {
				lsb = temp % 2;
				temp = temp / 2;
				c = c + lsb;
			}
			ans.add(c);
		}
		int[] ansArray = new int[ans.size()];
		for(int i=0 ; i<ans.size();i++) {
			ansArray[i]=ans.get(i);
		}
		return ansArray;
	}

}