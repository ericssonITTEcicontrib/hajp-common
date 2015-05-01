package com.ericsson.jenkinsci.hajp.messages.orchestration;

import lombok.Getter;

/**
 * An active master assignment message class to carry information for active master assignment
 */
public class ActiveMasterAssignmentMessage extends AbstractOrchestrationMessage {

    private static final long serialVersionUID = -5781444828692282208L;
    
    /**
     * API code authorizing active master operations on cluster member
     */
    @Getter private static final String ACTIVE_MASTER_API_CODE =
        "9e53b28c-bb5a-11e4-8dfc-aa07a5b093db";
    
    /**
     * @return true if the file hashmap is not null
     */
    @Override public boolean isValid() {
        return true;
    }

}
