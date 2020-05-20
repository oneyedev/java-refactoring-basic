package design.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Context {
	private List<Expression> visited = new ArrayList<>();
	
	public void visit(Expression expression) {
		visited.add(expression);
	}
	
	@Override
	public String toString() {
		return String.format("방문한 목록 %s", visited);
	}
}
