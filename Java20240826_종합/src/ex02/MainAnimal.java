package ex02;

class Animal{
	
	
	private String name; // 멤버 변수 or 인스턴스 변수 => 생성된 객체들이 개별적 가지고 있음.
	private static int count;  // 정적 변수 or 클래스 변수 => 공유 자원
	
	
	public Animal() {
		this("동물");
//		this.name = "동물";
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	void speak() {
		
	}
	
	void info() { // 메소드 or 인스턴스 메소드
		System.out.println(name + " 입니다.");
	}
	
	static void staticInfo() { // static이 붙는 경우 정적 메소드 or 클래스 메소드
//		name = "동물";
		count++;
//		info();
		func();
	}
	
	static void func() {
		
	}
	
}

public class MainAnimal {

	public static void main(String[] args) {
		
		int num = 10;
		Animal animal = new Animal("동물"); // 객체생성 or 인스턴스생성
		
		animal.info();
		
		Animal animal2 = new Animal();
		animal2.info();
	}

}
