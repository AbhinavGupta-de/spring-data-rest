package org.abhinavgpt.springdatarest.repository;

import org.abhinavgpt.springdatarest.models.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JobPost, Long> {

}