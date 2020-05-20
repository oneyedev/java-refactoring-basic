package design.behavioral.chain;

import design.behavioral.chain.handlers.DataHandler;
import design.behavioral.chain.handlers.ErrorHandler;
import design.behavioral.chain.handlers.Logger;
import design.behavioral.chain.handlers.SenderGuard;

public class App {
	private static RequestHandler requestHandler = 
			new Logger()
			.appendNext(new SenderGuard("타노스"))
			.appendNext(new DataHandler())
			.appendNext(new ErrorHandler());
	
	public static void main(String[] args) {
		
		Request invalidRequest = new Request("타노스", "나는 필연적 존재다");
		Response responseForTanos = handleRequest(invalidRequest);
		System.out.println(responseForTanos);
		
		Request validRequest = new Request("닥터 스트레인지", "난 14,000,605개의 미래를 보고 왔어");
		Response responseForDoctor = handleRequest(validRequest);
		System.out.println(responseForDoctor);
	}
	
	private static Response handleRequest(Request request) {
		Response response = new Response();
		Error error = new Error();
		requestHandler.handleRequest(request, response, error);
		return response;
	}
}
