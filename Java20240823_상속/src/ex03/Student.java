package ex03;

public class Student extends Person {
	String school;    //학교
	String studentID; //학번
	
	Student(String name, int age, String school, String studenID) {
		super(name, age);
		this.school = school;
		this.studentID = studenID;
	}
	
	void introduce() {
		super.introduce();
		System.out.printf("학교는 %s이고, 학번은 %s 입니다.\n", school, studentID );
	}
	
	void study() {
		System.out.println(name + "이(가) 공부하고 있습니다.");
	}
	
}
