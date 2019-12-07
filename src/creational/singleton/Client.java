package creational.singleton;

public class Client {

	public static void main(String[] args) {
		DBConnector db1 = DBConnector.getInstance();
		DBConnector db2 = DBConnector.getInstance();
		
		System.out.println(db1.hashCode());
		
		System.out.println(db2.hashCode());
	}
}
