package edu.pitt.sis.cn3.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * Jul 17, 2016 6:00:00 PM
 *
 * @author Chirayu Kong Wongchokprasitti (chw20@pitt.edu)
 */
@Table(name="userinfo")
@Entity
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 19906927030062532L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userID", unique = true, nullable = false)
	private Long id;

	@Column(name = "email", unique = true, nullable = false)
	private String email;

	@Column(name = "passcode", nullable = false)
	private String password;

	@Column(name = "userroleID", nullable = false)
	private int roleId;

	@Column(name = "publicKey", length = 592)
    private String publicKey;

    @Column(name = "privateKey", length = 448)
    private String privateKey;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

}
