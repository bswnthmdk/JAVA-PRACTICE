import java.util.*;

public class Input4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine(); // apple banana cherry mango

        String[] words = line.split(" "); // ["apple", "banana", "cherry", "mango"]

        System.out.println(Arrays.toString(words));
    }
}

/*
 * if input - apple banana cherry mango
 * the output - [apple, banana, cherry, , , mango]
 */