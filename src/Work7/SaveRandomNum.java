package Work7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveRandomNum {
	public static void main(String[] args) {
		final String OUTPUT = "./Data.txt";
		int times=10;
		boolean state = true;
		try {
			FileWriter fw = new FileWriter(OUTPUT,state);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 0 ; i < times;i++) {
				String s =(int)(1+Math.random()*1000)+" ";
				bw.append(s);
				System.out.print(s);
			}
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
