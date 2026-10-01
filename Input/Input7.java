import java.util.*;

class Input7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine(); // "4:10 AM" or "12:00 PM"

        String[] hmf = input.split(" "); // ["4:10", "AM"] or ["12:00", "PM"]

        String f = hmf[1]; // "AM" or "PM"

        String[] hm = hmf[0].split(":"); // ["4", "10"] or ["12", "00"]

        int hr = Integer.parseInt(hm[0]); // 4 or 12
        int mn = Integer.parseInt(hm[1]); // 10 or 00

        System.out.println("Hour: " + hr);
        System.out.println("Minute: " + mn);
        System.out.println("Period: " + f);
    }
}