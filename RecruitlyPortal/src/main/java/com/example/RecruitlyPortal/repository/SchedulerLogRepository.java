package com.example.RecruitlyPortal.repository;

import com.example.RecruitlyPortal.model.SchedulerLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SchedulerLogRepository extends MongoRepository<SchedulerLog, String> {
}
