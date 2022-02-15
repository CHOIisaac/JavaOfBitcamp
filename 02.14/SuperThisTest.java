package jb04.part05;

//상위의 method, field 호출할 수 있는 예약어(keyword) super
//하위의 method, field 호출할 수 있는 예약어(keyword) this
class JuniorHighSchool{
	String name = "대한민국중학교";
	
	public JuniorHighSchool() {
	}
	public void schoolName() {
		System.out.println("중학교 이름 : "+name);
	}
}//end of class

class HighSchhol extends JuniorHighSchool {
	String name = "대한민국고등학교";
	
	public HighSchhol() {
	}
	public HighSchhol(String str) {
		name = str;
	}
	//위의 생성자와 아레의 생성자를 readability측면에서 살펴보면...
//	public HighSchool(String name){
//		this.name = name;
//	}

	public void schoolName() {
		System.out.println("중학교 이름 : "+super.name);
		System.out.println("고등학교 이름 : "+this.name);
		System.out.println("고등학교 이름 : "+name);
	}
}//end of class
public class SuperThisTest {

	public static void main(String[] args) {
		HighSchhol hs01 = new HighSchhol();
		hs01.schoolName();
		System.out.println("=================================");
		
		HighSchhol hs02 = new HighSchhol("서울고등학교");
		hs02.schoolName();
	}

}
