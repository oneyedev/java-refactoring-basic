package uml.sequence;

public class App {
	public static void main(String[] args) {
		Computer computer = new Computer();
		Server server = new Server();
		computer.checkEmail(server);
	}
}
