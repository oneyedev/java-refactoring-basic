package design.structural.decorator.drivables.decorators;

import design.structural.decorator.Drivable;
import design.structural.decorator.DrivableDecorator;

public class SoundEffector extends DrivableDecorator{

	public SoundEffector(Drivable drivable) {
		super(drivable);
	}
	
	@Override
	public void drive() {
		super.drive();
		System.out.println("쿠와아앙");
	}

}
