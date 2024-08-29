package ex02;


class Apple{
	@Override
	public String toString() {
		return "I am an apple";
	}
	
}

class Orange {
	@Override
	public String toString() {
		return "I am an orange.";
	}
}

class Box{
	private Object obj;
	
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
}

//class Box<T>{ // 제네릭 기반의 클래스 정의
//	private T obj;
//	
//	public T getObj() {
//		return obj;
//	}
//	public void setObj(T obj) {
//		this.obj = obj;
//	}
//}

public class FruitAndBox {

	public static void main(String[] args) {
		
		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		
		Apple ap = (Apple)aBox.getObj(); //형 변환 해야하는 단점
		
		Orange op = (Orange)oBox.getObj();		
		
		System.out.println(ap);
		System.out.println(op); 
		
		aBox.setObj("new Apple()");
		
		System.out.println(aBox.getObj());
		
		
		
	}
	
	 
}
