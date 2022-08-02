package Array;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num[]=new int[10];
num[0]=5;
num[1]=10;
num[2]=20;
num[3]=30;
num[4]=40;
num[5]=50;
num[6]=60;
num[7]=70;
num[8]=80;
num[9]=90;
	
int sum=0;

for( int x = 0; x < num.length; x++) { 
	sum=sum+num[x];
 }
System.out.println("the sum of array: "+sum);

num[7]=240;
num[3]=400;

 
for(int a=0;a<num.length;a++) {
	System.out.println(num[a]);
 }
	

System.out.println("------after updation perform sum operation--------");
	
	System.out.println("sum operation on given array");
	int sum1=0;
	for(int x=0;x<num.length;x++ ) {
		sum1=sum1+num[x]; 
	
	}
	System.out.println("Total =="+sum1); 
	
	}
}