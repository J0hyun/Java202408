package ex09;

public class Secretary extends Employee implements Bonus {
	Secretary() {}
	
	Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	
	
	double tax() {
		return getSalary() * 0.1;
	
	}
	
	
	
	@Override
	public void incentive(int pay) {
		int tmp = getSalary() + (int)(pay * 0.8);
		setSalary(tmp);
	}
	

	
}
