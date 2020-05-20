package design.structural.composite.components;

import design.structural.composite.Component;

public class Leaf implements Component{

	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void operation() {
		System.out.println("Complete " + name);
	}
}
