//Time complexity : O(N K log K) -> N is the length of strs, k is the maximum length of a string in strs

//Space Complexity - O(N K)

/*
 * Sort each string and use it as a key in a HashMap to group anagrams.
 * Store original strings in a list mapped to their sorted version, ensuring anagrams share the same key.
 * Return the grouped anagram lists extracted from the HashMap values.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        Map<String, ArrayList<String>> hmap = new HashMap<>();

        for(String s : strs) {
            char[] strArray = s.toCharArray();
            Arrays.sort(strArray);
            String sortedString = String.valueOf(strArray);
            hmap.putIfAbsent(sortedString, new ArrayList<String>());
            hmap.get(sortedString).add(s);
        }
        
        for(String sortedString : hmap.keySet()) {
            result.add(hmap.get(sortedString));
        }
        return result;
    }
}