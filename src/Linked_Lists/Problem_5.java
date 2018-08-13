package Linked_Lists;

import java.util.LinkedList;

public class Problem_5 {
    public static LinkedList<Integer> solution(LinkedList<Integer> num1, LinkedList<Integer> num2){
        int res1 = 0;
        int exponent = 1;
        for(Integer i : num1){
            res1 += i * exponent;
            exponent *= 10;
        }
        int res2 = 0;
        exponent = 1;
        for(Integer i : num2){
            res2 += i * exponent;
            exponent *= 10;
        }
        int res = res1 + res2;
        LinkedList<Integer> result = new LinkedList<>();
        while(res>=1){
            result.add(res%10);
            res /= 10;
        }
        return result;
    }
}
