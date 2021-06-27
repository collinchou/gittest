package Test;

import java.io.Serializable;

public class Cat  implements Serializable{
	private static final long serialVersionUID = 2L;
	private String name;
	private String nickname2;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
