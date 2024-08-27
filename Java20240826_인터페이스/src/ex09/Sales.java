package ex09;

public class Sales extends Employee implements Bonus {
	double ExtraPay;
	
	Sales() {}
	
	Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	double tax() {
		return getSalary() * 0.13;
	
	}
	
	@Override
	public void incentive(int pay) {
		int tmp = getSalary() + (int)(pay * 1.2);
		setSalary(tmp);
	}

	
	public double getExtraPay() {
		return getSalary() * 0.03;
		
	} 
	
	
	
}
