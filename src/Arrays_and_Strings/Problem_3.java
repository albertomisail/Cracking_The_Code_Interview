package Arrays_and_Strings;

public class Problem_3 {
    public static String solution(String str){
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        Character prev = null;
        for(int i = 0; i < arr.length; i++){
            char c = arr[i];
            if(c==' ' && prev!=' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
            prev = c;
        }
        if(prev==' '){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}
