package Linked_Lists;

import java.util.LinkedList;

public class Problem_2 {
    public static LinkedList solution(LinkedList lst, int k){
        if(k>lst.size()-1){
            return new LinkedList();
        }else{
            return (LinkedList)lst.subList(k, lst.size());
        }
    }
}
