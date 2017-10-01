import java.lang.*;

public class GenerateCapitalLetter2{
      public static void main(String[] args) {

            int randNumber = ((int)Math.floor(Math.random() * 101)) % 15;

            System.out.print("A random capital letter is : " + (char)(randNumber + 65));
      }
}
