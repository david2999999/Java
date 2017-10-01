public class isPalindrome{
      public static boolean isPalindrome(int number){

            int reverseNumber = Reverse.reverse(number);

            if(reverseNumber == number)
                  return true;
            else
                  return false;
      }
}
