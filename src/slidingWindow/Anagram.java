package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s = "aabaabaa";
        String subArr = "aaba";
        System.out.println(countAnagram(s,subArr));
    }

    private static int countAnagram(String s, String subArr) {
        Map<Character,Integer> map = new HashMap<>();
        int start=0,end=0,result =0;

        // load pattern string in map
        for(int i=0;i<subArr.length();i++){
            if(map.containsKey(subArr.charAt(i))) {
                map.put(subArr.charAt(i),map.get(subArr.charAt(i))+1);
            } else map.put(subArr.charAt(i),1);
        }
        int count = map.size();

        while (end<s.length()){
        // calc
            char endChar = s.charAt(end);
            if (map.containsKey(endChar)){
                map.put(endChar,map.get(endChar)-1);
                if(map.get(endChar) ==0) count--;
            }
        // if window size is achieved calculate ans, remove the effect of start and move
           if(end-start+1 ==subArr.length()){
               if(count==0) result++;
               char startChar = s.charAt(start);
               if(map.containsKey(startChar)){
                   map.put(startChar,map.get(startChar)+1);
                   if(map.get(startChar) == 1) count++;
               }
               start++;
           }
            end++;
        }
        return result;
    }

}

