package design.structural.composite;

import design.structural.composite.components.Composite;
import design.structural.composite.components.Leaf;

public class App {

	public static void main(String[] args) {
		Composite head = new Composite("A");
		head.addChild(new Leaf("B"));
		Composite nested = new Composite("C");
		nested.addChild(new Leaf("D"));
		nested.addChild(new Leaf("E"));
		head.addChild(nested);
		head.operation();
	}

}
