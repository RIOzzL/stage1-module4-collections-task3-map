package com.epam.mjc.collections.map;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] s = sentence.split(" ");
        System.out.println(Arrays.toString(s));
        Map<String, Integer> map = new HashMap<>();
        if (sentence.length() == 0) {
            return map;
        } else {
            for (String s1 : s) {
                map.put(s1.toLowerCase().trim().replaceAll("\\p{Punct}", ""),
                        map.get(s1.toLowerCase().trim().replaceAll("\\p{Punct}", "")) == null
                                ? 1 : map.get(s1.toLowerCase().trim().replaceAll("\\p{Punct}","")) + 1);
            }
        }
        return map;
    }
}
