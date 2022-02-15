package jb04.part01;

//입력 받은 인자의 값에 따라 주거래 은행, 입금행위를 수행하는 Application 

public class Bank02 {

	int balance;
	int money;
	int command;
	String bankName;
	String userName;
	
	//Constructor
	public Bank02() {
	}
	public Bank02(String[] str) {
		userName = str[0];
		bankName = str[1];
		command = Integer.parseInt(str[2]);
		money = Integer.parseInt(str[3]);
	}
	
	//method
	//옵션(0 입력하면 입금, 1입력하면 출금)
	public void work() {
		if(command==0) {
			deposit();
		}else if(command==1) {
			withdraw();
		}
	}
	//입금하기 
	public void deposit() {
		balance += money;
		System.out.println(money+"원 입금함");
	}
	//출금하기 
	public void withdraw() {
		balance -= money;
		System.out.println(money+"원 출금함");
	}
	//현재의 금액을 display하는 method 
	public void displayMoney() {
		System.out.println("현재 잔고는 : "+balance+"입니다");
	}
	//getter/setter method 생략 
	
	public static void main(String[] args) {
		//입력 data 유효성 체크 
		if(!(args.length==2||args.length==4)) {
			System.out.println("[usage]:: java Bank [customerName][bankName][option][money]");
			System.out.println("[usage]:: 인자값이 최소 2개가 필요합니다.");
			System.exit(0);
		}
		System.out.println(args[0]+"님의 주거래은행은 "+args[1]+"입니다.");
		Bank02 b = new Bank02();
		
		if(args.length != 2) {
			int command = Integer.parseInt(args[2]);
			
			if(command != 1 && command != 2 ) {
				System.out.println("[usage]:: java Bank [customerName][bankName][option][money]");
				System.out.println("[usage]:: option을 확인하세요 :: 1 => 입금, 2 => 출금");
				return;
			}
			//String array 인자를 받는 생성자를 이용한 인스턴스 생
			b = new Bank02(args);
			
			//입금, 출금을 판단 각가의 method를 호출하는 method 호출
			b.work();
		}
		b.displayMoney();
	}//end of main

}//end of class
