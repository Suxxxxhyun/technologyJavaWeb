package sec01.ex01;

import java.sql.Date;

public class MemberBean { //vo와 같음
	private String id; //memberbean은 속성 접근지정자가 private임
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
	
	public MemberBean() {
		
	} //bean은 인자없는 생성자를 반드시 지님
	
	public MemberBean(String id,String pwd, String name, String email) {
		this.id=id;
		this.pwd=pwd;
		this.name=name;
		this.email=email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
	
}

