package jb05.part06;

//Primitive type 형변환(묵시적/명시적) : data 크기
//Referance type 형변환(묵시적/명시적) : 개념의 크기 (추상화정도)
//  : 중요 : 객체의 형변환 조건 : ~ is a ~ Relationship

//상위 클래스 Super 정의 
class Super{
	public void a() {
		System.out.println("Suepr:a()");
	}
}//end of class

//상위 class Suepr를 상속 받는 하위 class sub 정의 
class Sub extends Super{
	public void a() {
		System.out.println("overriding된 Sub : a()");
	}
	public void b() {
		System.out.println("Sub : b()");
	}
}//end of class

public class CastingComplete {

	public static void main(String[] args) {
		//하나 : 상위클래스 인스턴스 생성(data type == 인스턴스의 경우)
		System.out.println("\n여기는 Super s1 =new Super() 부분");
		Super s1 = new Super();
		s1.a();
		
		//둘 : 하위클래스 인스턴스 생성(data type == 인스턴스의 경우)
		System.out.println("\n여기는 Super s2 =new Super() 부분");
		Sub s2 = new Sub();
		s2.a();
		s2.b();
		
		//셋 : 상위 data type으로 하 인스턴스 생성(data type != 인스턴스)
		System.out.println("\n여기는 Super s3 =new Super() 부분");
		Super s3 = new Super();
		s3.a();
		//아래의 사항은 에러가 발생한다. s3은 b()를 참조할 수 없다. 이해하기 
//		s3.b();
		//s3.a() 를 사용하려면 => casting연산자 사용(즉 자신의 원상태복귀)
		System.out.println("\n s3는 b()에 접근 불가하다.");
		System.out.println("casting연산자를 이용 Sub sub = (Sub)s3 명시적 형변환");
		Sub sub = (Sub)s3; //명시적 형변환 
		sub.b();
		
		//넷 : 하위 data type으로 상위클래스 인스턴스 생성(data type != 인스턴스)
		//에러 부위(하위레퍼런스변수는 상위인스턴스를 레퍼런스할 수 없다. )
//		Sub s4 = new Super();
	}

}
