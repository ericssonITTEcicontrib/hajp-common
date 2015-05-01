package com.ericsson.jenkinsci.hajp.messages.plugins;

import com.ericsson.jenkinsci.hajp.operation.OperationType;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * A synchronize plugin message class to carry information for replication of plugin configuration
 */
public class SynchronizePluginMessage extends AbstractPluginsMessage {
    @Getter private final Map<String, byte[]> fileMap;

    /**
     * Default contructor
     * @param fileName the file name
     * @param fileAsByteArray the file content as bytes array
     */
    public SynchronizePluginMessage(String fileName, byte[] fileAsByteArray) {
        this.fileMap = new HashMap<>();
        fileMap.put(fileName, fileAsByteArray);
        this.operationType = OperationType.SYNCHRONIZE_PLUGIN;
    }

    /**
     * @return true if the file hashmap is not null
     */
    @Override public boolean isValid() {
        return (fileMap != null);
    }
}
