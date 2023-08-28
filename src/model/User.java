package model; 

public class User {

	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String toString(){
		return "name: " + this.name + " age: " + this.age;
	}

	public String run(){
		return "I'm running ...";
	}

}
