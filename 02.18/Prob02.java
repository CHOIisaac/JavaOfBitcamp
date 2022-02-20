package Test0218;

class Student{
	private String name;
	private int age;
	private int id;
	
	public Student() {
	}	
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public void print() {
		System.out.println("이름 : "+getName()+"\t나이 : "+getAge()+" \t학번 : "+getId());
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	
//	public static Student getInstance() {
//		return new Student();
//	}
	
}//end of class

class Teacher{
	private String name;
	private int age;
	private String subject;
	
	public Teacher() {
	}
	public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	public void print() {
		System.out.println("이름 : "+getName()+"\t나이 : "+getAge()+" \t담당과목 : "+getSubject());
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getSubject() {
		return subject;
	}
	
	
}//end of class

class Employee{
	private String name;
	private int age;
	private String dept;
	
	public Employee() {
	}
	public Employee(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	
	public void print() {
		System.out.println("이름 : "+getName()+"\t나이 : "+getAge()+" \t부서 : "+getDept());
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDept() {
		return dept;
	}
	
}//end of class

public class Prob02 {

	public static void main(String[] args) {
//		Student s = Student.getInstance();
		Student s = new Student("홍길동", 20, 200201);
		Teacher t = new Teacher("이순신", 30, "JAVA");
		Employee e = new Employee("유관순", 40, "교무과");

		s.print();
		t.print();
		e.print();
	}//end of main

}//end of class
