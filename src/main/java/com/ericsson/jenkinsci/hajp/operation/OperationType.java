package com.ericsson.jenkinsci.hajp.operation;

/**
 * Enumerating all OperationTypes to be used for identifying replication operations.
 */
public enum OperationType {

    CREATE_JOB("CREATE_JOB"),
    UPDATE_JOB("UPDATE_JOB"),
    RENAME_JOB("RENAME_JOB"),
    DELETE_JOB("DELETE_JOB"),
    DELETE_ALL_JOBS("DELETE_ALL_JOBS"),
    SEND_ALL_JOBS("SEND_ALL_JOBS"),
    CREATE_BUILD("CREATE_BUILD"),
    DELETE_BUILD("DELETE_BUILD"),
    SYNCHRONIZE_PLUGIN("SYNCHRONIZE_PLUGIN"),
    SYNCHRONIZE_SECRETS_KEYS("SYNCHRONIZE_SECRETS_KEYS"),
    SYNCHRONIZE_CREDENTIALS("SYNCHRONIZE_CREDENTIALS"),
    SYNCHRONIZE_GLOBAL_CONFIG("SYNCHRONIZE_GLOBAL_CONFIG");

    private static final long serialVersionUID = -1730817587720530229L;

    private String name;

    private OperationType(String name) {
        this.name = name;
    }

    /**
     * @return the name of the operation type as a string
     */
    public String getName() {
        return name;
    }
}
