package Test0218;

public class Prob01 {
	
	public void calc(int[] ix) {
		int oddNum = 0;
		int evenNum = 0;
		for(int i = 0; i < ix.length; i++) {
			if(ix[i] % 2 == 1) {
			oddNum += ix[i];
			}
			if(ix[i] % 2 ==0 ) {
			evenNum += ix[i];
			}
		}
		System.out.println("홀수의 합 : "+oddNum);
		System.out.println("짝수의 합 : "+evenNum);
		
	}

	public static void main(String[] args) {
		int[] ia = new int[] {3,7,1,8,10,2,15,2,10};
		int[] ib = new int[] {1,2,3,4,5};
		
		Prob01 p = new Prob01();
		System.out.println("( 배열 ia )");
		p.calc(ia);
		System.out.println("( 배열 ib )");
		p.calc(ib);
	}

}
