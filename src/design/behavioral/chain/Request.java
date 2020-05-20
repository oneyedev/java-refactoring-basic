package design.behavioral.chain;

public class Request {
	private String sender;
	private String body;
	
	public Request(String sender, String body) {
		super();
		this.sender = sender;
		this.body = body;
	}
	
	public String getSender() {
		return sender;
	}
	
	public String getBody() {
		return body;
	}
}
