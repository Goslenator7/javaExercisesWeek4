import javax.swing.JOptionPane;

public class Question3 {
    public static void main(String[] args) {
        // Initialize variables
        String output;
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeF = 0;
        int inputMark;
        // Initialize array
        int numOfMarks = 10;
        int [] marks = new int[numOfMarks];

        // Loop 10 times asking for the user to input a mark
        for (int i = 0; i < numOfMarks; i++) {
            inputMark = Integer.parseInt(JOptionPane.showInputDialog("Please enter a mark: "));
            // Check that the user input is between 0 and 100. If not, loop with another input until valid.
            while (inputMark < 0 || inputMark > 100) {
                inputMark = Integer.parseInt(JOptionPane.showInputDialog("Please enter a mark between 0 and 100."));
            }
            // Once input is valid, add it to the array
            marks[i] = inputMark;
        }

        // Loop over the contents of the array, and determine if it falls into the categories. If it does, add one to the counter for
        // that category
        for (int i = 0; i < numOfMarks; i++) {
            inputMark = marks[i];
            if (inputMark >= 75 && inputMark <= 100) {
                gradeA++;
            }
            else if (inputMark >= 60 && inputMark <= 74) {
                gradeB++;
            }
            else if (inputMark >= 50 && inputMark <= 59) {
                gradeC++;
            }
            else if (inputMark < 50) {
                gradeF++;
            }
        }
        // Formulate output and display number of grades
        output = "The number of grade As is "+gradeA+". The number of grade Bs is "+gradeB+". The number of grade Cs is "+gradeC+". The number of grade Fs is "+gradeF+".";
        JOptionPane.showMessageDialog(null, output, "Pass Marks",JOptionPane.PLAIN_MESSAGE);
    }
}
