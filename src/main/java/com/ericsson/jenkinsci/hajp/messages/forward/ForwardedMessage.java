package com.ericsson.jenkinsci.hajp.messages.forward;

import com.ericsson.jenkinsci.hajp.messages.ClusterInternalMessage;
import lombok.Getter;
import lombok.Setter;

/**
 * Main communication medium between cluster members.
 * messageContent carries different messages inherited from
 * HajpMessage class.
 */
public class ForwardedMessage implements ClusterInternalMessage {

    private static final long serialVersionUID = -8462119854777759534L;

    @Getter private String destAddress;
    @Getter private Object messageContent;

    /**
     * Constructor
     * @param messageContent the payload message to be forwarded
     */
    public ForwardedMessage(Object messageContent) {
        this.messageContent = messageContent;
    }

    /**
     * Constructor
     * @param destAddress the destination address that the message is sending to
     * @param messageContent the payload message to be forwarded
     */
    public ForwardedMessage(String destAddress, Object messageContent) {
        this.destAddress = destAddress;
        this.messageContent = messageContent;
    }
}
