package coding0223;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileWriterTestFilter02 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = null;
		BufferedWriter bw = null;
		
//		Reader r = new InputStreamReader(System.in);
//		br = new BufferedReader(r);
		br = new BufferedReader(new InputStreamReader(System.in));
		
//		FileWriter fw = new FileWriter("test.txt");
//		bw = new BufferedWriter(fw);
		bw = new BufferedWriter(new FileWriter("test.txt"));
//		bw = new BufferedWriter(new FileWriter("text.txt",true));
		
		System.out.println("화일에 저장하실 글을 입력하세요.");
		while(true) {
			String str = br.readLine();
			if(str.equals("끝")) {
				break;
			}
			bw.write(str,0,str.length());
			bw.newLine();
		}
		
		bw.flush();
		
		bw.close();
		br.close();
		
	}//end of main

}//end of class
