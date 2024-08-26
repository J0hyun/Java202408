package ex06;



public class MainAnimal {

	public static void main(String[] args) {
		
		//상위 클래스는 하위클래스 참조할 수 있다.
		//단, 접근 할 수 있는 영역은 본인 클래스 또는 본인 클래스 부모 클래스만 접근 가능하다.
		
		
//		Animal an = new Animal();  객체생성불가
		
		Dog dog = new Dog("강아지", 5);
		dog.info();
		dog.speak();
//		System.out.println(dog.age + "살 입니다.");
		
		
		System.out.println("----------------------");
		
		
		Cat cat = new Cat("고양이", 3);
		cat.info();
		cat.speak();
		
		Cow cow = new Cow();
		cow.speak();
	}

}
