package work5;

public class SquareTest {
	public static void main(String[] args) {
		SquareTest a1 = new SquareTest();
		a1.starSquare(5,4);

	}

	private void starSquare(int width, int height) {

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
