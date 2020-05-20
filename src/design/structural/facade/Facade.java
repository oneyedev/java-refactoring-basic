package design.structural.facade;

import design.structural.facade.subs.SubA;
import design.structural.facade.subs.SubB;
import design.structural.facade.subs.SubC;

public class Facade {

	private SubA subA = new SubA();
	private SubB subB = new SubB();
	private SubC subC = new SubC();
	
	public void start() {
		subA.doSomething();
		subB.doSomething();
		subC.doSomething();
	}
}
