package coding0223;

import java.io.Serializable;

public class UserVO implements Serializable{
	
	private int no;
	private String name;
	
	public UserVO(){
	}
	public UserVO(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public void seNo(int no) {
		this.no = no;	
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserVO [no=");
		builder.append(no);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}//end of class
