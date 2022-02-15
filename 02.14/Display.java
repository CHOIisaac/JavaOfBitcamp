package jb04.part04;

class Buscharge{
	String section;
	
	public Buscharge() {
	}
	public Buscharge(String str) {
		section =str;
	}
	
	public void information() {
		System.out.println("버스요금안내");
	}
	public void charge(){
		System.out.println("학생:300, 일반인:500, 어르신:공짜");
	}
}//end of class

class Student extends Buscharge{
	public Student() {
		super("학생");
	}
	public void charge() {
		System.out.println("::300원\n");
	}
}//end of class

class Adult extends Buscharge{
	public Adult() {
		super("일반인");
	}
	public void charge() {
		System.out.println("::500원\n");
	}
}//end of class

class Old extends Buscharge{
	public Old() {
		super("어르신");
	}
	public void charge() {
		System.out.println("::공짜\n");
	}
}//end of class

public class Display {

	public static void main(String[] args) {
		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();
		
		b1.information();
		System.out.println(b1.section);
		b1.charge(); //어떤 클래스의 method 호출되었는지 확인
		
		b2.information();
		System.out.println(b2.section);
		b2.charge(); //어떤 클래스의 method 호출되었는지 확인
		
		b3.information();
		System.out.println(b3.section);
		b3.charge(); //어떤 클래스의 method 호출되었는지 확인

	}//end of main
}// end of class
