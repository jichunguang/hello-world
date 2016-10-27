package jcg.bean;

import java.math.BigDecimal;



public class TbUser {



	private Integer id;
	private String username;
	private String pwd;
	private String name;
	private Integer sex;
	private String idcard;
	private String phone;
	private Integer role;


	/** default constructor */
	public TbUser() {
	}

	/** minimal constructor */
	public TbUser(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TbUser(Integer id, String username, String pwd, String name,
			Integer sex, String idcard, String phone, Integer role) {
		this.id = id;
		this.username = username;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.idcard = idcard;
		this.phone = phone;
		this.role = role;
	}
	
	// Property accessors
	
	public Integer getId() {
		return this.id;
	}

	public TbUser(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getRole() {
		return this.role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "TbUser [id=" + id + ", idcard=" + idcard + ", name=" + name
				+ ", phone=" + phone + ", pwd=" + pwd + ", role=" + role
				+ ", sex=" + sex + ", username=" + username + "]";
	}
	
}