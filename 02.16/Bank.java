package jb05.part08;

//abstract class 는 interface와 달리 일반 공유 method와 field를 갖을 수 있다.
public abstract class Bank {
	private String name;
	
	public Bank() {
	}
	
	public Bank(String name) {
		this.name = name;
	}
	
	//method
	//은행명을 출력하는 display method를 추상 method로 정의 
	public abstract void display();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}//end of class
