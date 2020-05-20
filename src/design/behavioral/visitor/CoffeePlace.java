package design.behavioral.visitor;

public interface CoffeePlace {

	void accept(CoffeeVisitor visitor);
}
