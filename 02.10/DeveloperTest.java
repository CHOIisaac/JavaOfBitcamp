package jb03.part03;

public class DeveloperTest {

	public static void main(String[] args) {
		Developer developer = new Developer();
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
		
	}//end of main

}//end of class
