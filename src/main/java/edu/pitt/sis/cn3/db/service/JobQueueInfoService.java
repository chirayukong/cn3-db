package edu.pitt.sis.cn3.db.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.pitt.sis.cn3.db.entity.JobQueueInfo;
import edu.pitt.sis.cn3.db.entity.UserInfo;
import edu.pitt.sis.cn3.db.repository.JobQueueInfoRepository;

/**
 *
 * Feb 19, 2017 3:52:32 PM
 *
 * @author Chirayu Kong Wongchokprasitti (chw20@pitt.edu)
 */
@Service
@Transactional
public class JobQueueInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(JobQueueInfoService.class);

	private final JobQueueInfoRepository jobQueueInfoRepository;
	
	public JobQueueInfoService(JobQueueInfoRepository jobQueueInfoRepository) {
		this.jobQueueInfoRepository = jobQueueInfoRepository;
	}

    public JobQueueInfo saveJobIntoQueue(JobQueueInfo jobQueueInfo) {
        return jobQueueInfoRepository.save(jobQueueInfo);
    }

    public List<JobQueueInfo> saveAll(List<JobQueueInfo> jobQueueInfos) {
        return jobQueueInfoRepository.save(jobQueueInfos);
    }

    public int getNumRunningJobs() {
        return jobQueueInfoRepository.findByStatus(1).size();
    }

    public JobQueueInfo findByPid(Long pid) {
        return jobQueueInfoRepository.findByPid(pid);
    }

    public List<JobQueueInfo> findByStatus(int status) {
        return jobQueueInfoRepository.findByStatus(status);
    }

    public JobQueueInfo findFirstJobInQueue() {
        return jobQueueInfoRepository.findByStatus(0).get(0);
    }

    public List<JobQueueInfo> findAll() {
        return jobQueueInfoRepository.findAll();
    }

    public boolean deleteJobInQueue(JobQueueInfo jobQueueInfo) {
        try {
            jobQueueInfoRepository.delete(jobQueueInfo);
        } catch (Exception exception) {
            LOGGER.error(exception.getMessage());

            return false;
        }

        return true;
    }

    public boolean deleteJobById(Long id) {
        try {
            jobQueueInfoRepository.delete(id);
        } catch (Exception exception) {
            LOGGER.error(exception.getMessage());

            return false;
        }

        return true;
    }

    public JobQueueInfo findOne(Long id) {
        return jobQueueInfoRepository.findOne(id);
    }

    public List<JobQueueInfo> findByStatusAndOwners(int status, UserInfo userInfo) {
        return jobQueueInfoRepository.findByStatusAndOwners(status, Collections.singleton(userInfo));
    }

    public List<JobQueueInfo> findByOwners(Set<UserInfo> userInfos) {
        return jobQueueInfoRepository.findByOwners(userInfos);
    }

    public JobQueueInfo findByIdAndOwners(Long id, UserInfo userInfo) {
        return jobQueueInfoRepository.findByIdAndOwners(id, Collections.singleton(userInfo));
    }

}
