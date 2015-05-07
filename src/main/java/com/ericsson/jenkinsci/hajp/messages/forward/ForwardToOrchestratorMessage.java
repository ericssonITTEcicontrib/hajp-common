package com.ericsson.jenkinsci.hajp.messages.forward;


import com.ericsson.jenkinsci.hajp.messages.ClusterInternalMessage;
import lombok.Getter;

/**
 * ForwardToOrchestrator is a specialty message for sending messages
 * directly to orchestrator without having to know its address
 */
public class ForwardToOrchestratorMessage implements ClusterInternalMessage {

    private static final long serialVersionUID = 438165791511994009L;
    @Getter private Object messageContent;

    /**
     * Constructor
     * @param messageContent the payload message to be forwarded
     */
    public ForwardToOrchestratorMessage(Object messageContent) {
        this.messageContent = messageContent;
    }

}
