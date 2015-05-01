package com.ericsson.jenkinsci.hajp.messages.builds;

import com.ericsson.jenkinsci.hajp.operation.OperationType;
import lombok.Getter;

/**
 * A create build message class to carry information for replication of build creation
 */
public class CreateBuildMessage extends AbstractBuildMessage {

    private static final long serialVersionUID = 1451728451833693838L;

    @Getter private String jobName;
    @Getter private int buildNumber;
    @Getter private String dirName;
    @Getter private byte[] fileAsByteArray;

    /**
     * Default constructor
     * @param jobName the job name
     * @param buildNumber the build number
     * @param dirName the build dir name
     * @param fileAsByteArray the build file as byte array
     */
    public CreateBuildMessage(String jobName, int buildNumber, String dirName, byte[] fileAsByteArray) {
        this.jobName = jobName;
        this.buildNumber = buildNumber;
        this.dirName = dirName;
        this.fileAsByteArray = fileAsByteArray;
        this.operationType = OperationType.CREATE_BUILD;
    }

    /**
     * @return true if the job name is not null, false otherwise
     */
    @Override public boolean isValid() {
        return (jobName != null);
    }
}
