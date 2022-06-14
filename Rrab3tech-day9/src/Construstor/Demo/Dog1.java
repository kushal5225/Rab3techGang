/**
 * 
 */
package Construstor.Demo;

/**
 * @author kushalshrestha
 *
 */
public class Dog1 {

	String name =" Rocko";
	int eye= 2;
	int tail=1;
	String color="blue";
	
 public Dog1() {
	 
 }
 public Dog1(String n) {
	 name=n;
 }
 public Dog1(String n, int e) {
	 name=n;
	 eye=e;
 }
 
 public Dog1(String n, int e, int t) {
	 name=n;
	 eye=e;
		tail=t;
	 
 }
 
 public Dog1(String n, int e,int t,String c) {
		name=n;
		eye=e;
		tail=t;
		color=c;
	 
	 }
 public void run() {
		System.out.println("Dog can run"); 
		 
	 }
	
	 public void bark() {
		 System.out.println("Dog can Bark"); 
		 
	 }
  
	
}
