package jb05.part07;

import javax.sound.sampled.AudioFileFormat;

/*
 * <<<<interface>>>>
 * :abstract method집합(기능만 정의한 class/pure abstract class)
 *  기능(method)만 정의 하위클래스에서 O/R강제
 * :인스턴스 생성불가(추상클래스는 인스턴스 생성불가와 같은 의미)
 * SPEC.은 사영방법을 정의한 것이며
 * 실질적 사용은 SPEC.을 구현한 구현체(하위 객체)를 사용 
 */

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

//charge()를 정의한 interface
// => 기능의 정의(기능만 도출하여 정의한다면) : 지하철, 항공, 택시, 요금에도 사용가능
interface Fee{
	public void charge();
}//end of class

//interface구현시 abstract method 필히 재정의(overRiding)해야함 <== 강제성 
class Student extends Buscharge implements Fee{
	public Student() {
		super("학생");
	}
	public void charge() {
		System.out.println("300원");
	}
}//end of class

//interface구현시 abstract method 필히 재정의(overRiding)해야함 <== 강제성 
class Adult extends Buscharge implements Fee{
	public Adult() {
		super("일반인");
	}
	public void charge() {
		System.out.println("500원");
	}
}//end of class

//interface구현시 abstract method 필히 재정의(overRiding)해야함 <== 강제성 

class Old extends Buscharge implements Fee{
	public Old() {
		super("어르신");
	}
	public void charge() {
		System.out.println("::공짜\n");
	}
}//end of class

public class Display {

	public static void main(String[] args) {
		//<<구현 1 >> 아래의 구현은 문제 없이 출력된다.
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
		
		//<<구현 2 >> 아래의 구현에서 문제발생 컴파일 에러 
		// 하나 : 문제가 발생한 이유
		// 둘 : 문제를 해결하여 출력이 될 수 있도록 수정하기 
		// => 힌트 : CastingComplete.java의 세번째를 이해하자 / casting연산자를 사용한 이유는? 
//		Fee[] fee = new Fee[3];
//		fee[0] = new Student();
//		fee[1] = new Adult();
//		fee[2] = new Old();
//		
//		for(int i = 0; i < fee.length; i++) {
//			fee[i].information();
//			System.out.print(fee[i].section);
//			fee[i].charge();
//		}
	}//end of main
}// end of class
