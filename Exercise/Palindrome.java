public class Palindrome{
      public static boolean isPalindrome(int n){
            int number = n;
            int reverseNumber = 0;

                  while( n != 0){
                        reverseNumber *= 10;
                        reverseNumber = reverseNumber + (n % 10);
                        n /= 10;
                  }


            if( number == reverseNumber)
                  return true;
            else
                  return false;

      }

      public static boolean isEmirp(int n){
            int number = n;
            int reverseNumber = 0;

                  while( n != 0){
                        reverseNumber *= 10;
                        reverseNumber = reverseNumber + (n % 10);
                        n /= 10;
                  }


            if(Prime.isPrime(reverseNumber) == true)
                  return true;
            else
                  return false;
      }
}
