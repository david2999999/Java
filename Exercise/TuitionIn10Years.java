public class TuitionIn10Years{
      public static void main(String[] args) {
            double tuition = 10000;

            for (int i = 0; i < 10; i++) {
                  tuition = tuition * 1.05;
            }

            System.out.format("In 10 years, the tuition will be %.2f.",tuition);
            System.out.println();

            double fourYearTuition = 0;
            for (int i = 0 ; i < 4; i++) {
                  fourYearTuition = fourYearTuition + tuition;
                  tuition = tuition * 1.05;
            }

            System.out.format("The price of 4 year tuition in 10 years from now is %.2f.", fourYearTuition);
      }
}
