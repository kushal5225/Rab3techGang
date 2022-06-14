package MethodOverloading;

public class Fruit {
  public void sweet() {
	  System.out.println("They are sweet");
}
  public void sweet(int x) { // it is method overiding because its signature is different and it has parameter which int x.
	  System.out.println("They are  very sweet");
}
  public float sweet(int x, int y) { // it is method overiding because its signature is different and it has parameter which int x.
	  System.out.println("They are  not sweet");
	  return 2.5f;
}
 
}