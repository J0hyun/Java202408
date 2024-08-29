package test01;

class Container1<K, V> {
	K key;
	V value;
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	
	
}







public class ContainerExample {

	public static void main(String[] args) {

		Container1<String, String> container1 = new Container1<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		
		Container1<String, Integer> container2 = new Container1<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
	
	}

}
