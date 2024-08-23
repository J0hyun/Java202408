package ex01;

//학생 클래스
public class Student {
	
	String school;
	String studentID;  //학번
	private String name;
	private int age;

	public Student(String name, int age, String school, String studentID) {
		this.name = name;
		this.age = age;
		this.school = school;
		this.studentID = studentID;
	}
	
	public void introduce () {
		System.out.printf("안녕하세요, 제 이름은 %s이고, 나이는 %d살 입니다.", name, age);
		System.out.printf("학교는 %s이고, 학번은 %s 입니다.\n", school, studentID);
	}
	public void walk() {
		System.out.println(name + "이(가) 걷고 있습니다.");
	}
	
	public void study() {
		System.out.println(name + "이(가) 공부하고 있습니다.");
	}
}
