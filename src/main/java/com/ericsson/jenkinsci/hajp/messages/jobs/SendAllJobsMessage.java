package com.ericsson.jenkinsci.hajp.messages.jobs;

import com.ericsson.jenkinsci.hajp.operation.OperationType;
import lombok.Getter;

/**
 * A send all jobs message class to request for replication of all jobs
 */
public class SendAllJobsMessage extends AbstractJobMessage {

    private static final long serialVersionUID = 4119422975193710478L;

    @Getter private String origAddress;
    @Getter private String destAddress;

    /**
     * Default constructor
     */
    public SendAllJobsMessage(String origAddress, String destAddress) {
        this.origAddress = origAddress;
        this.destAddress = destAddress;
        this.operationType = OperationType.SEND_ALL_JOBS;
    }

    /**
     * @return true if origAddress and destAddress are not null, false otherwise
     */
    @Override public boolean isValid() {
        return (origAddress != null && destAddress != null);
    }
}
