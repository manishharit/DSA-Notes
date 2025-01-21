package slidingWindow;

import java.util.HashMap;

public class anagramcount {
    public static void main(String[] args) {
     int val=   countAnagram("manianiaaniml","mani");
        System.out.println(val);

    }
    public static int countAnagram(String s,String pattern){
        int k = pattern.length();
        int result=0,i=0,j=0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int m=0;m<pattern.length();m++){
            if(map.containsKey(pattern.charAt(m))) map.put(pattern.charAt(m),map.get(pattern.charAt(m))+1);
            else map.put(pattern.charAt(m),1);
        }
        int count = map.size();

        while (j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch) == 0){
                    count--;
                }
            }
            if(j-i+1 == k){
                if(count ==0) result++;
                char ch1 = s.charAt(i);
                if(map.containsKey(ch1)){
                    map.put(ch1,map.get(ch1)+1);
                    if(map.get(ch1) == 1) count++;
                }
                i++;
            }
            j++;
        }

        return result;
    }
}
