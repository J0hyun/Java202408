package ex03;
//이름
//나이

public class Person {
	String name;
	int age;
	
	Person() {}
	
	Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void introduce() {
		System.out.printf("안녕하세요, 제 이름은 %s이고, 나이는 %d살 입니다.\n", name, age);
	}
	
	void walk() {
		System.out.println(name + "이(가) 걷고 있습니다.");
	}
	
}
