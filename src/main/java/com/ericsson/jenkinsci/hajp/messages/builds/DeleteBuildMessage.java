package com.ericsson.jenkinsci.hajp.messages.builds;

import com.ericsson.jenkinsci.hajp.operation.OperationType;
import lombok.Getter;

/**
 * A delete build message class to carry information for replication of build deletion
 */
public class DeleteBuildMessage extends AbstractBuildMessage {

    private static final long serialVersionUID = -4014797885336852384L;

    @Getter private String jobName;
    @Getter private int buildNumber;

    /**
     * Default constructor
     * @param jobName the job name
     * @param buildNumber the build number
     */
    public DeleteBuildMessage(String jobName, int buildNumber) {
        this.jobName = jobName;
        this.buildNumber = buildNumber;
        this.operationType = OperationType.DELETE_BUILD;
    }

    /**
     * @return true if the job name is not null, false otherwise
     */
    @Override public boolean isValid() {
        return (jobName != null);
    }
}
