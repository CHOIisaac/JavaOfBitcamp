package jb05.part04.test02;

//BusCharge.class의 charge()method 사용유무는??
//하위클래스(Student, Adult, Old)에서 charge()method가 OverRiding 않는다면?

//abstract method/ class 의 필요성 및 이해 
//abstract method
//구체적일 필요가 없는 method
//하위클래스에서 구체적으로 재정의 해야하는 강제성을 갖는 메서드
//abstract class
//구체적이지 않은 abstract method가 정의된 클래스
//일반화의 관계 중, 공통적, 일반적 행위와 속성을 공유를 목적으로 정의된 클래스
// *abstract class는 인스턴스를 생성할 수 없다. *************

abstract class Buscharge{
	String section;
	
	public Buscharge() {
	}
	public Buscharge(String section) {
		this.section = section;
	}
	
	public void information() {
		System.out.println("버스요금안내");
	}
//	public void charge(){
//		System.out.println("학생:300, 일반인:500, 어르신:공짜");
//	}
	public abstract void charge();
}//end of class


//abstract class 상속 시 abstract method 필히 재정의(overloading) 해야 함. <== 강제성 
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
		
		//추상클래스는 객체생성불가 
//		Buscharge bc01 = new Buscharge();
		
		//객체 생성은 불가하나 변수의 선언은 가능하다 
//		Buscharge bc02;

	}//end of main
}// end of class
