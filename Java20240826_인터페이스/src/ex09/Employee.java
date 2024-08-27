package ex09;

public abstract class Employee {
	private String name;
	private int number;
	private String department; // 부서
	private int salary; // 월급
	
	
	Employee() {}
	
	Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}

	abstract double tax();
	
	double getExtraPay() {
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	

	
	
	
}
