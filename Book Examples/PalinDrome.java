import java.util.*;

public class Palindrome{
      public static void main(String[] args){
            String original, reverse = "";
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a string toc heck if its a palindrome");
            original = input.nextLine;

            int length = original.length();

            for(int i = length - 1; i >= 0; i --)
                  reverse = reverse + original.charAt(i);

            if(original.equals(reverse))
                  System.out.println("Entered string is a palindrome.");
            else
                  System.out.println("Entered static is not a palindrome.");
      }
}
