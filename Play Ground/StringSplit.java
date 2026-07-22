import java.util.Arrays;
class StringSplit {
    public static void main(String[] args) {
        String str = "a good   example";
        String[] parts = str.split(" ");

            System.out.println(Arrays.toString(parts));

    }
}