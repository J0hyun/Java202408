package ex08;

public class MobileTest {

	public static void main(String[] args) {
		Mobile mLtab = new Ltab("Ltab", 500, "ABC-01");
		Mobile mOtab = new Otab("Otab", 1000, "XYZ-20");
		
		MobileTest.printTitle();
		MobileTest.printMobile(mLtab);
		MobileTest.printMobile(mOtab);
		System.out.println();
		System.out.println("[10분 충전]");
		
		
		mLtab.charge(10);
		mOtab.charge(10);
		MobileTest.printTitle();
		MobileTest.printMobile(mLtab);
		MobileTest.printMobile(mOtab);
		System.out.println();
		System.out.println("[5분 통화]");
		
		mLtab.operate(5);
		mOtab.operate(5);
		MobileTest.printTitle();
		MobileTest.printMobile(mLtab);
		MobileTest.printMobile(mOtab);
		
		
		
	}
	public static void printMobile(Mobile mobile) {
		System.out.printf("%s\t %10d\t %15s\t\n", 
				mobile.getMobileName(),
				mobile.getBatterySize(),
				mobile.getOsType());
	}
	public static void printTitle() {
		System.out.println("Mobile          Battery              OS");
		System.out.println("---------------------------------------");
		
	}
}
