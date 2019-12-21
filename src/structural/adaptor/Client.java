package structural.adaptor;

public class Client {
	public static void main(String[] args) {
		Socket s = new Socket();
		System.out.println("Default Voltage is:"+s.getVoltage());
		
		Adaptor adaptor = new Adaptor();
		Socket s3 = adaptor.get3V();
		System.out.println("S3 voltage: "+s3.getVoltage());
		
		Socket s60 = adaptor.get60V();
		System.out.println("S60 voltage: "+s60.getVoltage());
	}
}
