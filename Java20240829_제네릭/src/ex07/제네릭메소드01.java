package ex07;

class Box<T>{ 
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

class BoxFactory{
	//제네릭메소드
	public static <T> Box<T> markBox(T o){
		Box<T> box = new Box<T>();
		box.setObj(o);
		return box;
	}
}

/*
 * public static <String> Box<T> markBox(String o){
		Box<String> box = new Box<String>();
		box.setObj(o);
		return box;
 */

public class 제네릭메소드01 {

	public static void main(String[] args) {
		
		Box<String> sBox = BoxFactory.markBox("Sweet"); 
//		System.out.println(sBox.getObj());
		String str = sBox.getObj();
		System.out.println(str);
		
		Box<Integer> iBox = BoxFactory.markBox(10);
//		System.out.println(iBox.getObj());
		
		
	}

}
