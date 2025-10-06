import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class SimpleSwingFrame {

    public static void main(String[] args) {
        // Create a new JFrame object
        JFrame frame = new JFrame("My First Swing Frame");

        // Set the title of the frame
        frame.setTitle("Simple Swing Application");

        // Set the size of the frame (width x height)
        frame.setSize(400, 300);

        // Set the default close operation (what happens when the user clicks the close button)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application

        // Create a JLabel (text label)
        JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER);

        // Add the label to the content pane of the frame
        frame.getContentPane().add(label, BorderLayout.CENTER); // Center the label

        // Make the frame visible
        frame.setVisible(true);
    }
}