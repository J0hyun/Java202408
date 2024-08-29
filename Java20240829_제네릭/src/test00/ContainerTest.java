package test00;

class Container<T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
	public boolean isEmpty() {
		return item == null;
	}
	
	
	
}




public class ContainerTest {

	public static void main(String[] args) {

		Container<String> stringContainer = new Container<>();
		System.out.println("반값 확인1: " + stringContainer.isEmpty());
		
		stringContainer.setItem("data1");
		System.out.println("저장 데이터: " + stringContainer.getItem());
		System.out.println("반값 확인2: " + stringContainer.isEmpty());
		
		Container<Integer> integerContainer = new Container<>();
		integerContainer.setItem(10);
		System.out.println("저장 데이터:" + integerContainer.getItem());
		
	}
	

}
