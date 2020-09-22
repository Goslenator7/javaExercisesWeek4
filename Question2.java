import javax.swing.JOptionPane;

public class Question2 {
    public static void main(String[] args) {
        String output = null;
        int salaryArrayLength = 5;
        int userSalary;
        double increasedSalary;
        int[] salaryArray = new int [salaryArrayLength];

        for (int i = 0; i < salaryArrayLength; i++) {
            userSalary = Integer.parseInt(JOptionPane.showInputDialog("Please enter a salary: "));
            salaryArray[i] = userSalary;
        }

        for(int i = 0; i < salaryArrayLength; i++) {
            userSalary = salaryArray[i];
            increasedSalary = userSalary * 1.25;
            output = "Your salary " +userSalary+ " increased by 25% equals: " +increasedSalary;
            JOptionPane.showMessageDialog(null, output);
        }
    }
}
