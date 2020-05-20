package design.behavioral.interpreter;

import design.behavioral.interpreter.expressions.Average;
import design.behavioral.interpreter.expressions.Number;
import design.behavioral.interpreter.expressions.Sum;


public class App {
	
	public static void main(String[] args) {
		Context context = new Context();
		Sum sum = new Sum(new Number(1), new Number(2), new Number(3), new Number(4));
		Average average = new Average(sum, new Number(7));
		double result = average.interpret(context);
		System.out.println(context);
		System.out.println("결과 : " + result);
	}
}
