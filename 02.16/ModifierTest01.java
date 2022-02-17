package jb05.part03;

//modifierTest01, ModifierTest02, ModifierTest03, ModifierTest04를 통해 class 구현시
//modifier/access modifier 어떻게 활용, 응용 되는지 살펴보면 
//TopSecret01.class를 Access Modifier, Modifier로 어떻게 변경시키는지를 이해 
class TopSecret01{
	
	int secretNo = 7777;
	
	public TopSecret01() {
	}
	
	public int getSecretNo() {
		return secretNo;
	}
}//end of class

public class ModifierTest01 {

	public static void main(String[] args) {
		TopSecret01 topSecret = new TopSecret01();
		System.out.println(topSecret.secretNo);
		
		topSecret.secretNo = 1234;
		System.out.println(topSecret.getSecretNo());
	}//end of main

}//end of class

//TopSecret.class의 문제점 
//secretNo는 중요한 attributed이다 그러나 누구나 접근 및 변경이 가능 