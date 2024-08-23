package ex06;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		Person ps1 = new Student();
		
//		Student s1 = new Student();
		
//		Student s2 = new Person();
		/* s2는 student 참조변수이기때문에
		 * student와 person정보를 다 사용할 수 있다.
		 * 그러나 person객체를 참조하면 그 객체안에는
		 * person 정보만있기 때문에 기능이 제한된다.
		 */
		
		
		Student s2 = (Student)ps1; // 강제 타입 변환 
		
		// Student s3 = (Student)p1; error
		
		Person p2 = new PartTimeStudent();
		
		Student s3 = (Student)p2;
		
		PartTimeStudent pp3 = (PartTimeStudent)p2;
		
		}

}
