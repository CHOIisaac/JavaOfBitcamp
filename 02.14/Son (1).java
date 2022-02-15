package jb04.part07;

//son은 father와 같은 pakage에 존재하며 상속관계이다.
//주석을 풀고 컴파일시 에러를 확인하고 에러의 의미를 이해하기
//각 access modifier의 접근 범위를 확인
public class Son extends Father {
	
	public Son() {
		System.out.println(this.name);
		System.out.println(bank);
		System.out.println(branch);
//		System.out.println(password);
		
		//field(상태정보)는 method(행위)를 이용 접근
		System.out.println("은행 비밀번호 : "+this.getPassword(0));
	}

}//end of class
//private를 사용하여 다른 class들로 부터 상태정보은닉 
//method를 통해 정보은닉 여부를 제어 
