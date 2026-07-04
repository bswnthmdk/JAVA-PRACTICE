import java.util.*;
class Q4{
    static void problemStatement() {
        System.out.println("""
            Problem Statement of Question-4

            Given an array B containing balloon colours.

            Return:
            - First colour that appears odd number of times.
            - If all colours appear even number of times, return "All are even".

            Example 1:
            Input: [r, g, b, b, g, y, y]
            Output: r

            Explanation:
            'r' appears 1 time (odd).
            'g', 'b', and 'y' each appear 2 times (even).

            Example 2:
            Input: [r, r, b, b, g, g]
            Output: All are even

            Explanation:
            Every colour appears an even number of times.
        """);
    }

    public static void main(String[] args){
        problemStatement();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of balloos: ");
        int n = sc.nextInt();
        sc.nextLine();

        char[] arr = new char[n];

        System.out.println("Enter characters -");
        for(int i=0; i<n; i++){
            arr[i] = sc.next().charAt(0);
        }

        System.out.print("Result: "+ oddColour(arr));
    }

    static String oddColour(char[] arr){
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char ch:arr){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for(char ch:arr){
            int freq = freqMap.get(ch);

            if(freq % 2 != 0){
                return String.valueOf(ch);
            }
        }
        return "All are even";
    }
}