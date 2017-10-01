public class PerfectNumber{
      public static void main(String[] args) {

            for (int i = 1; i < 10000; i++) {
                  if(isPerfect(i) == true)
                        System.out.println(i);
            }
      }

      public static boolean isPerfect(int number){
            int sum = 0;

            for (int i = 1; i < number; i++) {
                  if (number % i == 0)
                        sum = sum + i;
            }

            if(sum == number)
                  return true;
            else
                  return false;
      }
}
