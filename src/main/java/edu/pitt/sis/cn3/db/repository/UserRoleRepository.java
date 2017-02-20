package edu.pitt.sis.cn3.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pitt.sis.cn3.db.entity.UserRole;

/**
 *
 * Feb 17, 2017 3:41:09 PM
 *
 * @author Chirayu Kong Wongchokprasitti (chw20@pitt.edu)
 */
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
	
	public UserRole findByRole(String role);
	
	public UserRole findById(Long id);
	
}
