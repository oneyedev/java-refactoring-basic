package design.behavioral.visitor.places;

import design.behavioral.visitor.CoffeePlace;
import design.behavioral.visitor.CoffeeVisitor;

public class WaterHeater implements CoffeePlace{

	@Override
	public void accept(CoffeeVisitor visitor) {
		visitor.visitWaterHeater();
	}
}
