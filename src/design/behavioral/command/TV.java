package design.behavioral.command;

public class TV {
	private int volume = 10, channel = 5;
	
	public void volumeUp() {
		this.volume += 1;
	}
	
	public void volumeDown() {
		this.volume -= 1;
	}
	
	public void channelUp() {
		this.channel += 1;
	}
	
	public void channelDown() {
		this.channel -= 1;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public int getChannel() {
		return channel;
	}
	
	@Override
	public String toString() {
		return String.format("현재 TV의 채널은 %s이며, 볼륨은 %s입니다.", channel, volume);
	}
}
