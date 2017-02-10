package springMybatis.vo;

import java.io.Serializable;

public class Account implements Serializable {

	private int id;

	private String username;

	private String password;

	private int status;

	private int grade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", password="
				+ password + ", status=" + status + ", grade=" + grade + "]";
	}

}
