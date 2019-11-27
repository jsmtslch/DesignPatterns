package behavioural.command;

public class StereoVolumeCommand implements Command{
	
	Stereo stereo;
	
	public StereoVolumeCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.volumeControl();
	}

}
