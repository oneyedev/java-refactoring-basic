package design.creational.builder.ingredients;

public class Espresso {
	private String bean;

	public Espresso(String bean) {
		this.bean = bean;
	}

	@Override
	public String toString() {
		return String.format("Espresso [bean=%s]", bean);
	}
}
