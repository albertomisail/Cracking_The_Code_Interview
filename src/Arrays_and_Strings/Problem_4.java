package Arrays_and_Strings;

import java.util.HashMap;
import java.util.Map;

public class Problem_4 {
    public static boolean solution(String str){
        HashMap<Character, Integer> freqs = new HashMap<>();
        for(Character c : str.toCharArray()){
            if(freqs.containsKey(c)){
                freqs.put(c, freqs.get(c)+1);
            }else{
                freqs.put(c, 1);
            }
        }
        int count = 0;
        for(Map.Entry<Character, Integer> entry : freqs.entrySet()){
            if(entry.getValue()%2==1){
                count++;
                if(count>1){
                    return false;
                }
            }
        }
        return true;
    }
}
