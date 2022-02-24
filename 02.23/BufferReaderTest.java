package coding0223;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderTest {

	public static void main(String[] args) throws Exception {
		int readCount = 0;
		
		FileReader fr = new FileReader(args[0]);
		BufferedReader br = new BufferedReader(fr);
		
//		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String oneLine = null;
		
		while(true) {
			readCount++;
			
			oneLine = br.readLine();
			if(oneLine==null) {
				break;
			}
			System.out.println("한줄출력 : "+readCount+""+oneLine);
		}
		
		br.close();
		fr.close();
	}//end of main

}//end of class
