import javax.swing.JOptionPane;

public class RockPaperScissor{
      public static void main(String[] args) {

            int computerWin = 0;
            int playerWin = 0;

            while( (computerWin != 3) && (playerWin != 3)){
                  String numString = JOptionPane.showInputDialog("Enter a number (0 for scissor) (1 for rock)(2 for paper ): ");
                  Integer number = Integer.parseInt(numString);
                  if((number > 2) || (number < 0) ){
                        System.out.println("Only numbers 0 , 1 , or 2 is allowed.");
                        System.exit(0);
                  }

                  int comNumber = (int)(Math.floor(Math.random() * 10));

                  while (comNumber > 2)
                        comNumber = (int)(Math.floor(Math.random() * 10));

                  if(comNumber == number){
                        System.out.println("The Player choose " + number);
                        System.out.println("The computer choose " + comNumber);
                        System.out.println("No one wins");
                  }
                  if(comNumber != number){
                        System.out.println("The Player choose " + number);
                        System.out.println("The Computer choose " + comNumber);
                        if ((number ==2) && (comNumber == 0)) {
                              System.out.println("Computer wins");
                              ++computerWin;
                              continue;
                        }else if((number == 0) && (comNumber ==2)){
                              System.out.println("Player wins");
                              ++playerWin;
                              continue;
                        }else if (number > comNumber){
                              System.out.println("Player wins");
                              ++playerWin;
                              continue;
                        }
                        else{
                              System.out.println("Computer wins");
                              ++computerWin;
                              continue;
                        }
                  }
            }
      }
}
