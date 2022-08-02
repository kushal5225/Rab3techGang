package SuperKeyword;

public class SubHelloClass extends HelloVarSuper {
String name="Nitesh";
	
	public void show() {
		System.out.println("Name=="+name);
		System.out.println("this.Name=="+this.name);
		System.out.println("Color=="+color);
		System.out.println("this.Color=="+this.color);
		System.out.println("super.name=="+super.name);
		super.show();
		
	}
}

