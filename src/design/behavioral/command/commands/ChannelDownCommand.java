package design.behavioral.command.commands;

import design.behavioral.command.Command;
import design.behavioral.command.TV;

public class ChannelDownCommand implements Command{

	private TV tv;
	
	public ChannelDownCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.channelDown();
		
	}

	@Override
	public void undo() {
		tv.channelUp();
	}
}
