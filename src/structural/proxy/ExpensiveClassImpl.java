package structural.proxy;

public class ExpensiveClassImpl implements ExpensiveClass {
	
	public ExpensiveClassImpl() {
		System.out.println("Init the object");
		doTheHeavyLifting();
	}

	private void doTheHeavyLifting() {
		System.out.println("Doing the heavy lifting");
	}

	@Override
	public void process() {
		System.out.println("Now processing the object!!!");
	}

}
