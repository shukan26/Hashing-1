import java.util.*;


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
