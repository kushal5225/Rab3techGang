package Interface;

public class Animal implements Dog, DogB {

	@Override
	public void sleep() {
		System.out.println("  My dog like to sleep a lot");
		
	}

	@Override
	public void eat() {
		System.out.println("  My dog love to eat chickens a lot");
		
	}

	@Override
	public void run() {
		System.out.println("  My dog run fast ");
	}

	@Override
	public void walk() {
		System.out.println("I always take my dog for walk in evening  ");
	}
	

}
