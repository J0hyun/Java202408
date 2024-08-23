
package ex04;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person("홍길동", 20);
		
		person.introduce();
		person.walk();
		
		System.out.println("----------------------------");
		
		Student student = new Student("홍길동", 20 , "아주대학교", "12345678");
		
		student.introduce();
		student.walk();
		student.study();
		
		System.out.println("----------------------------");
		
		SalesMan sales = new SalesMan("홍길순", 22, "삼성", 10000);
		sales.introduce();
		sales.walk();
		sales.work();
		
		System.out.println("----------------------------");
		
		PartTimeStudent partTimeStudent = 
				new PartTimeStudent("홍수빈", 20 , "아주대", 
						"1234578", "구내서점", 100000);
		partTimeStudent.introduce();
		partTimeStudent.work();
		
	}

}
