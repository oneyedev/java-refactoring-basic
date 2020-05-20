package design.structural.decorator;

public abstract class DrivableDecorator implements Drivable{

	private final Drivable drivable;
	
	public DrivableDecorator(Drivable drivable) {
		super();
		this.drivable = drivable;
	}

	@Override
	public void drive() {
		drivable.drive();
	}
}
