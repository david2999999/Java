import java.util.*;

public class TwinPrime{
      public static void main(String[] args) {
            int[] primeNumbers = new int[200];
            int arrayCounter = 0;

            for (int i = 2; i < 1000; i++) {
                  if(Prime.isPrime(i) == true)
                        primeNumbers[arrayCounter++] = i;
            }

            for (int i = 0; i < arrayCounter - 1; i++) {
                  for (int j = i + 1; j < arrayCounter ;j++ ) {
                        if(Math.abs(primeNumbers[i] - primeNumbers[j]) == 2)
                              System.out.println("(" + primeNumbers[i] + ", " + primeNumbers[j] + ")");
                  }
            }
      }
}
