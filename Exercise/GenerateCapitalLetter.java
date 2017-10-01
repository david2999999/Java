import java.lang.*;

public class GenerateCapitalLetter{
      public static void main(String[] args) {
            long number = (System.currentTimeMillis() % 15) + 65 ;

            System.out.println("Random capital case Letter : " + (char)number);
      }
}
