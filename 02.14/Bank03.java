package jb04.part01;

public class Bank03 {
	
	int balance;
	int money;
	int command;
	String bankName;
	String userName;
	
	public Bank03() {
	}
	public Bank03(String[] str) {
		validate(str);
		initialize(str);
		work();
		displayMoney();
	}
	//인자값을 검증하는 메서드 
	public void validate(String args[]) {
		if(!(args.length==2||args.length==4)) {
			System.out.println("[usage]:: java Bank [customerName][bankName][option][money]");
			System.out.println("[usage]:: 인자값이 최소 2개가 필요합니다.");
			System.exit(0);
		}
		if(args.length != 2 && Integer.parseInt(args[2]) != 1 && Integer.parseInt(args[2]) != 2) {
				System.out.println("[usage]:: java Bank03 [customerName][bankName][option][money]");
				System.out.println("[usage]:: option을 확인하세요 :: 1 => 입금, 2 => 출금");
				System.exit(0);
				
			}
		}
	//Field초기화 메서드 
	public void initialize(String[] value) {
		userName = value[0];
		bankName = value[1];
		if(value.length == 4) {
			command = Integer.parseInt(value[2]);
			money = Integer.parseInt(value[3]);
		}
		System.out.println(userName+"님의 주거래은행은 "+bankName+"입니다.");
	}
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

	public static void main(String[] args) {
		new Bank03(args);
	}//end of main

}//end of class
