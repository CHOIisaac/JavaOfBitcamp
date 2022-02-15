package jb04.part03;

public class Manager extends Employee {
	int salary;
	
	public Manager() {
		System.out.println("Manager의 default Constructor");
	}
	public Manager(String str) {
		super(str);
		System.out.println("Manager의 name을 받는 constructor");
	}
	public Manager(String str1, String str2) {
		this(str1);
		part=str2;
		System.out.println("Manager의 name, part을 받는 constructor");
	}
	public Manager(String str1, String str2, int i) {
		super(str1, str2);
		age=i;
		System.out.println("Manager의 name, part, age을 받는 constructor");
	}
	public Manager(String str1, String str2, int i, int j) {
		this(str1, str2, i);
		salary = j;
		System.out.println("Manager의 name, part, age, salary을 받는 constructor");
	}
	
	public void callSalary() {
		System.out.println("Manager의 기본급은 : "+salary());
	}
	
	public static void main(String[] args) {
		Manager m1 = new Manager("홍길동");
		System.out.println("\n");
		Manager m2 = new Manager("홍길동", "EJB");
		System.out.println("\n");
		Manager m3 = new Manager("홍길동", "EJB", 25);
		System.out.println("\n");
		Manager m4 = new Manager("홍길동", "EJB", 25, 300);
		System.out.println("\n");
		System.out.println("overriding된 salary호출 : "+m4.salary());
		
	}//end of main

}//end of class
