package design.behavioral.command.commands;

import design.behavioral.command.Command;
import design.behavioral.command.TV;

public class ChannelUpCommand implements Command{
	
	private TV tv;
	
	public ChannelUpCommand(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.channelUp();
		
	}

	@Override
	public void undo() {
		tv.channelDown();
	}
}
