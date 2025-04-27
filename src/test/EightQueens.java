package test;

public class EightQueens {
	// 存放每個row Queens在的位置
	int[] rows = new int[8];
	int count = 0;

	public static void main(String[] args) {
		EightQueens ans = new EightQueens();
		ans.eightQueens(0);
		System.out.println("總共有 " + ans.count + " 種解法");

	}

	void eightQueens(int column) {
		// 終止條件(有解時8個Queens都放在棋盤上)，印出位置
		if (column == 8) {
			// 有解時紀錄第幾組解
			count++;
			System.out.println("第" + count + "組解");
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					System.out.print(rows[i] == j ? "_Q_" : "_._");
				}
				System.out.println();
			}
			System.out.println();
			// 終止
			return;
		}

		for (int row = 0; row < 8; row++) {
			// 用前一個Queen的位置來判斷可不可以放，遍歷8個位置跟前一個的位置比較。
			if (isPlace(column, row)) {
				// 存下位置，並進入遞迴
				rows[column] = row;
				eightQueens(column + 1);
			}
		}

	}

	// 用來判斷是否可以放置
	boolean isPlace(int column, int row) {
		for (int i = 0; i < column; i++) {
			// 確認是否在同一個row
			if (rows[i] == row)
				return false;
			// 確認是否在同一個對角線上
			if (Math.abs(rows[i] - row) == Math.abs(i - column))
				return false;
		}
		return true;
	}
}
