package jb04.part03;

//상속(일반화관계)과 생성자와의 관계
//생성자를 명시적으로 호줄하는 this(), super()method 이해 
public class Employee {
		String part, name;
		int age, baseSalary;
		
		public Employee() {
			System.out.println("Emp의 default Constructor");
		}
		public Employee(String str) {
			name=str;
			System.out.println("EMP의 name을 받는 constructor");
		}
		public Employee(String str1, String str2) {
			this(str1);
			part=str2;
			System.out.println("EMP의 name, part을 받는 constructor");
		}
		public Employee(String str1, String str2, int i) {
			this(str1, str2);
			age = i;
			System.out.println("EMP의 name, part, age을 받는 constructor");
		}
		
		public int salary() {
			System.out.println("EMP의 salary() method");
			baseSalary = 100;
			return baseSalary;
		}
}//end of salary
