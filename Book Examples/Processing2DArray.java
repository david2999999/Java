import java.util.Scanner;

public class Processing2DArray{
      public static void main (String[] args){
            int [][] matrix = new int [10][10];

            Scanner input = new Scanner(System.in);
            System.out.println("Enter " + matrix.length + " rows and " +
                  matrix[0].length + " columns :");

            // INITIALIZING 2D ARRAY USING INPUTS
            for (int row = 0; row < matrix.length; row++) {
                  for (int column = 0;  column < matrix[row].length; column++) {
                        matrix[row][column] = input.nextInt();
                  }
            }

            int[][] matrix2 = new int[10][10];

            //INITIALZING 2D ARRAY USING RANDOM METHOD
            for (int row = 0;  row < matrix2.length; row++) {
                  for (int column = 0; column < matrix2[row].length; column++) {
                        matrix2[row][column] = (int)(Math.random() * 100);
                  }
            }

            // DISPLAYING THE 2D ARRAY
            for (int row = 0 ; row < matrix2.length ; row++ ) {
                  for (int column = 0; column < matrix2[row].length ; column++ ) {
                        System.out.print(matrix2[row][column] + "  ");
                  }

                  System.out.println();
            }

            // FINDING THE TOTAL SUM OF THE 2D ARRY
            int total = 0;
            for(int row = 0; row < matrix.length ; row++){
                  for (int column = 0; column < matrix[row].length; column++) {
                        total += matrix[row][column];
                  }
            }

            // FINDING THE SUM OF THE column
            for (int column = 0; column < matrix2[0].length; column++) {
                  int totalColumn = 0;
                  for (int row = 0; row < matrix2[0].length; row++ ) {
                        totalColumn += matrix2[row][column];
                        System.out.println("Sum for column " + column + " is " + totalColumn);
                  }
            }


            // CHECKING WHICH ROW HAS THE GREATEST SUM OF VALUES
            int maxRow = 0;
            int indexOfMaxRow = 0;

            for(int column = 0; column < matrix[0].length; column++){
                  maxRow += matrix[0][column];
            }

            for(int row = 1; row  < matrix.length ; row++){
                  int totalOfThisRow = 0;
                  for (int column = 0; column < matrix[row].length; column++) {
                        totalOfThisRow += matrix[row][column];
                  }
                  if(totalOfThisRow > maxRow){
                        maxRow = totalOfThisRow;
                        indexOfMaxRow = row;
                  }
            }

            System.out.println("Row" + indexOfMaxRow + "has the maximum sum of "+ maxRow);


            // RANDOM SHUFFLING OF 2D ARRAY
            for (int i = 0;  i < matrix.length; i++) {
                  for (int j = 0; j < matrix[i].length; j++) {
                        int i1 = (int)(Math.random() * matrix.length);
                        int j1 = (int)(Math.random() * matrix.length);

                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i1][j1];
                        matrix[i1][j1] = temp;
                  }
            }
      }
}
