import java.util.Scanner;

public class GreatestCommonDivisor {
      public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first integer:  ");
            int n1 = input.nextInt();
            System.out.print("Enter 2nd integer:  ");
            int n2 = intput.nextInt();

            int gcd = 1;
            int k = 2;

            while(k <= b1 && k <= n2){
                  if(n1 % k == 0 && n2 % k == 0)
                        gcd = k;
                  k++;
            }

            System.out.println("The greatest common divisor for" + n1 + "and " + n2 + "is" + gcd);

      }
}
