package work5;

public class GenAuthCode {
	public static void main(String[] args) {
		String authCode = "";
		GenAuthCode ac = new GenAuthCode();
		authCode =ac.genAuthCode();
		System.out.println(authCode);
	}
	
	private String genAuthCode() {
		int stringLength = 8;
		String[] str = new String[8];
		String ans="";
		
		for(int i = 0 ;i<stringLength;i++) {
			int randomType = (int)(Math.random() * 3);
			switch(randomType) {
			case 0:
				char capLeter =(char)(65+(int)(Math.random()*26));
				str[i] = Character.toString(capLeter);
				break;
			case 1:
				char lowerLeter =(char)(97+(int)(Math.random()*26));
				str[i] = Character.toString(lowerLeter);
				break;
			case 2:
				int ramdomNum =(int)(Math.random()*10);
				str[i] = Integer.toString(ramdomNum);
				break;
			}
		}
		ans = String.join("", str);
		return ans;
	}

}
