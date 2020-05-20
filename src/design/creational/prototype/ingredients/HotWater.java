package design.creational.prototype.ingredients;

public class HotWater {

	private int temperature;

	public HotWater(int temperature) {
		this.temperature = temperature;
	}
	
	public int getTemperature() {
		return temperature;
	}

	@Override
	public String toString() {
		return String.format("HotWater [temperature=%s]", temperature);
	}
}
