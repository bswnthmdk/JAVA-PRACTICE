
// GFG - Validate an IP Address
import java.util.*;

class IPv4 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine();

        if (isValidIP(ip)) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Invalid IP");
        }

    }

    static boolean isValidIP(String ip) {
        String[] parts = ip.split("\\.");
        System.out.println("Length: " + parts.length);

        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
            System.out.println(part);
            if ("".equals(part) || (part.length() > 1 && part.charAt(0) == '0')) {
                return false;
            }
            int num = Integer.parseInt(part);

            if (num < 0 || 255 < num) {
                return false;
            }
        }
        return true;
    }
}