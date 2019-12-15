package structural.proxy;

public class Client {

	public static void main(String[] args) {
		ExpensiveClassProxy proxy = new ExpensiveClassProxy();
		proxy.process();
		proxy.process();
	}
}
