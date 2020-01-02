package behavioural.chainofresponsibility;

public class DispenseFifty implements Dispense {
	
	Dispense chain;
	
	public DispenseFifty() {
		
	}

	@Override
	public void nextInChain(Dispense d) {
		this.chain = d;
	}

	@Override
	public void dispense(Currency c) {
		int count = c.getAmount() / 50;
		System.out.println("Dispensing "+count+" notes of $50");
		int remain = c.getAmount() % 50;
		if(remain > 0) {
			this.chain.dispense(new Currency(remain));
		}
	}

}
