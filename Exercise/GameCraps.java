import java.util.*;

public class GameCraps{
      public static void main(String[] args) {
            Random random = new Random();
            int n1 = random.nextInt(6) + 1;
            int n2 = random.nextInt(6) + 1;
            int sum = n1 + n2;
            int overallSum = 0;

            System.out.println("You rolled " + n1 + " + " + n2 + " = " + sum);

            if( (sum == 2) || (sum == 3) || (sum == 12))
                  System.out.println("You Lose");
            else if ((sum == 7) || (sum == 11))
                  System.out.println("You Win");
            else if((sum == 4) || (sum == 5) || (sum == 6) || (sum == 8) || (sum == 9) || (sum == 10)){
                  System.out.println("Point is " + sum);
                  int n3 = random.nextInt(6) + 1;
                  int n4 = random.nextInt(6) + 1;
                  int sum2 = n3 + n4;
                  System.out.println("You rolled " + n3 + " + " + n4 + " = " + sum2);
                  while(true)
                        if(sum2 == 7){
                              System.out.println("You Lose");
                              break;
                        }else if(sum2 == sum){
                              System.out.println("You win");
                              break;
                        }
                        else{
                              n3 = random.nextInt(6) + 1;
                              n4 = random.nextInt(6) + 1;
                              sum2 = n3 + n4;
                              System.out.println("You rolled " + n3 + " + " + n4 + " = " + sum2);
                        }
            }
      }
}
