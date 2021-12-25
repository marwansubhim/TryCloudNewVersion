package com.tryCloud.utilities;

import java.util.HashMap;
import java.util.Map;

public class Memory {
    private static final Map<String, String> map = new HashMap<>();
    private static Memory memoryInstance = null;
    private Memory() { }
    public static Memory getMemory() {
        if (memoryInstance == null) {
            memoryInstance = new Memory();
        }
        return memoryInstance;
    }
    public void storeValue(String key, String value) {
        map.put(key, value);
    }
    public String retrieveValue(String key) {
        return map.get(key);
    }

}
