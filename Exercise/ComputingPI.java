public class ComputingPI{
      public static void main(String[] args) {

            double sum = 0;
            int sign = 1;
            int iValue = 10000;

            for (int j = 0; j < 10; j++) {
                  for (int i = 1; i <= iValue; i++ ) {
                        sum = sum + sign * (1.0 / (2*i - 1));
                        sign = -sign;
                  }
                  System.out.println("The value of pi for i = " + iValue +  " is " + (4 * sum));
                  iValue += 10000;
                  sum = 0;
            }

      }
}
