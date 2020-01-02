package behavioural.chainofresponsibility;

public class DispenseTen implements Dispense{
	
	Dispense chain;

	@Override
	public void nextInChain(Dispense d) {
		this.chain = d;
	}

	@Override
	public void dispense(Currency c) {
		int count = c.getAmount() / 10;
		System.out.println("Dispensing "+count+" notes of $10");
		int remain = c.getAmount() % 10;
		if(remain > 0) {
			this.chain.dispense(new Currency(remain));
		}
	}

}
