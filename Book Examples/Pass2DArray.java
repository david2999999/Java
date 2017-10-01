import java.util.Scanner;

public class Pass2DArray{
      public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            int [][] m = new int [3][4];
            System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns");
            for (int i = 0; i < m.length; i++)
                  for (int j = 0; j < m[0].length; j++ )
                        m[i][j] = input.nextInt();

            System.out.println("\n Sum of all elements is sum(m)");
      }

      public static int sum(int[][] m){
            int total = 0;
            for (int row = 0; row < m.length; row++){
                  for (int columns = 0; columns < m[row].length; columns++) {
                        total += m[row][columns];
                  }
            }
            return total;
      }
}
