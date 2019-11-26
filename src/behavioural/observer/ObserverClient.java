package behavioural.observer;

public class ObserverClient {
	public static void main(String args[]) {
		Observable o = new Observable();
		Observer1 observer1	= new Observer1(o);
		System.out.println(o.getState());
		o.setState(2);
	}
}
