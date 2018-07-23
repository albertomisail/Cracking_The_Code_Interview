package Arrays_and_Strings;

import java.util.Arrays;
import java.util.HashSet;

public class Problem_1 {
    public static boolean with_data_structures(String str){
        HashSet<Character> chars = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            Character c = str.charAt(i);
            if(chars.contains(c)){
                return false;
            }else{
                chars.add(c);
            }
        }
        return true;
    }

    public static boolean without_data_structure(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        char previous = arr[0];
        for(int i = 1; i < str.length(); i++){
            char current = arr[i];
            if(current == previous){
                return false;
            }else{
                previous = current;
            }
        }
        return  true;
    }
}
