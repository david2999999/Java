public class Matrix{
      public static void printMatrix(int n) {


            for (int i = 1; i <= Math.pow(n,2) ;i++ ) {
                  double number = Math.random();

                  if(number < .5)
                        number = 0;
                  else
                        number = 1;

                  System.out.format("%.0f ",number);

                        if (i % n == 0) {
                              System.out.println();
                        }
            }



      }
}
