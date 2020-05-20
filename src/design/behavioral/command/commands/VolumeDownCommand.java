package design.behavioral.command.commands;

import design.behavioral.command.Command;
import design.behavioral.command.TV;

public class VolumeDownCommand implements Command{
	
	private TV tv;
	
	public VolumeDownCommand(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.volumeDown();
		
	}

	@Override
	public void undo() {
		tv.volumeUp();
	}
}
