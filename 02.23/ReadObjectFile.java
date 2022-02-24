package coding0223;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjectFile {

	public static void main(String[] args) throws Exception {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserInfo.obj"));
		UserVO user01 = (UserVO)ois.readObject();
		UserVO user02 = (UserVO)ois.readObject();
		
		System.out.println("1번째 회원정보 ::"+user01);
		System.out.println("2번째 회원정보 ::"+user02);
		
		ois.close();
		
	}//end of main

}//end of class
