public class ComputingGCD{
      public static void main(String[] args) {
            System.out.println(gcd(12,9,6));
      }
      public static int gcd(int... numbers){
            int[] x = new int[100];
            int counter = 0;

            for (int number : numbers ) {
                  x[counter++] = number;
            }

            int lowestNumber = x[0];
            for (int i = 0; i < counter ; i++ ) {
                  if(lowestNumber > x[i])
                        lowestNumber = x[i];
            }


            int gcd = 1;
            int[] gcdArray = new int[lowestNumber];
            int counter2 = 0;
            int j = 0;
            while(gcd <= lowestNumber){
                  j = 0;
                  for (int i = 0; i < counter ;i++ ) {
                        if(x[i] % gcd != 0){
                              break;
                        }
                        j++;
                  }

                  if(j == (counter))
                        gcdArray[counter2++] =  gcd++;
                  else{
                        ++gcd;
                  }
            }
            return gcdArray[counter2 - 1];
      }
}
