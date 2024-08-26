package ex08;

public class Movie extends Item {
	String director;
	String actor;
	
	public Movie(String name, int price, String director, String actor) {
		super(name, price);
		this.director = director;
		this.actor = actor;
	}
	public int getPrice() {
		return price;
	}
	
	public void print() {
		super.print();
		System.out.printf(  
				"- 감독:" + director+ ", " + "배우:" + actor  + "\n");
	}
}
