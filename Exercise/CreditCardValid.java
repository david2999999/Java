import java.util.*;

public class CreditCardValid{
      public static void main(String[] args) {
            System.out.println(sumOfDoubleEvenPlace(4388576018402626L));
            System.out.println(sumOfOddPlace(4388576018402626L));
            System.out.println(getDigit(18));
            System.out.println(prefixMatched(4388576018402626L, 438857));
            System.out.println(getSize(43885760182626L));
            System.out.println(getPrefix(4388576018402626L,10));
            System.out.println(isValid(4388576018410707L));
      }

      public static boolean isValid(long number){
            int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
            if(sum % 10 == 0)
                  return true;
            else
                  return false;
      }

      public static int sumOfDoubleEvenPlace(long number){
            int arrayCounter = 0;
            int[] array = new int[16];
            int doubleValue = 0;
            int overallSum = 0;

            while(number > 0){
                  array[arrayCounter++] = (int)(number % 10);
                  number /= 10;
            }

            for (int i = 1;i < arrayCounter ; i+=2 ) {
                  doubleValue = getDigit(array[i] * 2);
                  overallSum += doubleValue;
            }
            return overallSum;
      }

      public static int getDigit(int number){
            int sum = 0;

            if(number >= 10){
                  sum = sum + number % 10;
                  number /= 10;
                  sum = sum + number % 10;
                  return sum;
            }
            else
                  return number;
      }

      public static int sumOfOddPlace(long number){
            int arrayCounter = 0;
            int[] array = new int[16];
            int overallSum = 0;

            while(number > 0){
                  array[arrayCounter++] = (int)(number % 10);
                  number /= 10;
            }

            for (int i = 0; i < arrayCounter; i+=2) {
                  overallSum += array[i];
            }

            return overallSum;
      }

      public static boolean prefixMatched(long number, int d){
            int arrayCounter = 0;
            int arrayCounter2 = 0;
            int[] array = new int[16];
            int[] array2 = new int[16];
            int overallSum = 0;
            boolean ispreFix = true;

            while(number > 0){
                  array[arrayCounter++] = (int)(number % 10);
                  number /= 10;
            }

            while(d > 0){
                  array2[arrayCounter2++] = d % 10;
                  d /= 10;
            }

            while(arrayCounter2 > 0){
                  if(array2[arrayCounter2 - 1] != array[arrayCounter - 1]){
                        ispreFix = false;
                        break;
                  }
                  else{
                        --arrayCounter;
                        --arrayCounter2;
                  }
            }

                  return ispreFix;
      }

      public static int getSize(long number){
            int arrayCounter = 0;
            int[] array = new int[16];
            int overallSum = 0;

            while(number > 0){
                  array[arrayCounter++] = (int)(number % 10);
                  number /= 10;
            }

            return arrayCounter;
      }

      public static long getPrefix(long number, int k){

            int arrayCounter = 0;
            int[] array = new int[16];
            long prefix = 0;
            long multiplier = (long)(Math.pow(10, k - 1));
            long noChangeNumber = number;

            while(number > 0){
                  array[arrayCounter++] = (int)(number % 10);
                  number /= 10;
            }

            if((k >= 12) || (k >= arrayCounter)){
                  return noChangeNumber;
            }else{
                  arrayCounter -= 1;
                  while(k != 0){
                              prefix += array[arrayCounter--] * multiplier;
                              multiplier /=10;
                              k -=1;
                  }
                  return prefix;
            }
      }
}
