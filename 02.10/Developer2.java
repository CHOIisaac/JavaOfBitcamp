package jb03.part06;

public class Developer2 {

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
		//========================추가된 method (overLoadingMethod)=======================
		//1.income에 1 증가
		//2.projectCareer를 1증가
		public void participateProject(String project) {
			System.out.println(project+"==> project참여로 수입증가, 경력 쌓음");
			avgIncome++;
			projectCareer++;
		}
		
		public void instruct() {
			System.out.println("강의를 통한 수입 증가");
			avgIncome++;
		}
		
		//========================추가된 method (overLoadingMethod)=======================
		//강의를 통해 수입 증가 
		//1. 강의 수에 따라 income 증가 
		
		public void instruct(int lectureCount) {
			System.out.println(lectureCount+"개 강의를 통한 수입 증가");
			avgIncome += lectureCount;
		}
		
		//////////////////////////추가된 부분 /////////////////////////////
		/*
		 * 상태값을 return하는 행위(getter method)를 정의 
		 * ==> 객체의 모든 정보는 encapsulation되어 있으며,
		 * ==> 행위를 통해 Encapsulation되어 있는 상태값에 접근할 수 있다.
		 */
		public String getName() {
			System.out.println("getName() method");
			return name;
		}
		public String getJob() {
			System.out.println("getJob() method");
			return job;
		}
		public int getAvgIncome() {
			System.out.println("getAvgIncome() method");
			return avgIncome;
		}
		public int getProjectCareer() {
			System.out.println("getProject() method");
			return projectCareer;
		}

}//end of calss
