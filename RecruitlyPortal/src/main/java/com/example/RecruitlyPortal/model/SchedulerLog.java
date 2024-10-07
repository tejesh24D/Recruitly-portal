package com.example.RecruitlyPortal.model;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "scheduler_logs")
public class SchedulerLog {

    @Id
    private String id;
    private String task; // Field for task
    private String status; // Other fields
    private String timestamp; // Other fields

    // Constructor
    public SchedulerLog() {
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) { // Make sure this method is defined
        this.task = task;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
