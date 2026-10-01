class Solution {
    public int plusOne(int[] digits) {
        int[] result;
        if (digits[digits.length - 1] == 9 && digits[0] == 9) {
            result = new int[digits.length + 1];
        } else {
            result = new int[digits.length];
        }

        int num = 0;
        for (int i = 0; i < digits.length; i++) {
            num *= 10;
            num += digits[i];
        }
        num++;
        return num;
        // if (digits[digits.length - 1] == 9 && digits[0] == 9) {
        // int j = digits.length;
        // while (num != 0) {
        // result[j--] = (num % 10);
        // num /= 10;
        // }
        // // return result;
        // } else {
        // int j = digits.length - 1;
        // while (num != 0) {
        // result[j--] = (num % 10);
        // num /= 10;
        // }
        // // return result;
        // }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] digits = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }; // Predefined array

        int result = sol.plusOne(digits);

        System.out.print("Result: " + result);
        // for (int num : result) {
        // System.out.print(num + " ");
        // }
    }
}
