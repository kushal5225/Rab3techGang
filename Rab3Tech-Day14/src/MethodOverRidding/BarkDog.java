package MethodOverRidding;

public class BarkDog extends Dog {
	public void Bark() {// These are own its behaviour.
		 System.out.println(" Dog can Bark");
	}
	 public void run() {  // this is overridding because it is from parents class.
		 System.out.println( " Dog can run very very fast");
	 }
	 
	 public void weap() {  // These are own its behaviour.
		 System.out.println( " Dog can weap" );
	 }
}
