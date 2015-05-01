package com.ericsson.jenkinsci.hajp.messages.credentials;

import lombok.Getter;

/**
 * A secrets and keys message class to carry information for secrets synchronization
 */
public class SecretsAndKeysMessage extends AbstractCredentialsMessage {

    private static final long serialVersionUID = 7868980212596106238L;

    @Getter private final byte[] keysFile;
    @Getter private final byte[] secretsFile;

    /**
     * Default constructor
     * @param keyFilesByteArr Keyfiles as byte array
     * @param secretsFile Secrets file as byte array
     */
    public SecretsAndKeysMessage(byte[] keyFilesByteArr, byte[] secretsFile) {
        this.keysFile = keyFilesByteArr;
        this.secretsFile = secretsFile;
    }

    /**
     * @return true if both keysfile and secretsfile are not null
     */
    @Override public boolean isValid() {
        return keysFile != null && secretsFile != null;
    }
}
