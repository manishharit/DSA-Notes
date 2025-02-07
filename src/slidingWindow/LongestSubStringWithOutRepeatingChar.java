package slidingWindow;

import java.util.HashMap;

public class LongestSubStringWithOutRepeatingChar {
    // problem like: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
    public static void main(String[] args) {
        System.out.println(longestSubStringWithoutRepeatation("ababacd"));
    }

    private static int longestSubStringWithoutRepeatation(String s) {
        int i=0,j=0;
        int result =0;
        HashMap<Character,Integer> map = new HashMap<>();

        while (j<s.length()){
         // calc
            char charEnd = s.charAt(j);
            map.merge(charEnd, 1, Integer::sum);
        // remove ith when map size in less than window size
            while (map.size() < j-i+1){
                char charStart = s.charAt(i);
                map.put(charStart,map.get(charStart)-1);
                if(map.get(charStart) == 0) {map.remove(charStart);}
                i++;
            }
        // store ans
            if(map.size() == j-i+1) result = Math.max(result,j-i+1);
        // move the window
            j++;

        }
        return result;
    }
}
