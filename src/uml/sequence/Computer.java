package uml.sequence;

public class Computer {
	
	public void checkEmail(Server server) {
		System.out.println("이메일 체크를 시작합니다.");
		server.sendUnsentEmail();
		String newEmail = server.newEmail();
		server.downloadEmail(newEmail);
		server.deleteOldEmail();
		System.out.println("이메일 체크가 끝났습니다.");
	}
}
