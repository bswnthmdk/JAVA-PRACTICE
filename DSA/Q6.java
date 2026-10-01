import java.util.*;

class Q6 {
    static void problemStatement() {
        System.out.println("""
                    Problem Statement of Question-6

                    There are N monkeys on a tree.

                    Each monkey can eat:
                    - K bananas, or
                    - J peanuts.

                    Travelers offer M bananas and P peanuts.

                    Count how many monkeys remain on the tree after the others come down to eat.

                    Note:
                    - One monkey comes down at a time.
                    - The last monkey can eat the remaining bananas (< K)
                    and peanuts (< J), if any.
                    - K and J are always greater than 0.

                    Example 1:
                    Input:
                    N = 10, M = 12, P = 12, K = 2, J = 3

                    Output:
                    0

                    Explanation:
                    6 monkeys eat bananas and
                    4 monkeys eat peanuts.
                    All 10 monkeys come down.

                    Example 2:
                    Input:
                    N = 10, M = 8, P = 3, K = 3, J = 2

                    Output:
                    6

                    Explanation:
                    3 monkeys come down to eat.
                    So, 6 monkeys remain on the tree.
                """);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of monkeys: ");
        int n = sc.nextInt();

        System.out.print("Enter no. of bananas one can eat: ");
        int b = sc.nextInt();

        System.out.print("Enter no. of peanuts one can eat: ");
        int p = sc.nextInt();

        System.out.print("Enter no. of given bananas: ");
        int B = sc.nextInt();

        System.out.print("Enter no. of given peanuts: ");
        int P = sc.nextInt();

        System.out.println("Result: " + noOfRemainingMonkeys(n, b, p, B, P));
    }

    static int noOfRemainingMonkeys(int n, int b, int p, int B, int P) {
        int i = 0;

        // Monkeys eating bananas
        while (i < n && B > 0) {
            if (B >= b) {
                B -= b;
            } else {
                B = 0; // Last monkey eats remaining bananas
            }
            i++;
        }

        // Monkeys eating peanuts
        while (i < n && P > 0) {
            if (P >= p) {
                P -= p;
            } else {
                P = 0; // Last monkey eats remaining peanuts
            }
            i++;
        }

        return n - i;
    }
}