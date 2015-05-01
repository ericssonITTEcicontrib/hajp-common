package com.ericsson.jenkinsci.hajp.messages.jobs;

import com.ericsson.jenkinsci.hajp.operation.OperationType;
import lombok.Getter;

/**
 * A renaming job message class to carry information for replication of job renaming
 */
public class RenameJobMessage extends AbstractJobMessage {

    private static final long serialVersionUID = 1624975612278570385L;

    @Getter private String jobName;
    @Getter private String newName;

    /**
     * Default constructor
     * @param jobName the job name
     * @param newName the hew name
     */
    public RenameJobMessage(String jobName, String newName) {
        this.jobName = jobName;
        this.newName = newName;
        this.operationType = OperationType.RENAME_JOB;
    }

    /**
     * @return true if the job name and new name are not null
     */
    @Override public boolean isValid() {
        return (jobName != null && newName != null && !newName.equals(jobName));
    }
}
