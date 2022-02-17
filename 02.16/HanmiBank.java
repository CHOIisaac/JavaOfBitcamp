package jb05.part08;

public class HanmiBank extends Bank implements Deposit,PayOut {

	public HanmiBank() {
	}
	public HanmiBank(String name) {
		super(name);
	}
	
	public void display() {
		System.out.println("은행명 : "+ this.getName());
	}
	public void deposit(int money) {
		System.out.println(money+"를 입금합니다.");
	}
	public void payOut(int money) {
		System.out.println(money+"를 출금합니다.");
	}
	
	public static void main(String[] args) {
		HanmiBank hb = new HanmiBank("한미은행");
		hb.display();
		hb.deposit(100);
		hb.payOut(200);
		
		//=> interface 내부의 선언된 field의 의미를 이해하자 
		System.out.println(Deposit.deopsit);
		System.out.println(hb.payOut);
		
//		Deposit.deopsit = "입금";
//		PayOut.payOut = "출금";
		//컴파일 에러 발생 interface에 선언되는 변수는 final static 의 특징을 갖음 
		
	}//end of main
}//end of class
