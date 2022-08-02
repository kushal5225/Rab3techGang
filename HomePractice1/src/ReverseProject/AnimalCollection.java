package ReverseProject;

import java.util.Objects;

public class AnimalCollection  implements Comparable<AnimalCollection> {
 int age;
 String name;
 
 
public AnimalCollection() {
	super();
	// TODO Auto-generated constructor stub
}


public AnimalCollection(int age, String name) {
	super();
	this.age = age;
	this.name = name;
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


@Override
public String toString() {
	return "AnimalCollection [age=" + age + ", name=" + name + "]";
}


@Override
public int hashCode() {
	return Objects.hash(age, name);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AnimalCollection other = (AnimalCollection) obj;
	return age == other.age && Objects.equals(name, other.name);
}


@Override
public int compareTo(AnimalCollection o) {
	// TODO Auto-generated method stub
	return 0;
}

}
