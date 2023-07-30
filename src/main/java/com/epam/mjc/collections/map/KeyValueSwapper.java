package com.epam.mjc.collections.map;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Implement the program which gets Map<Integer, String> as parameter and returns a Map<String, Integer>
 *     where the keys and values are swapped. If in the source map Map<Integer, String> there
 *     are the same values for different keys,
 * in the new Map<String, Integer> this value should map to a smaller key value.
 */
public class KeyValueSwapper {
    private static final Logger logger = Logger.getLogger(FileReader.class.getName());
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> result = new HashMap<>();
        try{
            for (Map.Entry<Integer, String> entry : sourceMap.entrySet()){
                result.put(entry.getValue(),entry.getKey());
            }
        }catch (Exception e){
            logger.severe(e.getMessage());
        }
        return result;
    }
}
