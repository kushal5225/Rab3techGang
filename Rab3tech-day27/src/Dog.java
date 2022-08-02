import java.util.Objects;

public class Dog implements Comparable <Dog>{
int age;
String name;
String color;
public Dog() {
	super();
	// TODO Auto-generated constructor stub
}
public Dog(int age, String name, String color) {
	super();
	this.age = age;
	this.name = name;
	this.color = color;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "Dog [age=" + age + ", name=" + name + ", color=" + color + "]";
}
@Override
public int compareTo(Dog o) {
	int x=o.age-this.age;
	
	return x;
}
@Override
public int hashCode() {
	return Objects.hash(age, color, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Dog other = (Dog) obj;
	return age == other.age && Objects.equals(color, other.color) && Objects.equals(name, other.name);
}

 
}











