package design.creational.builder;

import design.creational.builder.ingredients.Espresso;
import design.creational.builder.ingredients.HotWater;
import design.creational.builder.ingredients.SteamMilk;

public class Coffee {
	private Espresso espresso;
	private HotWater hotWater;
	private SteamMilk steamMilk;
	
	Coffee(Espresso espresso, HotWater hotWater, SteamMilk steamMilk) {
		this.espresso = espresso;
		this.hotWater = hotWater;
		this.steamMilk = steamMilk;
	}

	@Override
	public String toString() {
		return String.format("Coffee [espresso=%s, hotWater=%s, steamMilk=%s]", espresso, hotWater, steamMilk);
	}
}
