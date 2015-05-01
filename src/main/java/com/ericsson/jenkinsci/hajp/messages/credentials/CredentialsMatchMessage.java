package com.ericsson.jenkinsci.hajp.messages.credentials;

/**
 * Message class signifying credentials match
 */
public class CredentialsMatchMessage extends AbstractCredentialsMessage{

    private static final long serialVersionUID = 8899664156113143605L;

    /**
     * @return true if origAddress and destAddress are not null, false otherwise
     */
    @Override public boolean isValid() {
        return true;
    }
}
