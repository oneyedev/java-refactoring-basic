package design.structural.composite.components;

import java.util.ArrayList;
import java.util.List;

import design.structural.composite.Component;

public class Composite implements Component{

	private String name;
	private List<Component> children = new ArrayList<>();

	public Composite(String name) {
		this.name = name;
	}

	@Override
	public void operation() {
		for (Component child : children) {
			child.operation();
		}
		System.out.println("Complete " + name);
	}

	public void addChild(Component child) {
		this.children.add(child);
	}
}
