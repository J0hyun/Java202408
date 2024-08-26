package ex03;

public class Dog extends Animal { // 하위 클래스
	int age;
	
	public Dog() {
		
	}
	
	Dog(String name, int age) {
		super(name);    // 슈퍼는 항상 문장 맨 앞에 작성
		this.age = age;
		
	}
	
	int getAge() {
		return age;
	}
	
	@Override // 상위클래스 가지고 있는 메소드 재정의
	void info() {
//		System.out.println(getName() + " 입니다.");
		super.info();
		System.out.println(age + "살 입니다.");
	}
	
	@Override
	void speak() { // 반드시 재정의
		System.out.println("멍멍!");
	}
	
}
