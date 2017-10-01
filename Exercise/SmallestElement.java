public class SmallestElement{
      public static void main(String[] args) {
            double[] array = {1.9 , 2.5, 3.7, 2, 1.5, 6 , 3, 4 , 5 , 2};
            System.out.println(min(array));
            System.out.println(indexOfSmallestElement(array));
      }

      public static double min(double[] array){
            double smallestValue = array[0];
            for (int i =0; i < array.length; i++) {
                  if(smallestValue > array[i])
                        smallestValue = array[i];
            }
            return smallestValue;
      }

      public static int indexOfSmallestElement(double[] array){
            double smallestValue = array[0];
            int smallestIndex = 0;
            for (int i =0; i < array.length; i++) {
                  if(smallestValue > array[i]){
                        smallestValue = array[i];
                        smallestIndex = i;
                  }

            }
            return smallestIndex;
      }
}
