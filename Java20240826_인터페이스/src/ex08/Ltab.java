package ex08;

public class Ltab extends Mobile {

	Ltab() {}
	
	Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		
	}

	void operate(int time) { //감소
		int tmp = getBatterySize() - time*10;
		setBatterySize(tmp);
		
	}
	
	
	void charge(int time) { //충전
		setBatterySize(getBatterySize() + time * 10);
	}
}
