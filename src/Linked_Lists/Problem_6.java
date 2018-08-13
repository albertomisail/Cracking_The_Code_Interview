package Linked_Lists;

import java.util.LinkedList;

public class Problem_6 {
    public static boolean solution(LinkedList lst){
        Object[] arr = lst.toArray();
        int n = arr.length;
        for(int i = 0; i < n / 2; i++){
            if(arr[i]!=arr[n-1-i]) return false;
        }
        return true;
    }
}
