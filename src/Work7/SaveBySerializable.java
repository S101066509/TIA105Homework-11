package Work7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SaveBySerializable {
	public static void main(String[] args) {
		String link ="C:/data";
		SaveBySerializable a1 = new SaveBySerializable();
		Cat cat1 = new Cat("Kitty");
		Cat cat2 = new Cat("Meow");
		Dog dog1 = new Dog("Snoopy");
		Dog dog2 = new Dog("Pongo");
		Object[] arr = {cat1 ,cat2 ,dog1,dog2};
		a1.saveBySerializable(link,arr);
	}
	
	public void saveBySerializable(String link, Object[] arr) {
		File fd = new File(link);
		if (!fd.exists()) {
			fd.mkdir();
			System.out.println("資料夾不存在，創建新資料夾");
		}
		File file = new File(link+"/Object.ser");

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			for (int i = 0; i < arr.length; i++) {
				oos.writeObject(arr[i]);
			}
			System.out.println("保存成功");
				
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	
}






