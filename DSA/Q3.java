import java.util.*;

class Q3 {
    static void problemStatement() {
        System.out.println("""
                    Problem Statement of Question-3

                    Given an integer array Arr of size N.

                    Count the elements that are greater than all previous elements.

                    Note:
                    - The first element is always counted.

                    Example 1:
                    Input: [7, 4, 8, 2, 9]
                    Output: 3

                    Explanation:
                    7, 8, and 9 are greater than all previous elements.

                    Example 2:
                    Input: [5, 3, 2, 1]
                    Output: 1

                    Explanation:
                    Only the first element satisfies the condition.
                """);
    }

    public static void main(String[] args) {
        problemStatement();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements -");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Result: " + noOfElements(arr));
    }

    static int noOfElements(int[] nums) {
        int max = nums[0], count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                count++;
            }
        }

        return count;
    }
}