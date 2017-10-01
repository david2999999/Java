public class PalindromePrime{
      public static void main(String[] args) {
            int counter = 0;

            for (int i = 2; i < 1000; i++) {
                  if(isPalindromePrime(i)){
                        System.out.print(i + " ");
                        ++counter;

                        if(counter % 10 == 0)
                              System.out.println();
                  }
            }
      }

      public static boolean isPalindromePrime(int n){
            boolean isPrime = true;
            int reverseNumber = 0;
            int number = n;

            if(n == 1 || n == 0){
                  isPrime = false;
            }else{
                  for (int i = n - 1; i >=2 ; i--) {
                        if(n % i == 0) {
                              isPrime = false;
                              break;
                        }else
                              isPrime = true;
                  }
            }

            if(isPrime){
                  while( n != 0){
                        reverseNumber *= 10;
                        reverseNumber = reverseNumber + (n % 10);
                        n /= 10;
                  }
            }

            if( number == reverseNumber)
                  return true;
            else
                  return false;

      }
}
