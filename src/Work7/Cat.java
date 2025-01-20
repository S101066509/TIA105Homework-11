package Work7;

import java.io.Serializable;

public class Cat  implements Serializable, Animal{
	private static final long serialVersionUID = 8783857826561901663L;
	
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
