public class Calculatinge{
      public static void main(String[] args) {


            double eValue = 1;
            double itemValue = 1;
            int iValue = 10000;

            for (int i = 0; i < 10; i++ ) {
                  for (int j = 1; j <= iValue ; j++ ){
                        eValue = eValue + itemValue / j;
                        itemValue = itemValue / j;
                  }
                  System.out.println("The e value is for i = " + iValue + " is " + eValue);
                  iValue += 10000;
                  eValue = 1;
                  itemValue = 1;
            }
      }
}
