package behavioural.chainofresponsibility;

public class DispenseTwenty implements Dispense{
	
	Dispense chain;

	@Override
	public void nextInChain(Dispense d) {
		this.chain = d;
	}

	@Override
	public void dispense(Currency c) {
		int count = c.getAmount() / 20;
		System.out.println("Dispensing "+count+" notes of $20");
		int remain = c.getAmount() % 20;
		if(remain > 0) {
			this.chain.dispense(new Currency(remain));
		}
	}

}
