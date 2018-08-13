package Arrays_and_Strings;

public class Problem_6 {
    public static String solution(String str){
        StringBuilder sb = new StringBuilder();
        Character prev = str.charAt(0);
        int count = 0;
        for(Character c : str.toCharArray()){
            if(c==prev){
                count++;
            }else{
                sb.append(prev);
                sb.append(count);
                count = 1;
                prev = c;
            }
        }
        sb.append(prev);
        sb.append(count);
        String result = sb.toString();
        if(result.length()<str.length()){
            return result;
        }else{
            return str;
        }
    }
}
