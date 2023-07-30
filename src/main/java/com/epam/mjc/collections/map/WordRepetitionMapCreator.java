package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Implement the program which gets String sentence as parameter and creates a Map<String,Integer>
 *     of word repetition , where key -
 * the word from sentence in lower case, value - the number of repetitions of this word, ignoring case.
 */
public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String,Integer> result = new HashMap<>();
        if(sentence.equals("")) return result;
        String[] sentenceArray = sentence.toLowerCase().replace(",","").replace(".","").split(" ");

        for(String word:sentenceArray){
            result.put(word, result.getOrDefault(word, 0) + 1);
        }
        return result;
    }
}
