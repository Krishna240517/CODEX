public class Q2025_07_23_med3 {
    public static void main(String[] args) {
        int[] arr = { 25, 46, 28, 49, 24 };
        int m = 4;
        System.out.println(findPages(arr, m));
    }

    public static int findPages(int[] arr, int m) {
        if (arr.length < m)
            return -1; 

        int start = Integer.MIN_VALUE;
        int end = 0;
        for (int pages : arr) {
            start = Math.max(start, pages); 
            end += pages;
        }

        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int requiredStudents = countStudents(arr, mid);

            if (requiredStudents > m) {
                start = mid + 1;
            } else {
                result = mid;
                end = mid - 1;
            }
        }
        return result;
    }

    public static int countStudents(int[] arr, int maxPages) {
        int students = 1, sum = 0;
        for (int pages : arr) {
            if (sum + pages > maxPages) {
                students++;
                sum = pages;
            } else {
                sum += pages;
            }
        }
        return students;
    }

}
