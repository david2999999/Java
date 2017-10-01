public class DisplayPattern{
      public static void displayPattern(int n){
            int k = 1;

            while(n > 0){
                  for (int i = n; i > 0; i-- )
                        System.out.print("   ");

                  for (int j = k; j > 0  ; j-- )
                        System.out.print(j + "  ");

                  ++k;
                  --n;
                  System.out.println();
            }

      }
}
