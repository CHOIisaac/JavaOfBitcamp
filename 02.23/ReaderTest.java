package coding0223;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderTest {

	public static void main(String[] args) {
		try {
			InputStream inputStream = System.in;
			Reader reader = new InputStreamReader(inputStream);
			
			System.out.println("입력을 기다립니다........");
			
			while(true) {
				
				int i = reader.read();
				char c = (char) i;
				
				System.out.println("입력하신 값 : "+c);
				
				if(c=='x') {
					inputStream.close();
					break;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}//end of main

}//end of class
