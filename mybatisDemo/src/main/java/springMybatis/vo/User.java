package springMybatis.vo;

import java.util.Date;

public class User {
	
	private int userid;
	
	private int accountid;
	
	private String username;
	
	private String gender;
	
	private Date birthday;
	
	private String email;
	
	private String address;
	
	private String school;
	
	private String company;
	
	private String phone;
	
	private String interest;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getAccountId() {
		return accountid;
	}

	public void setAccountId(int account) {
		this.accountid = account;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", account=" + accountid + ", username="
				+ username + ", gender=" + gender + ", birthday=" + birthday
				+ ", email=" + email + ", address=" + address + ", school=" + school
				+ ", company=" + company + ", phone=" + phone + ", interest="
				+ interest + "]";
	}
	
	

}
