package com.ericsson.jenkinsci.hajp.messages.jobs;

import com.ericsson.jenkinsci.hajp.operation.OperationType;
import lombok.Getter;

/**
 * A create job message class to carry information for replication of job creation
 */
public class CreateJobMessage extends AbstractJobMessage {

    private static final long serialVersionUID = -1971802031463184679L;

    @Getter private String jobName;
    @Getter private String xmlFileContents;

    /**
     * Default constructor
     * @param jobName the job name
     * @param xmlFileContents the xml file content
     */
    public CreateJobMessage(String jobName, String xmlFileContents) {
        this.jobName = jobName;
        this.xmlFileContents = xmlFileContents;
        this.operationType = OperationType.CREATE_JOB;
    }

    /**
     * @return true if the job name and xml file content are not null
     */
    @Override public boolean isValid() {
        return (jobName != null && xmlFileContents != null);
    }
}
