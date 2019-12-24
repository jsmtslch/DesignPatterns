package structural.composite;

public class Client {

	public static void main(String[] args) {
		Employee dev1 = new Developer("Jay Sal", 1);
		Employee manager = new Manager("John Doe", 2);
		
		OrgComposite org = new OrgComposite();
		org.addEmployee(dev1);
		org.addEmployee(manager);
		
		org.empDetails();
	}
}
