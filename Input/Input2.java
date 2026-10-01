import java.util.*;

public class Input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine(); // 1,2,3,4,5

        String[] parts = line.split(","); // ["1", "2", "3", "4", "5"]

        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]); // [1, 2, 3, 4, 5]
        }

        System.out.println(Arrays.toString(arr));
    }
}