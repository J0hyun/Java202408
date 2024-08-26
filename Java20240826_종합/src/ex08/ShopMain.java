package ex08;

public class ShopMain {

	public static void main(String[] args) {
		Book book = new Book("Java", 10000, "han", "12345");
		book.print();
		
		Album album = new Album("앨범1", 15000, "seo");
		album.print();
		
		Movie movie = new Movie("영화1", 18000, "감독1", "배우1");
		movie.print();
		
		
		
		
		
		
		int sum = book.getPrice() + album.getPrice() + movie.getPrice();
		System.out.println("상품 가격의 합: " + sum);
		
	}

}
