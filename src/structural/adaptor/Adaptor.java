package structural.adaptor;

public class Adaptor {
	
	public Socket get120V() {
		return new Socket();
	}
	
	public Socket get60V() {
		Socket s = new Socket();
		s.setVoltage(60);
		return s;
	}
	
	public Socket get3V() {
		Socket s = new Socket();
		s.setVoltage(3);
		return s;
	}

}
