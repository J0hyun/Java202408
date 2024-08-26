package ex06;

public class Cat extends Animal { // 하위 클래스
	int age;
	
	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}
	
	@Override
	void info () {
		super.info();
		System.out.println(age + "살 입니다.");
	}
	
	@Override
	void speak() { // 반드시 재정의
		System.out.println("야옹~");
	}
	
}
