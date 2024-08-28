package ex00;

public class MobileTest {

	public static void main(String[] args) {
		Mobile Ltab1 = new Ltab("Ltab", 500, "ABC-01");
		Mobile Otab1 = new Otab("Otab", 1000, "XYZ-20");
		
		pritnTitle();
		printMobile(Ltab1);
		printMobile(Otab1);
		System.out.println();
		
		System.out.println("[10분 충전]");
		Ltab1.charge(10);
		Otab1.charge(10);
		pritnTitle();
		printMobile(Ltab1);
		printMobile(Otab1);
		System.out.println();
		
		System.out.println("[5분 통화]");
		Ltab1.operate(5);
		Otab1.operate(5);
		pritnTitle();
		printMobile(Ltab1);
		printMobile(Otab1);
		
		
		
	}
	
	public static void printMobile(Mobile mobile) {
		System.out.printf("%s     %d\t   %s\n",
				mobile.mobileName,
				mobile.batterySize,
				mobile.osType);
	}
	public static void pritnTitle() {
		System.out.println("Mobile   Battery    OS");
		System.out.println("--------------------------");
	}

}
