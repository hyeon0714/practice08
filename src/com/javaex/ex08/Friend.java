package com.javaex.ex08;

public class Friend {

	private String name;
	private String no;
	private String school;
	
	public Friend(String name, String no, String school) {
		
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getNo() {
		return no;
	}



	public void setNo(String no) {
		this.no = no;
	}



	public String getSchool() {
		return school;
	}



	public void setSchool(String school) {
		this.school = school;
	}


	

	@Override
	public String toString() {
		return "Friend [name=" + name + ", no=" + no + ", school=" + school + "]";
	}

	public void showInfo() {
		System.out.println("이름:"+name+" 핸드폰:"+no+" 학교:"+school);
	}
	
}
