package design.structural.proxy.drivables;

import design.structural.proxy.Drivable;

public class Car implements Drivable{

	@Override
	public void drive() {
		System.out.println("차를 운전합니다.");
	}
}
