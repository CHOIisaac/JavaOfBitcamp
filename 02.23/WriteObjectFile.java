package coding0223;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class WriteObjectFile {

	public static void main(String[] args)  throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));
		
		oos.writeObject(new UserVO(1, "홍길동"));
		oos.writeObject(new UserVO(2, "홍길순"));
		
		oos.close();
		
	}//end of main

}//end of class
