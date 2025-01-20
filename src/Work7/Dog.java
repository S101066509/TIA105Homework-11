package Work7;

import java.io.Serializable;

public class Dog implements Serializable, Animal{

	private static final long serialVersionUID = -5455918683151410345L;
	
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
