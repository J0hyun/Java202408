package ex04;

public class CarMain2 {

	public static void main(String[] args) {
		Car2 car1 = new Car2("K3");	
		Car2 car2 = new Car2("G80");
		Car2 car3 = new Car2("Model Y");
		car1.infoCar();
		car2.infoCar();
		car3.infoCar();
		
		
		Car2.showTotalCars();
	}

}
