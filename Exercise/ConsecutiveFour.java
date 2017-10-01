public class ConsecutiveFour{
      public static void main(String[] args) {
            int[] array = {2,2,2,5,6,6,6,6,7,8,9,10};
            System.out.println(isConsecutiveFour(array));
      }

      public static boolean isConsecutiveFour(int[] values){
            int counter = 0;

            for (int i = 0; i < values.length - 1; i++) {
                  if (values[i] == values[i + 1]) {
                        ++counter;
                  }else
                        counter = 0;

                  if(counter == 3)
                        return true;
            }

                  return false;
      }
}
