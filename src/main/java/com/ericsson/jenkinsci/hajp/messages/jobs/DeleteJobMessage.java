package com.ericsson.jenkinsci.hajp.messages.jobs;

import com.ericsson.jenkinsci.hajp.operation.OperationType;
import lombok.Getter;

/**
 * A delete job message class to carry information for replication of job deletion
 */
public class DeleteJobMessage extends AbstractJobMessage {

    private static final long serialVersionUID = 1827235759561860966L;

    @Getter private String jobName;

    /**
     * Default constructor
     * @param jobName the job name
     */
    public DeleteJobMessage(String jobName) {
        this.jobName = jobName;
        this.operationType = OperationType.DELETE_JOB;
    }

    /**
     * @return true if the job name is not null
     */
    @Override public boolean isValid() {
        return (jobName != null);
    }
}
