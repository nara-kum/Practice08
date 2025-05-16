package com.javaex.ex08;

public class Friend {
	
	//필드
	String name;
	String hp;
	String school;
	
	//생성자
	public Friend() {
	}
	public Friend(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}
	
	//메소드
	public String getName() {
		return name;
	}
	public String getHp() {
		return hp;
	}
	public String getSchool() {
		return school;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	//메소드일반
	@Override
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}
	
	public void showInfo() {
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
	}
	
}
