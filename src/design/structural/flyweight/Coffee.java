package design.structural.flyweight;

import java.lang.ref.WeakReference;

public class Coffee {
	
	private WeakReference<String> name;

	public Coffee(String name) {
		this.name = new WeakReference<String>(name);
	}
	
	public void drink() {
		System.out.println(name + "을 마십니다. id = " + hashCode());
	}
}
