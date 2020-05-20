package design.structural.bridge;

public abstract class Operater {
	
	private Operation operation; 
	
	public Operation getOperation() {
		return operation;
	}
	
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	
	public void operate() {
		this.operation.operate();
	}
}
