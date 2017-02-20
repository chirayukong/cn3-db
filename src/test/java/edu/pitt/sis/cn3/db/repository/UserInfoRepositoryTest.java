package edu.pitt.sis.cn3.db.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import edu.pitt.sis.cn3.db.entity.UserInfo;
import edu.pitt.sis.cn3.db.repository.UserInfoRepository;

/**
 *
 * Feb 18, 2017 2:15:04 PM
 *
 * @author Chirayu Kong Wongchokprasitti (chw20@pitt.edu)
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserInfoRepositoryTest {

	@Autowired
	private UserInfoRepository userInfoRepository;
	
    public UserInfoRepositoryTest(){
    }

	@Test
	public void testFindByEmail(){
		System.out.println("testFindByEmail");
		
		String email = "chw20@pitt.edu";
		UserInfo userInfo = userInfoRepository.findByEmail(email);
		Assert.notNull(userInfo);
	}

	@Test
	public void testFindById(){
		System.out.println("testFindById");
		
		Long id = 17L;
		UserInfo userInfo = userInfoRepository.findById(id);
		Assert.notNull(userInfo);
	}

	@Test
	public void testAuthenticate(){
		System.out.println("testAuthenticate");
		
		String email = "chw20@pitt.edu";
		String password = "kongman20";
		UserInfo userInfo = userInfoRepository.authenticate(email, password);
		Assert.notNull(userInfo);
	}
	
}
