package Work6;

public class Calculator {

	public int powerXY(int x, int y) throws CalExceptionZero, CalExceptionNegValue {
		int ans = 0;

		if (x == 0 && y == 0) {
			throw new CalExceptionZero("0的0次方沒有意義!");
		} else if (y < 0) {
			throw new CalExceptionNegValue("次方為負值，結果回傳不為整數!");
		} else {
			ans = (int) Math.pow(x, y);
		}
		return ans;
	}
}
