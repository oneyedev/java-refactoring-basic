package design.behavioral.command;

import java.security.InvalidParameterException;
import java.util.Scanner;

import design.behavioral.command.commands.ChannelDownCommand;
import design.behavioral.command.commands.ChannelUpCommand;
import design.behavioral.command.commands.VolumeDownCommand;
import design.behavioral.command.commands.VolumeUpCommand;

public class App {
	public static void main(String[] args) {
		TV tv = new TV();
		RemoteController controller = new RemoteController();
		try(Scanner sc = new Scanner(System.in)){
			while(true) {
				System.out.printf("%s 명령어를 입력해주세요. \n1)채널업\n2)채널다운\n3)볼륨업\n4)볼륨다운\n0)실행취소\n-1)나가기\n", tv);
				String line = sc.nextLine();
				if(line.equals("-1")) {
					break;
				}
				if(line.equals("0")) {
					controller.undoCommand();
				} else {
					Command command = getCommand(line, tv);
					controller.doCommand(command);
				}
				
			}
		}
	}
	
	private static Command getCommand(String line, TV tv) {
		switch (line) {
		case "1":
			return new ChannelUpCommand(tv);
		case "2":
			return new ChannelDownCommand(tv);
		case "3":
			return new VolumeUpCommand(tv);
		case "4":
			return new VolumeDownCommand(tv);
		default:
			throw new InvalidParameterException();
		}
	}

}
