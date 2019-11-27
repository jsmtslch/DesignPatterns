package behavioural.command;

public class HomeOwner {
	
	public static void main(String args[]) {
		Light light = new Light();
		SimpleRemote lightRemoteController = new SimpleRemote(new LightOnCommand(light));
		lightRemoteController.buttonPressed();
		
		Stereo stereo = new Stereo();
		SimpleRemote stereoRemoteController = new SimpleRemote(new StereoOnCommand(stereo));
		stereoRemoteController.buttonPressed();
	}

}
