package Arrays_and_Strings;

import java.util.HashMap;
import java.util.Map;

public class Problem_2 {
    public static boolean solution(String str1, String str2){
        HashMap<Character, Integer> freq1 = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();
        int length1 = str1.length();
        int length2 = str2.length();
        if(length1 != length2){
            return false;
        }
        for(int i = 0; i < length1; i++){
            Character c1 = str1.charAt(i);
            Character c2 = str2.charAt(i);
            if(freq1.containsKey(c1)){
                freq1.put(c1, freq1.get(c1)+1);
            }else{
                freq1.put(c1, 1);
            }
            if(freq2.containsKey(c2)){
                freq2.put(c2, freq1.get(c2)+1);
            }else{
                freq2.put(c2, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : freq1.entrySet()){
            char c = entry.getKey();
            int freq = entry.getValue();
            if(freq2.get(c) == null || freq2.get(c) != freq){
                return false;
            }
        }
        return true;
    }
}
