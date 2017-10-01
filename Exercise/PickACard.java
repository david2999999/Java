import javax.swing.JOptionPane;

public class PickACard{
      public static void main(String[] args) {
            String numString = JOptionPane.showInputDialog("Pick a number from 0 to 51, each represent one card: ");
            Integer number = Integer.parseInt(numString);

            String suit;
            String[] card = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen","King"};

            String cardPicked = card[(number) % 13];

            switch(number / 13){
                                    case 0: suit = "Clubs";
                                                break;
                                    case 1: suit = "Diamonds";
                                                break;
                                    case 2: suit =  "Hearts";
                                                break;
                                    case 3: suit = "Spades";
                                                break;
                                    default : suit = "Error";
                                                break;
                              }
            if(suit != "Error")
                  System.out.print("The card you picked is " + cardPicked + " of " + suit);
            else
                  System.out.print("Enter the right number please.");
      }
}
