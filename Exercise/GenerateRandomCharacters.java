public class GenerateRandomCharacters{
      public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                  System.out.print(randomCharacter('A','Z'));
                  if (i % 10 == 0) {
                        System.out.println();
                  }
            }
            System.out.println();
            for (int j = 1; j <= 100; j++) {
                  System.out.print(randomCharacter('0','9'));
                  if (j % 10 == 0) {
                        System.out.println();
                  }
            }
      }
      public static char randomCharacter(char c1, char c2){
            return (char)(c1 + Math.random() * (c2 - c1 + 1));
      }
}
