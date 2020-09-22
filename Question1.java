import javax.swing.JOptionPane;

public class Question1 {
    public static void main(String[] args) {
        int userNumber;
        int arrLength = 6;
        // Create an array of integers
        int[] numArray = new int[arrLength];

        // Loop 5 times to get user input and convert to number then add to number array
        int i = 0;
        while (i < arrLength - 1) {
            // Get the user integer from input
            userNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number: "));
            // Add the integer variable to the array index at that point
            numArray[i] = userNumber;
            // Iterate the loop to get next input
            i++;
        }

        // For every element in the length of array, check if it's less than 10. If it is, print it
        for (i = 0; i < arrLength - 1; i++) {
            // Get the user's number out of the array and assign it to variable to hold it
            userNumber = numArray[i];
            // If the user's number is less than 10, then log the user's number
            if (numArray[i] < 10 ) {
                JOptionPane.showMessageDialog(null, numArray[i]);
            }
        }
    }
}
