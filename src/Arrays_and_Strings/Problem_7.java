package Arrays_and_Strings;

public class Problem_7 {
    public static int[][] solution(int[][] img){
        int n = img.length;
        for(int i = 0; i < n/2; i++){
            for(int j = 0; j < n/2; j++){
                int aux = img[n-1-j][i];
                img[n-1-j][i] = img[n-1-i][n-1-j];
                img[n-1-i][n-1-j] = img[j][n-1-i];
                img[j][n-1-i] = img[i][j];
                img[i][j] = aux;
            }
        }
        return img;
    }
}
