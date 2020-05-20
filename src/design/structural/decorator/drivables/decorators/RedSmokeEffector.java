package design.structural.decorator.drivables.decorators;

import design.structural.decorator.Drivable;
import design.structural.decorator.DrivableDecorator;

public class RedSmokeEffector extends DrivableDecorator{

	public RedSmokeEffector(Drivable drivable) {
		super(drivable);
	}

	@Override
	public void drive() {
		super.drive();
		System.out.println("빨간 연기가 나타납니다.");
	}

}
