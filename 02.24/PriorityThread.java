package jp04.part02;

public class PriorityThread extends Thread{
	private String name;
	
	public PriorityThread() {
	}
	public PriorityThread(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println(name + "출력");
		}
	}
	
	public String getThreadName() {
		return name;
	}
	
	public static void main(String[] args) {
		
		PriorityThread p1, p2, p3;
		
		p1 = new PriorityThread("1.우선순위 MAX");
		p2 = new PriorityThread("2.우선순위 NORM");
		p3 = new PriorityThread("3.우선순위 MIN");
		
		p1.setPriority(Thread.MAX_PRIORITY);
//		p1.setPriority(8);
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("::Main Thread 1EA + Thread 3EA");
		
		System.out.println("::"+p1.getThreadName()+" thread의 우선 순위 : "+p1.getPriority());
		System.out.println("::"+p2.getThreadName()+" thread의 우선 순위 : "+p2.getPriority());
		System.out.println("::"+p3.getThreadName()+" thread의 우선 순위 : "+p3.getPriority());
		
		
	}

}
