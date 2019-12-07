package creational.singleton;

public class DBConnector {
	
	private static DBConnector dbConnetor;
	
	private DBConnector() {
		
	}
	
	public static DBConnector getInstance() {
		if(dbConnetor == null)
			dbConnetor = new DBConnector();
		return dbConnetor;
	}

}
