package uml.sequence;

public class Server {
	public void sendUnsentEmail() {
		System.out.println("미발송 메일을 보냅니다.");
	}

	public String newEmail() {
		System.out.println("새로운 이메일이 있습니다.");
		return "Welcome";
	}

	public void downloadEmail(String newEmail) {
		System.out.println(newEmail + "을 다운로드 합니다.");
		
	}

	public void deleteOldEmail() {
		System.out.println("오래된 메일을 삭제합니다.");
	}
}
