package jb04.part07;

//Encapsulation(information hiding)을 지원하는 Access Modifier이해
//public / protected / default / private의 사용 및 이해
public class Father {
	public String name = "홍길동";
	protected String bank = "한양은행";
	String branch = "역삼동지점";
	private int password = 1234;
	
	public Father() {
	}
	
	//각각의 field(상태값) 아래의 method(행위)를 통해 접근이 가능
	//아래의 각각의 getter method의 의미를 이해
	
	public String getBank(int pwd) {
		if(pwd != 7777) {
			return "key값을 정확히 입력하세요.";
		}else {
			return this.bank;
		}
	}
	//은행비밀번호를 알기 위한 key를 알고 있으면 password를 return
	public int getPassword(int key) {
	if(key != 7777) {
		return 0;
	}else {
		return this.password;
	}
}
	public String getName() {
		return name;
	}
	public String getBranch() {
		return branch;
	}
}//end of class