
public final class HashCodeDemo2 {
public static void main(String[] args) {
		
		String str="Mohan";
		System.out.println(str.hashCode());
		
		Character ch='a';
		System.out.println(ch.hashCode());
		
		Character ch1='A';
		System.out.println(ch1.hashCode());
		
		Character ch2='B';
		System.out.println(ch2.hashCode());
		
		System.out.println("---------------------------");
		
		Integer i=1641292823;
		System.out.println(i.hashCode());
		System.out.println("----------------------------");
		
		Integer i2=16;
		System.out.println(i2.hashCode());

	}

}
