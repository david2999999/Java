import java.util.*;

public class Multiply2Matrix{
      public static void main(String[] args) {
            double[] num = {1,2,3,4,5,6,7,8,9};
            double[] num2 = {0, 2 , 4 ,1 , 4.5, 2.2, 1.1 , 4.3, 5.2};
            int counter = 0;

            double[][] matrix = new double[3][3];
            double[][] matrix2 = new double[3][3];
            double[][] productMatrix = new double[3][3];

            for (int i = 0; i < 3; i++) {
                  for (int j = 0; j < 3; j++) {
                        matrix[i][j] = num[counter];
                        matrix2[i][j] = num2[counter];
                        ++counter;
                  }
            }

            for (int i = 0; i < 3; i++) {
                  for (int j = 0; j < 3; j++ ) {
                        productMatrix[i][j] = (matrix[i][0] * matrix2[0][j]) + (matrix[i][1] * matrix2[1][j]) + (matrix[i][2] * matrix2[2][j]);
                  }
            }

            System.out.println("Matrix1 = " + Arrays.deepToString(matrix));
            System.out.println("Matrix2 =" + Arrays.deepToString(matrix2));
            System.out.println("The product of the two matrix is " + Arrays.deepToString(productMatrix));

      }
}
