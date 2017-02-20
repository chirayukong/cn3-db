package edu.pitt.sis.cn3.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.pitt.sis.cn3.db.entity.UserInfo;

/**
 *
 * Feb 16, 2017 11:54:22 PM
 *
 * @author Chirayu Kong Wongchokprasitti (chw20@pitt.edu)
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

	public UserInfo findByEmail(String email);
	
	public UserInfo findById(Long id);
	
	@Query("SELECT ui FROM UserInfo ui WHERE ui.id=authenticate2(?1,MD5(?2))")
	public UserInfo authenticate(String email, String password);
	
}
