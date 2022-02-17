package jb05.part03;

//access modifier를 통한 information hiding과 method를 통한 접근 
class TopSecret02{
	
	private int secretNo = 7777;
	
	public TopSecret02() {
	}
	
	//getter method
	public int getSecretNo(int pwd) {
		if(pwd==0) {
			return secretNo;
		}else {
			return 0;
		}
	}
}//end of class

public class ModifierTest02 {

	public static void main(String[] args) {
		
		TopSecret02 topSecret = new TopSecret02();
		//private Field는 information hiding되어 있어 접근 및 변경이 불가 
//		System.out.println(topSecret.secretNo);
//		topSecret.getSecretNo= 1234;
		
		System.out.println(topSecret.getSecretNo(0));
		
	}

}
