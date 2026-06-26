import java.util.*;
public class Input3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine().trim();

        line = line.replaceAll("\\[|\\]", "");

        String[] parts = line.split(",");

        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++)
            arr[i] = Integer.parseInt(parts[i].trim());

        System.out.println(Arrays.toString(arr));
    }
}