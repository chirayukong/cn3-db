package edu.pitt.sis.cn3.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.pitt.sis.cn3.db.entity.UserInfo;
import edu.pitt.sis.cn3.db.repository.UserInfoRepository;

/**
 *
 * Feb 17, 2017 12:14:44 AM
 *
 * @author Chirayu Kong Wongchokprasitti (chw20@pitt.edu)
 */
@Service
@Transactional
public class UserInfoService {

	private UserInfoRepository userInfoRepository;
	
	@Autowired(required = true)
	public UserInfoService(UserInfoRepository userInfoRepository){
		this.userInfoRepository = userInfoRepository;
	}
	
	public UserInfo findByEmail(String email){
		return userInfoRepository.findByEmail(email);
	}
	
	public UserInfo findById(Long id){
		return userInfoRepository.findById(id);
	}
	
	
	public UserInfo authenticate(String email, String password){
		return userInfoRepository.authenticate(email, password);
	}

	public UserInfo save(UserInfo userInfo) {
		return userInfoRepository.save(userInfo);
	}
}
