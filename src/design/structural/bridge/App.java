package design.structural.bridge;

import design.structural.bridge.operations.Operation1;
import design.structural.bridge.operations.Operation2;
import design.structural.bridge.operations.Operation3;

public class App {

	public static void main(String[] args) {
		Operater operater = new ConcreateOperater();
		operater.setOperation(new Operation1());
		operater.operate();
		
		operater.setOperation(new Operation2());
		operater.operate();
		
		operater.setOperation(new Operation3());
		operater.operate();
	}
}
