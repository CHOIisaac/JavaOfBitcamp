package Test0218;

import java.util.Scanner;

public class FactorialUtil {
	int sum = 1;
	
	public int factorial(int n) {
		if( n <= 0 ) {
			System.out.println("0보다 큰 수를 입력하세요.");
			System.exit(0);
		}
		if(n ==1) {
			return 1;
		}
		return n * (factorial(n-1));
		
}//end of class

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
//		int input = keyboard.nextInt();
		System.out.print("입력 값 :");
		
		FactorialUtil util = new FactorialUtil();
		
		System.out.println("Result= "+util.factorial(keyboard.nextInt()));
	}//end of main

}//end of class
