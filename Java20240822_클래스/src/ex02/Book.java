package ex02;

public class Book {
	String title; 	// 제목
	String author; 	// 저자
	int page;  		// 페이지수
	
	Book() {
		this(" ", " ", 0);
	}
	
	Book(String title, String author) {
//		this.title = title;
//		this.author = author;
		this(title, author,0);
	}
	Book(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
//		page = this.page;  --> 오류
		
	}
	
	
	void displayInfo() {
		System.out.println("제목:" + title + " 저자:" + author + " 페이지:" + page);
	}
}
