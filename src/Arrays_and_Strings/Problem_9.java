package Arrays_and_Strings;

public class Problem_9 {
    public static boolean solution(String s1, String s2){
        String aux = s1+s1;
        return aux.contains(s2);
    }
}
