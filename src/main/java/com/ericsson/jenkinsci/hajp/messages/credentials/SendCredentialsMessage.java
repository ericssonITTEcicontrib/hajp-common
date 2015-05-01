package com.ericsson.jenkinsci.hajp.messages.credentials;

import com.ericsson.jenkinsci.hajp.operation.OperationType;
import lombok.Getter;

/**
 * A send credentials message class to request for replication of credentials
 */
public class SendCredentialsMessage extends AbstractCredentialsMessage {

    private static final long serialVersionUID = -7470087163254771861L;
    @Getter private String origAddress;
    @Getter private String destAddress;


    /**
     * Default constructor
     * @param origAddress Original address for the msg
     * @param destAddress Destination address for the msg
     */
    public SendCredentialsMessage(String origAddress, String destAddress) {
        this.origAddress = origAddress;
        this.destAddress = destAddress;
        this.operationType = OperationType.SYNCHRONIZE_CREDENTIALS;
    }

    /**
     * @return true if origAddress and destAddress are not null, false otherwise
     */
    @Override public boolean isValid() {
        return origAddress != null && destAddress != null;
    }
}
