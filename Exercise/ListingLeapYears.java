public class ListingLeapYears{
      public static void main(String[] args) {

            int counter = 0;

            for (int i = 2001; i <=2100; i++) {

                  if ((((i % 4) == 0) || ((i % 400) == 0)) && ((i % 100) != 0)){
                        System.out.print(i + " ");
                        ++counter;
                        if(counter % 10 == 0)
                              System.out.println("");
                  }
            }
      }
}
