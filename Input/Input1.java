import java.util.*;

public class Input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read the whole line as a string
        String line = sc.nextLine(); // 1 2 3 4 5 (without size)

        // split it by space to get individual numbers as strings
        String[] parts = line.split(" "); // ["1", "2", "3", "4", "5"]

        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            // parse each part to integer
            arr[i] = Integer.parseInt(parts[i]); // [1, 2, 3, 4, 5]
        }

        System.out.println(Arrays.toString(arr));
    }
}