import java.lang.*;

public class Lottery2{
      public static void main(String[] args) {
            int digit1 = (int)Math.floor(Math.random() * 10);
            int digit2 = (int)Math.floor(Math.random() * 10);

            while(digit1 == digit2)
                  digit2 = (int)Math.floor(Math.random() * 10);

            System.out.println(digit1 + "" + digit2);
      }
}
