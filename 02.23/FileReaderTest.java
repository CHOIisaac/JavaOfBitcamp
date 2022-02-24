package coding0223;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fr = null;
		int readCount = 0;
		
		try {
			fr=new FileReader(args[0]);
			
			while(true) {
				int i = fr.read();
				
				if(i==-1) {
					break;
				}
				char c = (char)i;
				System.out.println(c);
				
				readCount++;
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}finally {
			System.out.println("\n\n=========================================");
			System.out.println("=========>>> read횟수 readCount: "+readCount);
			System.out.println("===========================================");
			try {
				fr.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}//end of main

}//end of class
