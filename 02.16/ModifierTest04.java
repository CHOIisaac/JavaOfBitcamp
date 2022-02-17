package jb05.part03;

////TopSecret.class가 중요한 클래스라면 제어자를 통해 상속할 수 없도록 했으며
//secterNo 를 readOnly를 명확히 함
//또한 중요한 클래스라면 객체 생성을 불가능하게 한다
//static method를 통해 인스턴스를 리턴할 수 있도록 한다
// 단 조건을 만족할 경우만 인스턴스를 return함 

final class TopSecret04{
	private final int secretNo = 7777;
	
	//접근 제어자를 통한 객체생성불가 private Constructor를 사용한 이유를 이해 
	private TopSecret04() {
	}
	
	//getter method
	public int getSecretNo(int pwd) {
		if(pwd==0) {
			return secretNo;
		}else {
			return 0;
		}
	}
	
	public static TopSecret04 getInstance(int managerNo) {
		if(managerNo == 1234) {
			return new TopSecret04();
		}else {
			return null;
		}
	}
}//end of class

public class ModifierTest04 {

	public static void main(String[] args) {
		//인스턴스 생성 불가로 static method를 통해 인스턴스를 return 받는다. 
		//또한 인스턴스를 리턴 받는 경우도 조건(managerNo)을 충족해야 함.
		
		TopSecret04 topSecret = TopSecret04.getInstance(1234);
		System.out.println(topSecret.getSecretNo(0));
		
	}

}
