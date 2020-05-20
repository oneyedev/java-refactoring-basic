package design.behavioral.visitor.visitors;

import design.behavioral.visitor.CoffeeVisitor;

public class Latte implements CoffeeVisitor{
	
	@Override
	public void visitEspressoMachine() {
		System.out.println("에스프레소를 추출합니다.");
	}

	@Override
	public void visitWaterHeater() {
		System.out.println("라떼에 뜨거운 물을 붓습니다.");
	}

	@Override
	public void visitMilkSteamer() {
		System.out.println("라떼에 스팀밀크를 추가합니다.");
	}
}
