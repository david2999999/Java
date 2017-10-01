public class Prime{
      public static boolean isPrime(int number){
            boolean prime = true;
            if(number == 1 || number == 0)
                  return false;
            else{
                  for (int i = 2; i < number;i++ ) {
                        if(number % i == 0)
                              prime = false;
                  }
            }

            return prime;
      }
}
