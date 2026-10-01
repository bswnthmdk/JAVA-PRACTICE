import java.util.HashSet;

public class OOP_024 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");

        // Display the HashSet
        System.out.println("HashSet: " + hashSet);

        // Check if an element exists
        String searchElement = "Banana";
        boolean isDuplicate = false;
        for (String item : hashSet) {
            if (item.equals(searchElement)) {
            isDuplicate = true;
            break;
            }
        }
        if (isDuplicate) {
            System.out.println(searchElement + " is already in the HashSet.");
        } else {
            System.out.println(searchElement + " is not in the HashSet.");
        }
        }

        // Remove an element
        hashSet.remove("Date");
        System.out.println("HashSet after removal: " + hashSet);

        // Iterate through the HashSet
        System.out.println("Iterating through HashSet:");
        for (String item : hashSet) {
            System.out.println(item);
        }
    }}