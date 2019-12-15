package structural.proxy;

public class ExpensiveClassProxy implements ExpensiveClass{
	
	ExpensiveClass expensiveClass;

	@Override
	public void process() {
		if(this.expensiveClass == null)
			this.expensiveClass = new ExpensiveClassImpl();
		this.expensiveClass.process();
	}

}
