package design.behavioral.chain.handlers;

import design.behavioral.chain.Request;
import design.behavioral.chain.RequestHandler;
import design.behavioral.chain.Response;
import design.behavioral.chain.Error;

public class Logger extends RequestHandler{

	@Override
	public void accept(Request request, Response response, Error error) {
		System.out.printf("'%s'에게서 '%s' 요청이 들어왔습니다.%n", request.getSender(), request.getBody());
	}

}
