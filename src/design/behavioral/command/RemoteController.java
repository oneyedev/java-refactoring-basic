package design.behavioral.command;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class RemoteController {
	private Queue<Command> commandStack = Collections.asLifoQueue(new ArrayDeque<Command>());
	
	public void doCommand(Command command) {
		commandStack.offer(command);
		command.execute();
	}
	
	public void undoCommand() {
		Command last = commandStack.poll();
		if(last != null) {
			last.undo();
		}
	}
}
