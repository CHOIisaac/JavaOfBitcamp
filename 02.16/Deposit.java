package jb05.part08;

//금융업무를 하는 곳이라면 입금업무는 필수 기능
//은행, 금고, 증권 등 어느 곳이나 공통된 업무인 입금 업부를 interface정의
public interface Deposit {
	String deopsit = "입금";
	
	void deposit(int money);
}// end of class
