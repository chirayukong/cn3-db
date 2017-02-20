package edu.pitt.sis.cn3.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.pitt.sis.cn3.db.entity.UserRole;
import edu.pitt.sis.cn3.db.repository.UserRoleRepository;

/**
 *
 * Feb 17, 2017 3:44:45 PM
 *
 * @author Chirayu Kong Wongchokprasitti (chw20@pitt.edu)
 */
@Service
@Transactional
public class UserRoleService {

	private UserRoleRepository userRoleRepository;
	
	@Autowired(required = true)
	public UserRoleService(UserRoleRepository userRoleRepository) {
		this.userRoleRepository = userRoleRepository;
	}

	public UserRole findByRole(String role){
		return userRoleRepository.findByRole(role);
	}
	
	public UserRole findById(Long id){
		return userRoleRepository.findById(id);
	}
	
	public List<UserRole> findAll(){
		return userRoleRepository.findAll();
	}
	
}
