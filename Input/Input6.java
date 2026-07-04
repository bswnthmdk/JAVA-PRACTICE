import java.util.*;
class Input6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // move the cursor to the next line after reading the integer
        String s = sc.nextLine();

        String[] parts = new String[n];
        parts = s.split(" ");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}