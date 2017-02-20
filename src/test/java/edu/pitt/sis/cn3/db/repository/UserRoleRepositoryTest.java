package edu.pitt.sis.cn3.db.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import edu.pitt.sis.cn3.db.entity.UserRole;

/**
 *
 * Feb 18, 2017 3:15:04 PM
 *
 * @author Chirayu Kong Wongchokprasitti (chw20@pitt.edu)
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRoleRepositoryTest {

	@Autowired
	private UserRoleRepository userRoleRepository;
	
	public UserRoleRepositoryTest() {
	}

	@Test
	public void testFindByRole(){
		System.out.println("testFindByRole");
		
		String role = "End User";
		UserRole userRole = userRoleRepository.findByRole(role);
		Assert.notNull(userRole);
	}

	@Test
	public void testFindById(){
		System.out.println("testFindById");
		
		Long id = 1L;
		UserRole userRole = userRoleRepository.findById(id);
		Assert.notNull(userRole);
	}
	
	@Test
	public void testFindAll(){
		System.out.println("testFindById");
		
		List<UserRole> roles = userRoleRepository.findAll();
		Assert.notNull(roles);
	}
	
}
