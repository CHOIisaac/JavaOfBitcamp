package jb04.part02;

public class Iam extends Human {
	//field
	String job;
	
	//Constructor
	public Iam() {
		System.out.println("Iam class default Constructor");
	}
	
	//Method
	//setter method
	public void setJob(String str) {
		job =str;
	}
	//getter method
	public String getJob() {
		return job;
	}
	
	public static void main(String[] args) {
		//1.아래의 인스턴스 생성시 출력결과물을 확인, 이해하고
		//2.OOP의 일반화 관계인 공유(속성, 행위)를 OOPL애서 어떻게 지원하는지를 이해할 것
		//3.아래의 주석을 풀고 속성, 행위의 공유를 확인한다 
		Iam iam = new Iam();
		
		
		iam.setName("홍길동");
		iam.setAge(100);
		iam.setJob("개발자");
		
		System.out.println("이름 : "+iam.getName());
		System.out.println("나이 : "+iam.getAge());
		System.out.println("직업 : "+iam.getJob());
		  
		  
		 
	}

}
