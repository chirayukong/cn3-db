package edu.pitt.sis.cn3.db.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * Feb 19, 2017 3:33:30 PM
 *
 * @author Chirayu Kong Wongchokprasitti (chw20@pitt.edu)
 */
@Entity
public class JobQueueInfo implements Serializable {

	private static final long serialVersionUID = -1543276701117546739L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "pid")
    private Long pid;

    @Column(name = "status", nullable = false)
    private int status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "addedTime", nullable = false, length = 19)
    private Date addedTime;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ownerJobQueueInfoRel", joinColumns = {
        @JoinColumn(name = "jobQueueInfoId", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "userInfoId", nullable = false, updatable = false)})
    private Set<UserInfo> owners = new HashSet<>(0);

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "TargetUserJobQueueInfoRel", joinColumns = {
        @JoinColumn(name = "jobQueueInfoId", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "userInfoId", nullable = false, updatable = false)})
    private Set<UserInfo> targetUsers = new HashSet<>(0);
    
	public JobQueueInfo() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getAddedTime() {
		return addedTime;
	}

	public void setAddedTime(Date addedTime) {
		this.addedTime = addedTime;
	}

	public Set<UserInfo> getOwners() {
		return owners;
	}

	public void setOwners(Set<UserInfo> owners) {
		this.owners = owners;
	}

	public Set<UserInfo> getTargetUsers() {
		return targetUsers;
	}

	public void setTargetUsers(Set<UserInfo> targetUsers) {
		this.targetUsers = targetUsers;
	}

}
