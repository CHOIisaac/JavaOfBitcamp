package jb05.part03;

//TopSecret.class가 중요한 클래스라면 제어자를 통해 상속할 수 없도록 했으며
//secterNo 를 readOnly를 명확히 함
// 또한 중요한 클래스라면 객체 생성을 불가능하게 한다
// static method를 통해 인스턴스를 리턴할 수 있도록 한다
final class TopSecret03{
	private final int secretNo = 7777;
	
	private TopSecret03() {
	}
	
	//getter method
	public int getSecretNo(int pwd) {
		if(pwd==0) {
			return secretNo;
		}else {
			return 0;
		}
	}
	
	public static TopSecret03 getInstance() {
//		TopSecret03 topSecret = new TopSecret03();
//		return topSecret;
		return new TopSecret03();
	}
}//end of class

public class ModifierTest03 {

	public static void main(String[] args) {
		//생성자가 private로 instance생성 (생성자 호출) 불가능 
		//TopSecret topSecret = new TopSecret();
		
		//instance 생성을 불가로 static method를 통해 객체를 return 받는다 
		TopSecret03 topSecret = TopSecret03.getInstance();
		System.out.println(topSecret.getSecretNo(0));
		
	}

}
