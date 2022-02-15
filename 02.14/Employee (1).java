package jb04.part05;

//상속(일반화관계)과 생성자와의 관계
//생성자를 명시적으로 호줄하는 this(), super()method 이해 
//아래의 예제 실행을 통해 super(), this()/super, this 역할 및 의미 이해
public class Employee {
		String part, name;
		int age, baseSalary;
		
		public Employee() {
			System.out.println("Emp의 default Constructor");
		}
		public Employee(String name) {
			this.name = name;
			System.out.println("EMP의 name을 받는 constructor");
		}
		public Employee(String name, String part) {
			this(name);
			this.part=part;
			System.out.println("EMP의 name, part을 받는 constructor");
		}
		public Employee(String name, String part, int age) {
			this(name, part);
			this.age=age;
			System.out.println("EMP의 name, part, age을 받는 constructor");
		}
		
		public int salary() {
			System.out.println("EMP의 salary() method");
			baseSalary = 100;
			return baseSalary;
		}
}//end of salary
