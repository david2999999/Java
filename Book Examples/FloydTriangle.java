import java.util.Scanner;

public class FloydTriangle{
      public static void main(String[] args){
            int n, num = 1, c , d;
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the number of rows of Floyd Triangle you want");
            n = input.nextInt();

            System.out.println("Floyd's triangle : -");

            for( c = 1; c <=n ; c++){
                  for (d = ; d <= c; d++){
                        System.out.print(num + "      ");
                        num++;
                  }

                  System.out.println();
            }
      }
}
