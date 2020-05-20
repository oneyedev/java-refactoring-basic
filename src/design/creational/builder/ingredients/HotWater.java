package design.creational.builder.ingredients;

public class HotWater {

	private int temperature;

	public HotWater(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return String.format("HotWater [temperature=%s]", temperature);
	}
}
