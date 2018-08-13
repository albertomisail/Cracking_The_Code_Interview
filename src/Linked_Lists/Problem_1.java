package Linked_Lists;

import java.util.HashSet;
import java.util.LinkedList;

public class Problem_1 {
    public static LinkedList solution(LinkedList lst){
        HashSet set = new HashSet();
        for(Object o : lst){
            if(set.contains(o)){
                lst.remove(o);
            }else{
                set.add(o);
            }
        }
        return lst;
    }
}
