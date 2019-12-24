package structural.composite;

public class Manager implements Employee {
	
	String name;
	Integer id;
	
	public Manager(String name, Integer id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public void empDetails() {
		System.out.println(this.name +" is a Manager and has emp id:"+this.id);
	}

}
