import java.util.*;

/*
 * Create a hashmap to store the mapping of characters from string s to string t.
 * Create a hashset to store the characters of string t.
 * Iterate through the string s and check if the character is present in the hashmap.
 * If it is not present, check if the character is present in the hashset.
 * If it is not present in the hashset, add the character to the hashmap and hashset.
 * If it is present in the hashset, return false.
 * If it is present in the hashmap, check if the character in the hashmap is equal to the character in the string t. If it is not equal, return false.
 */

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map1 = new HashMap<>();
        Set<Character> hset = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            Character s1 = s.charAt(i);
            Character t1 = t.charAt(i);

            if (!map1.containsKey(s1)) {
                if(!hset.contains(t1)) {
                map1.put(s1, t1);
                hset.add(t1);
                }
                else {
                    return false;
                }
            }
            else if(map1.get(s1) != t1) {
                    return false;
                }
        }
        return true;
    }
}
