package Work7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class LoadBySerializable {
	public static void main(String[] args) {
		String link ="C:/data/Object.ser";
		LoadBySerializable a1 = new LoadBySerializable();
		a1.loadBySerializable(link);
	}
	public void loadBySerializable(String file){
		FileInputStream fis = null;
		ObjectInputStream ois =null;
		try {
			fis= new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			try {
				while (true) {
					try {
						((Animal ) ois.readObject()).speak();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					System.out.println("--------------------");
				}
			} catch (EOFException e) {
				System.out.println("資料讀取完畢！");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
