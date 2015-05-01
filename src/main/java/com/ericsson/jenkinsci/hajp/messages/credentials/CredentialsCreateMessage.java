package com.ericsson.jenkinsci.hajp.messages.credentials;


import lombok.Getter;

/**
 * A credentials create message class to carry information about creating credentials
 */
public class CredentialsCreateMessage extends AbstractCredentialsMessage {

    private static final long serialVersionUID = 1243737085594111798L;

    @Getter private final byte[] credentialsFile;
    @Getter private final byte[] embeddedSecrets;

    /**
     * Default constructor
     * @param credentialsFile credentials file as byte array
     */
    public CredentialsCreateMessage(byte[] credentialsFile, byte[] embeddedSecrets) {
        this.credentialsFile = credentialsFile;
        this.embeddedSecrets = embeddedSecrets;
    }

    /**
     * @return true if credentials file is not null
     */
    @Override public boolean isValid() {
        return credentialsFile != null && embeddedSecrets != null;
    }
}
