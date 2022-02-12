package jb03.part06;


public class Developer2Test {

	public static void main(String[] args) {
		
		Developer2 developer = new Developer2();
		
		System.out.println("이름 : "+developer.name);
		System.out.println("직업 : "+developer.job);
		System.out.println("평균수입은 : "+developer.avgIncome);
		System.out.println("PJT경력은 : "+developer.projectCareer);
		
		System.out.println("=======================");
		
		//method를 호출하여 행위를 통해 상태값 받아 출력하면...
		String name = developer.getName();
		String job = developer.getJob();
		int avgIncome = developer.getAvgIncome();
		System.out.println("이름은 : "+name);
		System.out.println("직업은 : "+job);
		System.out.println("평균수입은 : "+avgIncome);
		//아래의 내용을 이해하자 
		System.out.println("평균수입은 : "+developer.getProjectCareer());
	}

}
