package ex03;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person("홍길동", 20);
		
		person.introduce();
		person.walk();
		
		System.out.println("------------------------");
		
		
		Student student = new Student("길동", 23, "아주대학교", "1111-222233333");
		
		student.introduce();
		student.study();
		
		System.out.println("------------------------");
		
		SalesMan sales = new SalesMan("홍길", 25 , "삼성", 100000);
		sales.introduce();
		sales.work();
		sales.walk();
	}

		
		
}
