public class PrintingASCII{
      public static void main(String[] args) {
            // 33 - 126

            int number = 33;
            int nextLineCounter = 0;

            while(number < 127){
                  System.out.print((char)number + " ");
                  ++number;
                  ++nextLineCounter;

                  if (nextLineCounter % 10 == 0) {
                        System.out.println();
                  }
            }
      }
}
