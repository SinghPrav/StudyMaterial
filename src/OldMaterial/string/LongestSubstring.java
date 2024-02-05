package OldMaterial.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
       String s ="abcabccb";
            int i = 0, j = 0, max = 0;
            Set<Character> set = new HashSet<>();

            while (j < s.length()) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j++));

                    max = Math.max(max, set.size());

                } else {
                    set.remove(s.charAt(i++));
                }

            }

         System.out.println(max);
       int le= lengthOfLongestSubstring(s);
        System.out.println(le);
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;
    }

}
