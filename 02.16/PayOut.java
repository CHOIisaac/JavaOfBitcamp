package jb05.part08;

public interface PayOut {
	// interface field는 public static final 특성을 갖는다
	public final static String payOut = "출금";
	
	//interface method ==: public abstract 특성을 갖는다.
	public abstract void payOut(int money);
}//end of class
