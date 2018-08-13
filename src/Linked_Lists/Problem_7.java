package Linked_Lists;

import java.util.LinkedList;

public class Problem_7 {
    public static LinkedList solution(LinkedList lst1, LinkedList lst2){
        LinkedList<Object> olst1 = new LinkedList<>(lst1);
        LinkedList<Object> olst2 = new LinkedList<>(lst2);
        olst1.removeAll(olst2);
        LinkedList<Object> result = new LinkedList<>(lst1);
        result.removeAll(olst1);
        return result;
    }
}
