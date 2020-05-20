package design.behavioral.chain.handlers;

import design.behavioral.chain.Request;
import design.behavioral.chain.RequestHandler;
import design.behavioral.chain.Response;
import design.behavioral.chain.Error;

public class DataHandler extends RequestHandler{

	@Override
	public void accept(Request request, Response response, Error error) {
		response.setBody("인피티니 스톤을 반환했습니다.");
		response.setCode(200);
	}
}
