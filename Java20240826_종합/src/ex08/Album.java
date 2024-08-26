package ex08;

public class Album extends Item {
	String artist;
	
	public Album(String name, int price, String artist) {
		super(name, price);
		this.artist = artist;
	}
	public int getPrice() {
		return price;
	}
	
	public void print() {
		super.print();
		System.out.printf(
				"- 아티스트:" + artist + "\n");
	}
}
