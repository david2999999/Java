public class Emirp{
      public static void main(String[] args) {
            int counter = 0;
            int number = 2;
            int lineCounter = 0;

            while(true){
                  if((Palindrome.isEmirp(number)) && (Prime.isPrime(number)) && !(Palindrome.isPalindrome(number))){
                        System.out.print(number + " ");
                        ++counter;
                        ++lineCounter;
                        ++number;
                        if(lineCounter % 10 == 0)
                              System.out.println();

                        if (counter == 100) {
                              break;
                        }
                  }
                  else
                        ++number;

            }
      }
}
