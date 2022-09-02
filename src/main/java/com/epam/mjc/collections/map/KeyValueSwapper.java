package com.epam.mjc.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> sourceEntry : sourceMap.entrySet()) {
            if (map.containsKey(sourceEntry.getValue())) {
                if (map.get(sourceEntry.getValue()) < sourceEntry.getKey()) {
                    continue;
                }
            } else {
                map.put(sourceEntry.getValue(), sourceEntry.getKey());
            }
        }
        return map;
    }
}
