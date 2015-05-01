package com.ericsson.jenkinsci.hajp.messages.credentials;

/**
 * a secrets match confirmation message to inform that joining
 * jenkins instance secrets match active masters'
 */
public class SecretsAndKeysMatchMessage extends AbstractCredentialsMessage {

    private static final long serialVersionUID = 4937713670362378783L;

    /**
     * @return always returns true, message is always valid
     */
    @Override public boolean isValid() {
        return true;
    }
}
