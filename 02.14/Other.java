package jb04.part07;

public class Other {
	String name = "홍길동";
	String job = new String("개발자");
	
	Father owner = new Father();
	
	public Other() {
		System.out.println(this.owner.name);
		System.out.println(owner.bank);
		System.out.println(owner.branch);
//		System.out.println(f.password);
		
		//==> Field(상태정보)는 method를 이용 접근
		System.out.println("은행 비밀번호 : "+ this.owner.getPassword(0));
	}
	
}//end of class
