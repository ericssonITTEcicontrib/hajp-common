package com.ericsson.jenkinsci.hajp.messages.jobs;

import com.ericsson.jenkinsci.hajp.operation.OperationType;
import lombok.Getter;

public class UpdateJobMessage extends AbstractJobMessage {

    private static final long serialVersionUID = -3704043592734255898L;

    @Getter private String jobName;
    @Getter private String xmlFileContents;

    /**
     * Default constructor
     * @param jobName the job name
     * @param xmlFileContents the xml file content
     */
    public UpdateJobMessage(String jobName, String xmlFileContents) {
        this.jobName = jobName;
        this.xmlFileContents = xmlFileContents;
        this.operationType = OperationType.UPDATE_JOB;
    }

    /**
     * @return true if the job name and xml file content are not null
     */
    @Override public boolean isValid() {
        return (jobName != null && xmlFileContents != null);
    }
}
