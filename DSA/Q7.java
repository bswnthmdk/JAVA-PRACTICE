import java.util.*;
class Q7{
    static void problemStatement() {
        System.out.println("""
            Problem Statement of Question-7

            Given an array containing only 0, 1, and 2.

            Sort the array in ascending order.

            Risk Levels:
            0 -> Low
            1 -> Medium
            2 -> High

            Example 1:
            Input: [1, 0, 2, 0, 1, 0, 2]
            Output: [0, 0, 0, 1, 1, 2, 2]

            Explanation:
            Sort the items based on their risk levels.

            Example 2:
            Input: [2, 1, 0]
            Output: [0, 1, 2]

            Explanation:
            Arrange the risk levels in ascending order.
        """);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the array: ");
        String ip = sc.nextLine().trim();

        ip = ip.replace("[", "").replace("]", "");

        String[] parts = ip.split(",");

        int[] arr = new int[n];
        int i = 0;
        for(String part : parts){
            arr[i] = Integer.parseInt(part);
            i++;
        }

        System.out.println("Result: " + Arrays.toString(sortArray(n, arr)));
    }

    static int[] sortArray(int n, int[] arr){
        int l = 0, m = 0, h = n-1;

        while(m <= h){
            if(arr[m] == 0){
                int temp = arr[l];
                arr[l] = arr[m];
                arr[m] = temp;
                l++; 
                m++;
            }else if(arr[m] == 1){
                m++;
            }else{
                int temp = arr[h];
                arr[h] = arr[m];
                arr[m] = temp;
                h--; 
            }
        }

        return arr;
    }
}