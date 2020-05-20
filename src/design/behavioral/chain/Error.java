package design.behavioral.chain;

public class Error {
	
	private boolean error;
	private int code;
	private String message;

	public boolean isError() {
		return error;
	}
	
	public void setError(boolean error) {
		this.error = error;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
