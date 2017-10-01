public class UpperRightTriangle{
      public static void main(String[] args) {
            for (int i = 1; i < 8; i++) {
                  for (int j = 0; j < i - 1 ; j++ ) {
                        System.out.print("  ");
                  }

                  for (int j = 1; j < 8 - i   ; j++) {
                        System.out.print(j + " ");
                  }

                  System.out.println();
            }
      }
}
