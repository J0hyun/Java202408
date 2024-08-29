package ex05;

class A{}

class B extends A{}

class C extends B{}

class Box<T extends A>{ // T 전달될 수 있는 대상은 A거나 A 하위 클래스만 가능
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

public class 타입제한하기 {

	public static void main(String[] args) {
		
		Box<A> aBox = new Box<>();
		
		aBox.setObj(new A());
		A a = aBox.getObj();
		
		aBox.setObj(new B());
		B b = (B)aBox.getObj();
		
		aBox.setObj(new C());
		C c = (C)aBox.getObj();
		
		
	}

}
