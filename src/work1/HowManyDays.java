package work1;

public class HowManyDays {
	public static void main(String[] arg) {
		int secLeft = 256559;
		int hour = 24, min = 60, sec = 60;
		int temp = secLeft;

		int days = secLeft / (hour * min * sec);
		secLeft = secLeft % (hour * min * sec);

		int hours = secLeft / (min * sec);
		secLeft = secLeft % (min * sec);

		int mins = secLeft / sec;
		secLeft = secLeft % sec;
		System.out.printf(temp + "秒為" + days + "天" + hours + "小時" + mins + "分" + secLeft + "秒");
	}

}
