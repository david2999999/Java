public class SumOfDiagonalOfMatrix{
      public static void main(String[] args) {
            int[][] matrix = {{1,2,3,4},
                                          {5,6,7,8},
                                          {9,10,11,12},
                                          {13,14,15,16}};

            int total = 0;

            for (int i = 0; i < matrix.length; i++) {
                  total += matrix[i][i];
            }

            System.out.println("Sum of the elements in the major diagonal is " + total);
      }
}
