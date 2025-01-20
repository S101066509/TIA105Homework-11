package Work7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadSample {
	public static void main(String[] args) {
		int byteCount = 0,charCount = 0,lineCount = 0;
		final String LINK ="./Sample.txt";
		
		try {
			FileInputStream fis = new FileInputStream(LINK);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int i;
			try {
				while ((i = bis.read()) != -1) {
					byteCount++;
				}
				bis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader fr = new FileReader(LINK);
			BufferedReader br = new BufferedReader(fr);
			int i;
			String str;
			try {
				while ((i = br.read()) != -1) {
					charCount++;
				}
				
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileReader fr = new FileReader(LINK);
			BufferedReader br = new BufferedReader(fr);
			int i;
			String str;
			try {
				 while ((str = br.readLine()) != null) {
					 lineCount++;
				 }
				
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("檔案共有: "+byteCount+"個位元組,"+charCount+"字元,"+lineCount+"列資料。");
	}
		
		
	
}
