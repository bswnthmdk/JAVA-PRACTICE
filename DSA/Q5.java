import java.util.*;
class Q5{
    static void problemStatement() {
        System.out.println("""
            Problem Statement of Question-5

            Given a string S.

            Return the frequency of each distinct character
            in the order of its first appearance.

            Example 1:
            Input: "aaccbdddabcd"
            Output: 3324

            Explanation:
            a -> 3
            c -> 3
            b -> 2
            d -> 4

            Example 2:
            Input: "aaabbc"
            Output: 321

            Explanation:
            a -> 3
            b -> 2
            c -> 1
        """);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Result: " + uniqueCharFreq(s));
    }

    static String uniqueCharFreq(String s){
        HashMap<Character, Integer> freqMap = new HashMap<>();
        
        for(char ch:s.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for(char ch:s.toCharArray()){
            int freq = freqMap.get(ch);
            if(freq!=0){
                sb.append(freq);
                freqMap.put(ch, 0);
            }
        }

        return sb.toString();
    }
}