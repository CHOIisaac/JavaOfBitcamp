package Test0218;

class Human{
	private String name;
	private int age;
	
	public Human() {
	}
	
	public void print() {
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}//end of class

class Student1 extends Human{
	private int id;
	
	public Student1() {
	}	
	public Student1(String name, int age, int id) {
		super.setName(name);
		super.setAge(age);
		this.id = id;
	}
	
	public void print() {
		System.out.println("이름 : "+getName()+"\t나이 : "+getAge()+" \t학번 : "+getId());
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
}//end of class

class Teacher1 extends Human{
	private String name;
	private int age;
	private String subject;
	
	public Teacher1() {
	}
	public Teacher1(String name, int age, String subject) {
		super.setName(name);
		super.setAge(age);
		this.subject = subject;
	}
	
	public void print() {
		System.out.println("이름 : "+getName()+"\t나이 : "+getAge()+" \t담당과목 : "+getSubject());
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
}//end of class

class Employee1 extends Human {
	private String name;
	private int age;
	private String dept;
	
	public Employee1() {
	}
	public Employee1(String name, int age, String dept) {
		super.setName(name);
		super.setAge(age);
		this.dept = dept;
	}
	
	public void print() {
		System.out.println("이름 : "+getName()+"\t나이 : "+getAge()+" \t부서 : "+getDept());
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	
}//end of class

public class Prob02_1 {

	public static void main(String[] args) {
//		Student s = Student.getInstance();
		Student1 s = new Student1("홍길동", 20, 200201);
		Teacher1 t = new Teacher1("이순신", 30, "JAVA");
		Employee1 e = new Employee1("유관순", 40, "교무과");

		s.print();
		t.print();
		e.print();
	}//end of main

}//end of class
