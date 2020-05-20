package design.behavioral.interpreter.expressions;

import design.behavioral.interpreter.Context;
import design.behavioral.interpreter.Expression;

public class Number implements Expression{
	
	private int value;
	
	public Number(int value) {
		this.value = value;
	}
	
	@Override
	public double interpret(Context context) {
		context.visit(this);
		return value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
