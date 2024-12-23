package work1;

public class DifferentOutputs {
	public static void main(String[] args) {
		System.out.println(5 + 5);
		// 整數相加 5(型別int)+5(型別int)=10(5(型別int)
		System.out.println(5 + '5');
		//因int位階較char高=> 5(型別int)+5(型別char)=5(型別int)+53('5'的編碼換成int表述)=58(型別) 
		System.out.println(5 + "5");
		//因string位階較int高=> 5(型別int)+"5"(型別字串)變成字串相加=>55(型別字串)
	}

}
