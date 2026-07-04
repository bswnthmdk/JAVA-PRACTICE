import java.util.*;
class Q1{
    static void problemStatement(){
        System.out.println("""
            Problem Statement of Question-2

            Given a string S containing only '*' and '#'.

            Return:
            +ve : '*' > '#'
            -ve : '#' > '*'
            0  : '*' = '#'

            Example 1:
            Input: ###***
            Output: 0

            Explanation: There are 3 '#' and 3 '*', so the counts are equal.

            Example 2:
            Input: **##*
            Output: 1

            Explanation: There are 3 '*' and 2 '#'. Difference = 1.
        """);
    }

    public static void main(String[] args){
        problemStatement();
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println("min no - "+minNo(s));


    }

    static int minNo(String s){
        int hash = 0, star = 0;

        for(char ch:s.toCharArray()){
            if(ch == '#'){
                hash++;
            }else{
                star++;
            }
        }

        return star - hash;
    }
}