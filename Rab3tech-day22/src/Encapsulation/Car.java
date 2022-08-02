package Encapsulation;

public class Car {
	private int price;  
	private String model; 
	private String color; 
	
	

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Car(int price, String model, String color) {
		super();
		this.price = price;
		this.model = model;
		this.color = color;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public String toString() {
		return "Car [price=" + price + ", model=" + model + ", color=" + color + "]";
	}



	public static void main(String[] args) {
		Car c1=new Car();
		System.out.println(c1.getPrice());
		System.out.println(c1.getModel());
		System.out.println(c1.getColor());
		
	System.out.println(c1);  
	
	
	
	
	
	
	
	
	Car c2=new Car(10000,"Tesla","Black");
		System.out.println(c2.getPrice());  
		System.out.println(c2.getModel()); 
		System.out.println(c2.getColor()); 
	
	System.out.println(c2);
	
	
	}

}
