import javax.swing.JOptionPane;

public class AssigningGrades{
      public static void main(String[] args) {
            String numString = JOptionPane.showInputDialog("Enter the number of students: ");
            Integer number = Integer.parseInt(numString);

            int[] grades = new int[number];
            int counter = 0;
            int highestNum = 0;

            while(number != 0){
                  String gradeString = JOptionPane.showInputDialog("Enter the score of the student: ");
                  Integer grade = Integer.parseInt(gradeString);
                  grades[counter++] = grade;
                  --number;
            }

            for (int i = 0; i < counter ; i++) {
                  if(highestNum < grades[i])
                        highestNum = grades[i];
            }

            while(counter != 0){
                  System.out.format("Student %d score is %d and grade is %c", number, grades[number], grade(highestNum, grades[number++] ));
                  System.out.println();
                  --counter;
            }
      }

      public static char grade(int bestGrade, int studentGrade){
            if(studentGrade >= bestGrade - 10)
                  return 'A';
            else if(studentGrade >= bestGrade - 20)
                  return 'B';
            else if(studentGrade >= bestGrade - 30)
                  return 'C';
            else if(studentGrade >= bestGrade - 40)
                  return 'D';
            else
                  return 'F';
      }
}
