public class Q2025_07_17_easy {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(findSquareRoot(n));
    }
    public static int findSquareRoot(int n) {
        int start = 1;
        int end = n;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int sq = mid * mid;
            if(sq > n) {
                end = mid - 1;
            } else if(sq < n) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
