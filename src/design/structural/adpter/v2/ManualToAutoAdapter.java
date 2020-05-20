package design.structural.adpter.v2;

import design.structural.adpter.v1.ManualDrivable;

public class ManualToAutoAdapter implements AutoDrivable{

	private ManualDrivable manual;
	
	public ManualToAutoAdapter(ManualDrivable menual) {
		this.manual = menual;
	}
	
	@Override
	public void drive() {
		manual.setGear(2);
		manual.drive();
	}
}
