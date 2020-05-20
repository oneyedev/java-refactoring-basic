package design.behavioral.command.commands;

import design.behavioral.command.Command;
import design.behavioral.command.TV;

public class VolumeUpCommand implements Command{
	
	private TV tv;
	
	public VolumeUpCommand(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.volumeUp();
		
	}

	@Override
	public void undo() {
		tv.volumeDown();
	}
}
