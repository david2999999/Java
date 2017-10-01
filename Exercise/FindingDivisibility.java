public class FindingDivisibility{
      public static void main(String[] args) {
            int counter = 0;
            int[] array = new int[100];
            int number = 100;

            while(number < 1000){
                  if( ((number % 5) == 0) && ((number % 6) == 0)){
                        array[counter++] = number;
                  }
                  ++number;
            }

            for (int i = 0; i < counter; i++ ) {
                  System.out.print(array[i] + "  ");
                  if (((i +1) % 10) == 0) {
                        System.out.println();
                  }
            }
      }
}
