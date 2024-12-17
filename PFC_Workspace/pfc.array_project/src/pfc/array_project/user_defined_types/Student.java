package pfc.array_project.user_defined_types;

public class Student {
	private int id;
	private String name;
	private int age;
	
	public Student() {
		
	}
	public Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "ID:"+this.id+" Name:"+this.name+" Age:"+this.age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
