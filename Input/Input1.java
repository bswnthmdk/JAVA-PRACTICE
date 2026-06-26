import java.util.*;
public class Input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] parts = line.split(" ");

        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}