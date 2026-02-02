public class LeetCode3191 {
    static int flip(int x) {
        if (x == 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 1, 1, 0, 0 };
        int n = nums.length, j;
        for (int i = 0; i <= (n - 3); i++) {
            j = i;
            nums[j] = flip(nums[j]);
            nums[++j] = flip(nums[j]);
            nums[++j] = flip(nums[j]);
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
        int x = 0;
        x = flip(x);
        System.out.println(x);
    }
}