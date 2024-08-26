package ex05;



public class MainAnimal {

	public static void main(String[] args) {
//		Animal an1 = new Cat();
//		Animal an2 = new Dog();
//		Animal an3 = new 진도개();
		
		
		speakTest(new Animal());
		speakTest(new Cat());
		speakTest(new Dog());
		speakTest(new 진도개());
	}
	
	
	static void speakTest(Animal an) {
		an.speak();
	}

}
