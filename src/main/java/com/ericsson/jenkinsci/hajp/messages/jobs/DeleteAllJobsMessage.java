package com.ericsson.jenkinsci.hajp.messages.jobs;

import com.ericsson.jenkinsci.hajp.operation.OperationType;
import lombok.Getter;

/**
 * A delete job message class to carry information for replication of job deletion
 */
public class DeleteAllJobsMessage extends AbstractJobMessage {

    private static final long serialVersionUID = -4755958599239788415L;

    /**
     * Default constructor
     */
    public DeleteAllJobsMessage() {
        this.operationType = OperationType.DELETE_ALL_JOBS;
    }

    /**
     * @return true
     */
    @Override public boolean isValid() {
        return true;
    }
}
