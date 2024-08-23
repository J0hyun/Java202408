package ex06;

//학생 클래스
// extends Person  Person클래스 상속받음
// final class Student=> Student 클래스 상속불가.
public class Student extends Person {
	
	String school;
	String studentID;  //학번

	public Student() {}

	public Student(String name, int age, String school, String studentID) {
		super(name, age);// 상위클래스 (person)에 작성한 name age 생성자 호출 // 맨 앞에 기입
		this.school = school;
		this.studentID = studentID;
	}
	
	@Override // @:어노테이션, @Override --> 상위클래스 메소드를 하위클래스가 재정의했다.
	public void introduce () {
		super.introduce(); //오버라이딩한 상위클래스 메소드 호출 
		System.out.printf("학교는 %s이고, 학번은 %s 입니다.\n", school, studentID);
	}

	
	public void study() {
		System.out.println(name + "이(가) 공부하고 있습니다.");
	}
}
