package jb03.part03;

public class Developer {

		// field 특성, 속성 표현
		String name = "홍길동";
		String job = "개발자";
		int avgIncome = 100;
		int projectCareer;
		
		//method 기능, 행위 표현
		public void participateProject() {
			System.out.println("프로그램개발로 수입증가, 경력쌓음");
			avgIncome++;
			projectCareer++;
		}
		
		public void instruct() {
			System.out.println("강의를 통한 수입 증가");
			avgIncome++;
		}

}//end of calss
