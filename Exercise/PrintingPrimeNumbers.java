public class PrintingPrimeNumbers{
      public static void main(String[] args) {

            int[] primeArray = new int[300];
            int counter = 0;

            for (int i = 2; i <= 1000 ;i++ ) {
                  if (primeNumber(i) != 0) {
                        primeArray[counter++] = primeNumber(i);
                  }
            }

            for (int i = 0; i < counter; i++) {
                  System.out.print(primeArray[i] + " ");

                  if ((i + 1) % 8 == 0) {
                        System.out.println();
                  }
            }
      }

      public static int primeNumber(int number){
             boolean isPrime = true;

             if (number == 2) {
                   return number;
            }else{
                  for (int i = 2; i < number ; i++ ) {
                        if((number % i) == 0)
                              isPrime = false;
                  }
            }

            if (isPrime == true)
                  return number;
            else
                  return 0;

       }
}
