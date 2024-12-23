package work1;

public class DozenEggs {
	public static void main(String[] arg) {
		int numOfEggs = 200, onedozen = 12;
		int dozensOfEggs = numOfEggs / onedozen;
		int others = numOfEggs % onedozen;

		System.out.println("200顆蛋有" + dozensOfEggs + "打" + others + "顆。");
	}

}
