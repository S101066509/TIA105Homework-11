package work4;

public class ReverseString {
	
		public static void main(String[] args) {
			ReverseString a1 = new ReverseString();
			String s = "Hello world";
			System.out.println(a1.reverse(s));
			
		}
		private String reverse(String str) {
			String ans ="";
			char[] temp = str.toCharArray();
			
			for(int i = 0;i < str.length();i++) {
				ans += temp[(str.length()-1)-i];
			}
			
			
			
			return ans ;
			
		}

}
