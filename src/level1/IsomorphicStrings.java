package level1;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(new IsomorphicStrings().isIsomorphic("egg", "add"));
        System.out.println(new IsomorphicStrings().isIsomorphic("foo", "bar"));
        System.out.println(new IsomorphicStrings().isIsomorphic("paper", "title"));
        System.out.println(new IsomorphicStrings().isIsomorphic("bbbaaaba", "aaabbbba"));
        System.out.println(new IsomorphicStrings().isIsomorphic("badc", "baba"));
    }

    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), t.charAt(i));
            tMap.put(t.charAt(i), s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (t.charAt(i) != sMap.get(s.charAt(i))) {
                return false;
            }
            if (s.charAt(i) != tMap.get(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
