import java.util.Scanner;
import javax.swing.JOptionPane;

public class TicketValidators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the ticket agent to enter a six-digit ticket number
        System.out.print("Enter a 6-digit ticket number: ");
        int ticketNumber = scanner.nextInt();

        // Validate input length
        if (ticketNumber < 100000 || ticketNumber > 999999) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a 6-digit number.");
            return;
        }

        // Extract the last digit
        int lastDigit = ticketNumber % 10;

        // Remove the last digit
        int remainingNumber = ticketNumber / 10;

        // Calculate the remainder when remainingNumber is divided by 7
        int remainder = remainingNumber % 7;

        // Check if the last digit equals the remainder
        boolean isValid = (lastDigit == remainder);

        // Display the result in a message box
        JOptionPane.showMessageDialog(null, "Ticket Number Valid: " + isValid);
    }
}
