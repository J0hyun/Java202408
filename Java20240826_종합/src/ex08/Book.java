package ex08;

public class Book extends Item {
	String author;
	String isbn;
	
	
	
	public Book(String name, int price, String author, String isbn) {
		super(name, price);
		this.author = author;
		this.isbn = isbn;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void print() {
		super.print();
		System.out.printf( 
				"- 저자:" + author + ", " + "isbn:" + isbn + "\n");
	}
	
	
	

}
