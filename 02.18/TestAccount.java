package Test0218;


class Account {
	String accNo = "";
	int balance = 0;
	
	public Account() {
	}
	public Account(String str) {
		accNo = str;
		System.out.println(accNo + " 계좌가 개설되었습니다.");
	}
	
	public int save(int money) {
		balance += money;
		System.out.println(accNo+" 계좌에 "+money+"만원이 입금되었습니다.");
		return balance;
	}
	public int deposit(int money) {
		balance -= money;
		System.out.println(accNo+" 계좌에 "+money+"만원이 출금되었습니다.");
		return balance;
	}
	
	public int getBalance() {
		return balance;
	}
	public String getAccNo() {
		return accNo;
	}
	
}//end of class

public class TestAccount {

	public static void main(String[] args) {
		String accNo = null;
		int balance = 0;
		
		Account accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo+" 계좌의 잔고는 "+balance+"만원입니다.");
		
		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accNo+" 계좌의 잔고는 "+balance+"만원입니다.");
		
		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo+" 계좌의 잔고는 "+balance+"만원입니다.");
		
	}//end of main
}//end of class
