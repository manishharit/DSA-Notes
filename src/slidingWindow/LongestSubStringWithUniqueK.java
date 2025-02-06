package slidingWindow;

import java.util.HashMap;

public class LongestSubStringWithUniqueK {
    public static void main(String[] args) {
        System.out.println(longestUniqueSubArray("aabacbebebe",3));
    }

    private static int longestUniqueSubArray(String s, int k) {
        int i=0,j=0,result=0;
        HashMap<Character,Integer> map = new HashMap<>();

        while (j<s.length()){
         // calc
            char ch = s.charAt(j);
            if (map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);

         // variable size condition to remove data from ith data
            while (map.size()>k && i<=j){
                char charStart = s.charAt(i);
                map.put(charStart,map.get(charStart)-1);
                if(map.get(charStart) == 0) {map.remove(charStart);}
                i++;
            }

         // store answer
            if(map.size() == k){
                result = Math.max(result,j-i+1);
            }
         // move window forward
            j++;

        }
        return result;
    }
}
