package coding0223;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class WriterTest {

	public static void main(String[] args) {
		
		try {
			InputStream inputStream = System.in;
			Reader reader = new InputStreamReader(inputStream);
			
			OutputStream outputStream = System.out;
			
			Writer writer = new OutputStreamWriter(outputStream);
			
			System.out.println("입력을 기다립니다........");
			
			while(true) {
				
				int i = reader.read();
				writer.write(i);
				writer.flush();
				
				if((char)i=='x') {
					break;
				}
			}
			reader.close();
			writer.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}//end of main

}//end of class
