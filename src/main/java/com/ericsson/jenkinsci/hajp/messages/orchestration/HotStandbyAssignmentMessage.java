package com.ericsson.jenkinsci.hajp.messages.orchestration;

import lombok.Getter;

/**
 * A hot standby assignment message class to carry information for hot standby assignment
 */
public class HotStandbyAssignmentMessage extends AbstractOrchestrationMessage {

    private static final long serialVersionUID = 4021362835829015370L;
    
    /**
     * API code authorizing hot standby operations on cluster member
     */
    @Getter private static final String HOT_STANDBY_API_CODE =
        "9e53b4da-bb5a-11e4-8dfc-aa07a5b093db";
    
    /**
     * @return true if the file hashmap is not null
     */
    @Override public boolean isValid() {
        return true;
    }
}
