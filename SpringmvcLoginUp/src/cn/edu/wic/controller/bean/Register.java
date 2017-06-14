package cn.edu.wic.controller.bean;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import cn.edu.wic.bean.User;


public class Register {
    @NotNull  //2
    @Length(max=16,min=3)  //1
	private String username;
    @NotNull  //2
    @Length(max=16,min=3)  //1
	private String password;
    @NotNull  
	private String passwordRepeat;
    @NotNull  //2
    @Length(max=16,min=3)  //1
	private String name;
	private String sex;
	private String classes;
	
    public User toUser(){
    	User user = new User();
    	user.setUsername(username);
    	user.setPassword(password);
    	user.setName(name);
    	user.setSex(sex);
    	user.setClasses(classes);
    	
    	return user;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

}
