package com.example.RecruitlyPortal.service;

import com.example.RecruitlyPortal.model.SchedulerLog;
import com.example.RecruitlyPortal.repository.SchedulerLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SchedulerService {

    @Autowired
    private SchedulerLogRepository schedulerLogRepository;

    @Scheduled(fixedRate = 5000)
    public void performTask() {
        SchedulerLog log = new SchedulerLog();
        log.setTask("Task description"); // Ensure this line does not cause an error
        log.setStatus("Completed");
        log.setTimestamp("2024-10-07T10:00:00Z");

// Save log to MongoDB using your repository
        schedulerLogRepository.save(log);

        System.out.println("Task performed at: " + new Date());
    }
}
