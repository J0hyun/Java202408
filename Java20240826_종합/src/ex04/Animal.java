package ex04;

public class Animal { //상위 클래스
	
	
	private String name;
	
	
	public Animal() {}
	
	public Animal(String name) {
		this.name = name;
	}
	
	
	
	void speak() {
		
	}
	
	void info() {
		System.out.println(name + " 입니다.");
		
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
}

