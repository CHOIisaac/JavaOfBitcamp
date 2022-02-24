package coding0223;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterTestFilter01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		String fileName = "";
		String copyFileName = "";
		
		int readCount = 0;
		System.out.println("copy할 file이름을 입력하세요 : ");
		fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
		
		br = new BufferedReader(new FileReader(fileName));
		
		copyFileName = fileName+"_copy";
		
		bw = new BufferedWriter(new FileWriter(copyFileName));
		
		String source = null;
		while((source=br.readLine()) != null) {
			bw.write(source);
			readCount++;
		}
		bw.flush();
		
		bw.close();
		br.close();
		
		System.out.println("\n\n=========================================");
		System.out.println("=========>>> read횟수 readCount: "+readCount);
		System.out.println("===========================================");
		
	}//end of main

}//end of class
