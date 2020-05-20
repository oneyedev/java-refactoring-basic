package design.behavioral.chain.handlers;

import design.behavioral.chain.Request;
import design.behavioral.chain.RequestHandler;
import design.behavioral.chain.Response;
import design.behavioral.chain.Error;

public class ErrorHandler extends RequestHandler{

	@Override
	public void accept(Request request, Response response, Error error) {
		if(error.isError()) {
			response.setCode(error.getCode());
			response.setBody(error.getMessage());
		}
	}
}
