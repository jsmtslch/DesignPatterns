package structural.composite;

public class Developer implements Employee {
	
	String name;
	Integer id;
	
	public Developer(String name, Integer id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public void empDetails() {
		System.out.println(this.name+" is a developer with emp id:"+this.id);
	}

}
