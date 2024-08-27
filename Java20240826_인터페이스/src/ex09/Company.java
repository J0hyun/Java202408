package ex09;

public class Company {

	public static void main(String[] args) {
		Secretary secretary = new Secretary("Duke", 1, "secretary", 800);
		Sales sales = new Sales("Tuxi", 2, "sales", 1200);
		
		Employee[] emp = {secretary, sales};
		
		Company.printEmployee(emp, false);
		
		secretary.incentive(100);
		sales.incentive(100);
		System.out.println("");
		
		System.out.println("[인센티브 100 지급]");
		Company.printEmployee(emp, true);
		
}
	public static void printEmployee(Employee[] emps, boolean isTax) {
		if(isTax) {
			System.out.println("name    department     salary     tax     extra pay");		
			System.out.println("--------------------------------------------------");
			for(Employee emp: emps)
			System.out.printf("%s\t %-10s\t%s\t  %3.1f    %6.1f\n",
					emp.getName(),
					emp.getDepartment(),
					emp.getSalary(),
					emp.tax(),
					emp.getExtraPay()
				);
			}
		else {
			System.out.println("name    department      salary    extra pay");		
			System.out.println("--------------------------------------------------");
			for(Employee emp: emps)
			System.out.printf("%s \t %s  \t  %s\t  %.1f\n",
					emp.getName(),
					emp.getDepartment(),
					emp.getSalary(),
					emp.getExtraPay()
					);
		
	}
	}
}


