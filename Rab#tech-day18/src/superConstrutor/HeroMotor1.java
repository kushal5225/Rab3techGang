package superConstrutor;

public class HeroMotor1  extends Motor1{
	String color;
	
	public HeroMotor1(String name,String color) {
		super();
		this.color=color;
		this.name=name;
	}
	
	
	public void show() {
		System.out.println("Name from Motor(Super class)="+name);
		System.out.println("color from sub class="+color);
		
	
	}

}
