package Construstor.Demo;

public class MainDog {
	

	
		
		public static void main(String[] args) {
			Dog1 d=new Dog1();
			System.out.println("--------------");
			System.out.println(d.name); 
			System.out.println(d.eye); 
			System.out.println(d.tail);  
			System.out.println(d.color);  
			d.run(); 
			
			System.out.println("----------------");
			Dog1 dg=new Dog1("Jocky",54,21,"Brown");
			System.out.println(dg.name);  
			System.out.println(dg.eye);  
			System.out.println(dg.tail);  
			System.out.println(dg.color); 
			d.bark();
		
		}

	

	}


