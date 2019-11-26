package behavioural.observer;

public class Observer1 extends Observer{
	
	Observable o;
	
	public Observer1(Observable o2) {
		o = o2;
		o2.addObserver(this);
	}

	@Override
	public void eventListen() {
		System.out.println(o.getState());
	}

	
}
