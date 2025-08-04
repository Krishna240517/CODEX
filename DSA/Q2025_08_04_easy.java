import java.util.Arrays;

public class Q2025_08_04_easy {
    public static void main(String[] args) {
        System.out.println(returnLeftMostNonrepeating("abdcabc"));
    }
    public static int returnLeftMostNonrepeating(String s){
        int[] count = new int[256];
        int res = Integer.MAX_VALUE;
        Arrays.fill(count,-1);
        for(int i = 0;i < s.length();i++){
            int fi = count[s.charAt(i)];
            if(fi==-1){
                count[s.charAt(i)] = i;
            } else {
                count[s.charAt(i)] = -2;
            }
        }

        for(int i = 0;i<256;i++){
            int fi = count[i];
            if(fi >= 0){
                res = Math.min(res,fi);
            }
        }
        return (res == Integer.MAX_VALUE ? -1 : res);
    }
}
