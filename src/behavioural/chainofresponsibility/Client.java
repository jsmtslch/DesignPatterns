package behavioural.chainofresponsibility;

public class Client {
	
	public static void main(String[] args) {
		Currency c = new Currency(530);
		Dispense fifty = new DispenseFifty();
		Dispense twenty = new DispenseTwenty();
		Dispense ten = new DispenseTen();
		fifty.nextInChain(twenty);
		twenty.nextInChain(ten);
		fifty.dispense(c);
	}

}
