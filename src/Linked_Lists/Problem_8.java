package Linked_Lists;

import java.util.HashSet;
import java.util.LinkedList;

public class Problem_8 {
    public static Object solution(LinkedList lst){
        HashSet set = new HashSet();
        for(Object o : lst){
            if(set.contains(o)){
                return o;
            }else{
                set.add(o);
            }
        }
        return null;
    }
}
