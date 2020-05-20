package design.behavioral.chain;

public abstract class RequestHandler {
	protected RequestHandler next;
	
	public RequestHandler appendNext(RequestHandler next) {
		if(this.next == null) {
			this.next = next;
		} else {
			this.next.appendNext(next);
		}
		return this;
	}
	
	public abstract void accept(Request request, Response response, Error error);
	
	public void handleRequest(Request request, Response response, Error error) {
		accept(request, response, error);
		if(next != null) {
			next.handleRequest(request, response, error);
		}
	}
}
