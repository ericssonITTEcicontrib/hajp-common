package com.ericsson.jenkinsci.hajp.messages;

import com.ericsson.jenkinsci.hajp.operation.OperationType;

import java.io.Serializable;

/**
 * HajpMessage is the core message interface tying
 * all operational and/or status messaging.
 */
public interface HajpMessage extends Serializable {
    /**
     * @return the operation type that the message is meant for
     */
    OperationType getOperationType();

    /**
     * @return true, if the message is valid, false otherwise
     */
    boolean isValid();
}

