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
 * Feb 17, 2017 2:18:44 PM
 *
 * @author Chirayu Kong Wongchokprasitti (chw20@pitt.edu)
 */
@Table(name="userrole")
@Entity
public class UserRole implements Serializable {

	private static final long serialVersionUID = 7843852156483559797L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userroleID", unique = true, nullable = false)
	private Long id;

	@Column(name = "Role", nullable = false)
	private String role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
