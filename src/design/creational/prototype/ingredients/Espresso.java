package design.creational.prototype.ingredients;

public class Espresso {
	private String bean;

	public Espresso(String bean) {
		this.bean = bean;
	}
	
	public String getBean() {
		return bean;
	}

	@Override
	public String toString() {
		return String.format("Espresso [bean=%s]", bean);
	}
}
