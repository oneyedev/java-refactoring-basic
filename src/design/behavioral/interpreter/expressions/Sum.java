package design.behavioral.interpreter.expressions;

import java.util.ArrayList;
import java.util.List;

import design.behavioral.interpreter.Context;
import design.behavioral.interpreter.Expression;

public class Sum implements Expression{
	
	public List<Expression> children = new ArrayList<>();
	
	public Sum(Expression... expressions) {
		for (int i = 0; i < expressions.length; i++) {
			children.add(expressions[i]);
		}
	}

	@Override
	public double interpret(Context context) {
		double sum = 0;
		for (Expression expression : children) {
			sum += expression.interpret(context);
		}
		return sum;
	}
	
	
}
