public class Q2025_07_05_med2 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2 };
        nextPermutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void nextPermutation(int[] arr) {
        int bpIndex = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                // breakpoint is found;
                bpIndex = i;
                break;
            }
        }

        if (bpIndex == -1) {
            reverse(0, arr.length - 1, arr);
            return;
        }
        int eleIdx = -1;
        for (int i = arr.length - 1; i > bpIndex; i--) {
            if(arr[i] > arr[bpIndex]){
                eleIdx = i;
                break;
            }
        }
        int temp = arr[bpIndex];
        arr[bpIndex] = arr[eleIdx];
        arr[eleIdx] = temp;
        reverse(bpIndex + 1, arr.length - 1, arr);
    }

    public static void reverse(int start, int end, int[] arr) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
