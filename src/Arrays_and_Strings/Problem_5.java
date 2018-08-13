package Arrays_and_Strings;

public class Problem_5 {
    public static boolean solution(String a, String b){
        int l_a = a.length();
        int l_b = b.length();
        if(Math.abs(l_b-l_a)>=2){
            return false;
        }else{
            String longer;
            String shorter;
            if(l_b==l_a){
                int count = 0;
                for(int i = 0; i < l_b; i++){
                    if(a.charAt(i)!=b.charAt(i)){
                        count++;
                        if(count>1){
                            return false;
                        }
                    }
                }
                return true;
            }else{
                if(l_b>l_a){
                    longer = b;
                    shorter = a;
                }else{
                    longer = a;
                    shorter = b;
                }
                int count = 0;
                for(int i = 0; i < Math.min(l_a, l_b); i++){
                    if(count==0){
                        if(shorter.charAt(i)!=longer.charAt(i)){
                            count++;
                        }
                    }else{
                        if(shorter.charAt(i)!=longer.charAt(i+1)){
                            return false;
                        }
                    }
                }
                return true;
            }
        }
    }
}
