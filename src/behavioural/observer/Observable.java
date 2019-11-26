package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
	List<Observer> observers = new ArrayList<>();
	int state;
	int counter = 0;
	
	public void addObserver(Observer o) {
		o.id = counter++;
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		for(Observer interested : observers) {
			if(interested.id == o.id) {
				observers.remove(o);
			}
		}
	}
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		for(Observer o : observers) {
			o.eventListen();
		}
	}
	
}
