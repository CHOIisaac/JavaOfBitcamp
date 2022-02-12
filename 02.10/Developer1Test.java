package jb03.part05;

public class Developer1Test {

	public static void main(String[] args) {
		Developer1 developer = new Developer1();
			System.out.println("이름 : "+developer.name);
			System.out.println("직업 : "+developer.job);
			System.out.println("평균수입은 : "+developer.avgIncome);
			System.out.println("PJT경력은 : "+developer.projectCareer);
			
			System.out.println("=======================");
			
			//project에 참여 
			developer.participateProject();
			System.out.println();
			System.out.println("평균수입은 : "+developer.avgIncome);
			System.out.println("PJT참여 경력은 : "+developer.projectCareer);
			
			System.out.println("=======================");
			
			//1개 과목은 강의
			developer.instruct();
			System.out.println();
			System.out.println("평균수입은 : "+developer.avgIncome);
			
			//=======================추가된 부분=============================
			System.out.println("=======================");
			//홍길동이 한미은행에 project참여
			String projectName = "한미은행";
			developer.participateProject(projectName);
//			hong1.participateProject("한미은행");
			System.out.println("평균 수입은 : "+developer.avgIncome);
			System.out.println("project참여 경력은 :"+developer.projectCareer);
			
			System.out.println("=======================");
			
			//홍길동이 2개 과목을 강의
			int lectureCount =2;
			developer.instruct(lectureCount);
			//hong1.instruct(2);
			System.out.println("평균 수입은 :"+developer.avgIncome);
	}//end of main

}//end of class
