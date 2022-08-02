package SuperKeyword;

public class MahaJoker extends Joker {
	
	@Override
	public void dance() {
		System.out.println("Joker can dance in night only");
	}
	
	@Override
	public void haha() {
		System.out.println("Joker ");
	}
	public void hey() {
		dance();
		this.dance();
		super.dance();  
		haha();   
	}
}
