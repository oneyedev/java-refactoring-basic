package design.structural.decorator;

import design.structural.decorator.drivables.Car;
import design.structural.decorator.drivables.decorators.RedSmokeEffector;
import design.structural.decorator.drivables.decorators.SoundEffector;

public class App {

	public static void main(String[] args) {
		Drivable decoratedCar = new SoundEffector(new RedSmokeEffector(new Car()));
		decoratedCar.drive();
	}
}
