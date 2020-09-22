import javax.swing.JOptionPane;

public class Question3 {
    public static void main(String[] args) {
        String output;
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeF = 0;
        int inputMark;
        int numOfMarks = 10;
        int [] marks = new int[numOfMarks];


        for (int i = 0; i < numOfMarks; i++) {
            inputMark = Integer.parseInt(JOptionPane.showInputDialog("Please enter a mark: "));
            while (inputMark < 0 || inputMark > 100) {
                inputMark = Integer.parseInt(JOptionPane.showInputDialog("Please enter a mark between 0 and 100."));
            }
            marks[i] = inputMark;
        }

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
        output = "The number of grade As is "+gradeA+". The number of grade Bs is "+gradeB+". The number of grade Cs is "+gradeC+". The number of grade Fs is "+gradeF+".";
        JOptionPane.showMessageDialog(null, output, "Pass Marks",JOptionPane.PLAIN_MESSAGE);
    }
}
