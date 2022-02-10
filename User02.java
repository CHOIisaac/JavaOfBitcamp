package jb03.part08;

/*
 * Constructor의 이해
 * 1. 인스턴스 생성시 new A()의 의미의 이해
 * 2. new와 같이 사용되는 특수한 행위를 하는 method 이해
 * 3. Constructor 주 작업, 용도는?
 * 
 * 생성자는 인스턴스 생성시 호출된다
 * 주 작업은 field variable 초기화 작업(상태값 설정)
 * 생성시 상태를 갖는 인스턴스 생성
 */

public class User02 {
	
	String name;
	int javaLevel;
	
	// default constructor
	// 클래스 이름과 같다. return type이 없다
	public User02() {
		System.out.println("Constructor Method");
		name = "홍길동";
		javaLevel = 0;
	}
	//getter mathod 정의 
	public String getName() {
		return name;
	}
	public int getJavaLevel() {
		return javaLevel;
	}
	
	// main method
	public static void main(String[] args) {
		System.out.println("===================");
		User02 user = new User02();
		System.out.println("===================");
		//출력 결과 확인 후 아래 주석 풀고 다시 확인 
//		System.out.println("===================");
//		User01 user01;
//		System.out.println("===================");
//		user = new User01();
//		System.out.println("===================");
//		new User01();
//		System.out.println("===================");
		
		System.out.println("name : "+user.getName());
		System.out.println("javaLevel : "+user.getJavaLevel());
		
	}//end of main
}//end of class
