package ex11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


class Car {
	private String model;
	private String color;
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "model :" + model + " " + ", color : " + color; 
	}
	
	@Override
	public int hashCode() {
		return 0;
	}
	
	
	// a.equals(b)
	@Override
	public boolean equals(Object obj) {
		String m = ((Car)obj).model;
		String c = ((Car)obj).color;
		
		if( (model.equals(m) && (color.equals(c))))
			return true;
		return false;
		
	}
}

public class HashSet05 {

	public static void main(String[] args) {
		
		Set<Car> set = new HashSet<Car>();
		
		set.add(new Car("소나타", "흰색"));
		set.add(new Car("K8", "흰색"));
		set.add(new Car("K8", "검정색"));
		set.add(new Car("그랜저", "회색"));
		set.add(new Car("k8", "검정색"));
		set.add(new Car("그랜저", "회색"));
		
		Iterator<Car> itr = set.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		
		
		
		
	}

}
