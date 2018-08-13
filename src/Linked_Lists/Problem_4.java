package Linked_Lists;

import java.util.LinkedList;

public class Problem_4 {
    public static LinkedList<Integer> solution(LinkedList<Integer> lst, int partition){
        LinkedList<Integer> before = new LinkedList<>();
        LinkedList<Integer> after = new LinkedList<>();
        for(Integer i : lst){
            if(i<partition){
                before.add(i);
            }else{
                after.add(i);
            }
        }
        before.addAll(after);
        return before;
    }
}
