package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
* Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.



Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true


Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
* */
public class IsomorphicStrings205 {

    public static void main(String[] args) {
        IsomorphicStrings205 isomorphicStrings205 = new IsomorphicStrings205();

        System.out.println(isomorphicStrings205.isIsomorphic("egg", "add")); //true
        System.out.println(isomorphicStrings205.isIsomorphic("foo", "bar")); //false
        System.out.println(isomorphicStrings205.isIsomorphic("paper", "title")); //true
        System.out.println(isomorphicStrings205.isIsomorphic("badc", "baba")); //false
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, String> map1 = new HashMap<>();
        Map<Character, String> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String value = s.charAt(i) + "" + t.charAt(i);
            map1.put(s.charAt(i), value);
            map2.put(t.charAt(i), value);
        }


        for (int i = 0; i < s.length(); i++) {
            if (!Objects.equals(map1.get(s.charAt(i)), map2.get(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
