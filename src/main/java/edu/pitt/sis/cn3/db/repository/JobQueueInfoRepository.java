package edu.pitt.sis.cn3.db.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pitt.sis.cn3.db.entity.JobQueueInfo;
import edu.pitt.sis.cn3.db.entity.UserInfo;

/**
 *
 * Feb 19, 2017 3:46:08 PM
 *
 * @author Chirayu Kong Wongchokprasitti (chw20@pitt.edu)
 */
public interface JobQueueInfoRepository extends JpaRepository<JobQueueInfo, Long> {

    public JobQueueInfo findByPid(Long pid);

    public JobQueueInfo findByIdAndOwners(Long id, Set<UserInfo> owners);

    public List<JobQueueInfo> findByStatus(int status);
    
    public List<JobQueueInfo> findByStatusAndOwners(int status, Set<UserInfo> owners);

    public List<JobQueueInfo> findByOwners(Set<UserInfo> owners);
}
