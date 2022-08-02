
public class HashCOdeDemo1 {
public static void main(String[] args) {
		
		String str="kushal";
		String str1="Ram";
		System.out.println(str.hashCode()+ "  "+str1.hashCode());

		System.out.println("-----------------------------------");
		
		String str2=new String("Ram");
		System.out.println(str1.hashCode()+ "  "+str2.hashCode());
		System.out.println(str1.equals(str2));
		
	
	}

}
