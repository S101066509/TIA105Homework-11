package work4;

public class CountVowel {
	public static void main(String[] args) {
	
		CountVowel a1 = new CountVowel();
		String[] input = new String[] { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		System.out.println(a1.countVowel(input));

	}

	private int countVowel(String[] str) {
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			char[] temp = str[i].toCharArray();
			for (int j = 0; j < temp.length; j++) {
				if ("aeiou".indexOf(temp[j]) != -1) {
					count++;
				}
			}
		}
		return count;

	}
}
