package com.huawei.test.jobs.pojo;

import com.huawei.test.jobs.JobType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class BaseJobEntity {
    private String jobId;
    private JobType jobType;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public BaseJobEntity(String jobId, JobType jobType) {
        this.jobId = jobId;
        this.jobType = jobType;
    }

    public BaseJobEntity() {
    }
}
