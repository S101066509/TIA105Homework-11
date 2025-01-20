package Work7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	
	public static void main(String[] args) {
		CopyFile cf = new CopyFile();
		String file1 ="C:/Users/Tibame/Desktop/新增 Microsoft Word 文件.docx";
		String file2 ="C:/Users/Tibame/Desktop/Target"+".docx";
		cf.copyFile(file1,file2);
	
}
	public void copyFile(String file1,String file2) {
		File inputFile = new File(file1);
		File outputFile = new File(file2);
		int result = 0 ;
		FileInputStream in =null;
		FileOutputStream out =null;
		System.out.println("開始複製");
		try {
			in = new FileInputStream(inputFile);
			out = new FileOutputStream(outputFile);
			BufferedInputStream bfi =new BufferedInputStream(in);
			BufferedOutputStream bfo = new BufferedOutputStream(out);
			try {
				while ((result = bfi.read()) != -1) {
					bfo.write(result);
					
				}
				bfo.flush();
				System.out.println("複製完成");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	

}
