import java.util.Arrays;

public class LeetCode3169 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr.length);
        int startIndex = 5; // Starting index (inclusive)
        int endIndex = 7; // Ending index (exclusive)
        Arrays.fill(arr, startIndex, endIndex, 1);
        Arrays.fill(arr, 3, 8, 1);
        System.out.print(Arrays.toString(arr));
    }
}
