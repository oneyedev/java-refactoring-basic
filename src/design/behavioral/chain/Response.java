package design.behavioral.chain;

public class Response {
	private int code;
	private String body;
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return String.format("Response [code=%s, body=%s]", code, body);
	}
}
