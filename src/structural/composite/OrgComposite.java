package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class OrgComposite implements Employee {
	
	List<Employee> emps;
	
	public OrgComposite() {
		emps = new ArrayList<>();
	}
	
	public void addEmployee(Employee e) {
		this.emps.add(e);
	}
	
	public void removeEmployee(Employee e) {
		this.emps.remove(e);
	}

	@Override
	public void empDetails() {
		for(Employee e : this.emps) {
			e.empDetails();
		}
	}

}
