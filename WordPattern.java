//Time Complexity : O(N) where N is the length of the pattern

//Space Complexity : O(N) where N is the length of the pattern

/**
 * Checks if the given string `s` follows the character mapping pattern of `pattern` 
 * by ensuring a one-to-one mapping between characters and words.
 * Uses a HashMap to store character-to-word mappings and a HashSet to prevent duplicates.
 * Returns false if mapping is inconsistent or lengths don't match.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> patternMap = new HashMap();
        Set<String> wordSet = new HashSet();
        String[] strArray = s.split(" ");

        if (pattern.length() != strArray.length) {
            return false;
        }

        for (int i = 0; i < strArray.length; i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = strArray[i];
            if (!patternMap.containsKey(currentChar)) {
                if (!wordSet.contains(currentWord)) {
                    patternMap.put(currentChar, currentWord);
                    wordSet.add(currentWord);
                } else {
                    return false;
                }
            }
            else if (!patternMap.get(currentChar).equals(strArray[i])) {
                return false;
            }
        }
        return true;
    }
}
