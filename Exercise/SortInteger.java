public class SortInteger{
      public static void displaySortedNumbers(double num1, double num2,  double num3) {
            double[] numArray = {num1, num2, num3};
            double tempValue;

            for (int i = 0; i < 2  ; i++ ) {
                  for (int j = i + 1; j < 3 ; j++) {
                        if(numArray[i] > numArray[j]){
                              tempValue = numArray[j];
                              numArray[j] = numArray[i];
                              numArray[i] = tempValue;
                        }
                  }
            }

            for (int i = 0 ; i < numArray.length; i++) {
                  System.out.print(numArray[i] + " ");
            }
      }
}
