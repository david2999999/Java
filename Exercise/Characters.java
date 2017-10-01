public class Characters{
      public static void printChars(char ch1, char ch2, int numberPerLine) {

            int c1 = (int)ch1;
            int c2 = (int)ch2;

            int temp;
            int characterCount = 0;
            
            if(c1 > c2){
                  temp = c2;
                  c2 = c1;
                  c1 = temp;
            }

            for (int i = c1; i <= c2 ;i++ ) {
                  System.out.print((char)i + " ");
                  ++characterCount;

                  if(characterCount % numberPerLine == 0)
                        System.out.println();
            }
      }
}
