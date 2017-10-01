public class Combinations{
      public static void main(String[] args) {
            int[] array = {1, 2,3,4,5,6,7,8,9,10};

            for (int i = 0; i < array.length - 1;i++ ) {
                  for (int j = i + 1; j < array.length ; j++ ) {
                        System.out.println(array[i] + " " + array[j]);
                  }
            }

            for (int i = array.length - 1; i >= 1 ; i-- ) {
                  for (int j = i - 1; j >= 0; j--) {
                        System.out.println(array[i] + " " + array[j]);
                  }
            }
      }
}
