package test02;

class Pair<K, V> {
	private K First;
	private V Second;

	public K getFirst() {
		return First;
	}

	public void setFirst(K first) {
		this.First = first;
	}

	public V getSecond() {
		return Second;
	}

	public void setSecond(V second) {
		this.Second = second;
	}
	
	@Override
	public String toString() {
		return "Pair{first=" + First + ", second=" + Second + "}";
	}
	
}






public class PairTest {

	public static void main(String[] args) {
		Pair<Integer, String> pair1 = new Pair<>();
		
		pair1.setFirst(1);
		pair1.setSecond("data");
		System.out.println(pair1.getFirst());
		System.out.println(pair1.getSecond());
		System.out.println("pair1 = " + pair1);
		
		
		
		Pair<String, String> pair2 = new Pair<>();
		
		pair2.setFirst("key");
		pair2.setSecond("Value");
		System.out.println(pair2.getFirst());
		System.out.println(pair2.getSecond());
		System.out.println("pair2 = " + pair2);
	}

}
