package com.ericsson.jenkinsci.hajp.messages.orchestration;

import com.ericsson.jenkinsci.hajp.messages.HajpMessage;
import com.ericsson.jenkinsci.hajp.operation.OperationType;
import lombok.Getter;
import net.sf.json.JSONObject;

public abstract class AbstractOrchestrationMessage implements HajpMessage {
    @Getter protected OperationType operationType;

    /**
     * @return the message object as json string
     */
    @Override public String toString() {
        return JSONObject.fromObject(this).toString();
    }

}
