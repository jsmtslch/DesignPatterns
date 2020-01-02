package behavioural.chainofresponsibility;

public interface Dispense {
	
	public void nextInChain(Dispense d);

	public void dispense(Currency c);
}
