package test01;

public class PlaneTest {

	public static void main(String[] args) {
		Plane airPlane = new Airplane("L747", 1000);
		Plane cargoPlane = new Cargoplane("C40", 1000);
		
	    Plane[] p = {airPlane, cargoPlane};
		
		printInfo(p);
		airPlane.flight(100);
		cargoPlane.flight(100);
		System.out.println();
		
		System.out.println("[100 운항]");
		printInfo(p);
		System.out.println();
		
		System.out.println("[200 주유]");
		airPlane.refuel(200);
		cargoPlane.refuel(200);
		printInfo(p);
		
		
		
	}
	public static void printInfo(Plane[] list) {
		System.out.println(" Plane       fuelSize");
		System.out.println("----------------------");
		for(Plane pl : list )
		System.out.printf("  %s \t     %d\n",
				pl.getPlaneName(),
				pl.getFuelSize());
		
	}
}
