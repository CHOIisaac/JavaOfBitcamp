package jb04.part05;

public class Manager extends Employee {
	int salary;
	
	public Manager() {
		System.out.println("Manager의 default Constructor");
	}
	public Manager(String name) {
		super(name);
		System.out.println("Manager의 name을 받는 constructor");
	}
	public Manager(String name, String part) {
		this(name);
		part=part;
		System.out.println("Manager의 name, part을 받는 constructor");
	}
	public Manager(String name, String part, int age) {
		super(name, part);
		this.age=age;
		System.out.println("Manager의 name, part, age을 받는 constructor");
	}
	public Manager(String name, String part, int age, int salary) {
		super(name, part, age);
		this.salary=salary;
		System.out.println("Manager의 name, part, age, salary을 받는 constructor");
	}
	
	public int salary() {
		System.out.println("Manager의 salary method");
		baseSalary = 200;
		return baseSalary;
	}
	
	public void callSalary() {
		System.out.println("Employee의 기본급은 : "+super.salary());
		System.out.println("Manager의 기본급은1 : "+this.salary());
		System.out.println("Manager의 기본급은2 : "+salary());
	}
	
	public static void main(String[] args) {
//		Manager m1 = new Manager("홍길동");
//		Manager m2 = new Manager("홍길동", "EJB");
//		Manager m3 = new Manager("홍길동", "EJB", 25);
		Manager m4 = new Manager("홍길동", "EJB", 25, 300);
		System.out.println("\n");
		System.out.println("overriding된 salary호출 : "+m4.salary());
		m4.callSalary();
	}//end of main

}//end of class
