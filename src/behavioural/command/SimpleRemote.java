package behavioural.command;

public class SimpleRemote {
	
	Command command;
	
	public SimpleRemote(Command command) {
		this.command = command;
	}
	
	public void buttonPressed() {
		command.execute();
	}

}
