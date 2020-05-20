package design.behavioral.chain.handlers;

import design.behavioral.chain.Request;
import design.behavioral.chain.RequestHandler;
import design.behavioral.chain.Response;
import design.behavioral.chain.Error;

public class SenderGuard extends RequestHandler{

	private String blacklist;
	
	public SenderGuard(String blacklist) {
		this.blacklist = blacklist;
	}

	@Override
	public void accept(Request request, Response response, Error error) {
		if(blacklist.equals(request.getSender())) {
			error.setError(true);
			error.setCode(403);
		}
	}
}
