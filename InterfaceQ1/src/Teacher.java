
public  class Teacher implements Institute{

	public void Qualification() {
		System.out.println("I have bachelore degree");
	}
	
	public void Experiance() {
		System.out.println("I have 1 month of experiance in java");
	}

	@Override
	public void Branch() {
		// TODO Auto-generated method stub
		System.out.println("Hi how are you man");
	}
	

	@Override
	public void Result() {
		// TODO Auto-generated method stub
		System.out.println("Hi ----hello--");
	}
}
