package design.structural.decorator.drivables;

import design.structural.decorator.Drivable;

public class Car implements Drivable{

	@Override
	public void drive() {
		System.out.println("차를 운전합니다.");
	}
}
