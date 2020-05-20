package design.creational.prototype;

import design.creational.prototype.ingredients.Espresso;
import design.creational.prototype.ingredients.HotWater;
import design.creational.prototype.ingredients.SteamMilk;

public class Coffee implements CoffeePrototype{
	
	private Espresso espresso;
	private HotWater hotWater;
	private SteamMilk steamMilk;
	
	protected Coffee(Espresso espresso, HotWater hotWater, SteamMilk steamMilk) {
		this.espresso = espresso;
		this.hotWater = hotWater;
		this.steamMilk = steamMilk;
	}
	
	public Espresso getEspresso() {
		return espresso;
	}
	
	public HotWater getHotWater() {
		return hotWater;
	}

	public void setHotWater(HotWater hotWater) {
		this.hotWater = hotWater;
	}

	public SteamMilk getSteamMilk() {
		return steamMilk;
	}

	public void setSteamMilk(SteamMilk steamMilk) {
		this.steamMilk = steamMilk;
	}

	@Override
	public String toString() {
		return String.format("Coffee [espresso=%s, hotWater=%s, steamMilk=%s]", espresso, hotWater, steamMilk);
	}

	@Override
	public Coffee cloneCoffee() {
		Espresso newEspresso = new Espresso(espresso.getBean());
		HotWater newHotWater = hotWater == null ? null : new HotWater(hotWater.getTemperature());
		SteamMilk newSteamMilk = steamMilk == null ? null : new SteamMilk();
		return new Coffee(newEspresso, newHotWater, newSteamMilk);
	}



	
}
