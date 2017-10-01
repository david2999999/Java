public class NumberOfPrime{
      public static void main(String[] args) {

            int counter = 0;

            for (int i = 2; i < 10000; i++) {
                  if(Prime.isPrime(i))
                        ++counter;
            }

            System.out.println("The amount of prime number less that 10000 is " + counter);
      }
}
