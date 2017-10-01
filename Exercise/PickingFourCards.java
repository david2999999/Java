import java.util.*;

public class PickingFourCards{
      public static void main(String[] args) {
            int[] array = {1, 1 ,1 ,1};
            int sum = 0;

            boolean isDistinct = false;
            A: while(!isDistinct){
                  for (int i = 0; i < array.length-1 ;i++ ) {
                        for (int j = i + 1; j < array.length ;j++ ) {
                              if(array[i] == array[j]){
                                    array[i] =0 + (int)(Math.random() * 51);
                                    isDistinct = false;
                                    continue A;
                              }
                        }
                  }
                  isDistinct = true;
            }

            for (int i = 0; i < array.length; i++) {
                  sum += cardValue(cardName(array[i]));
            }
            for (int i = 0; i < array.length;i++ ) {
                  System.out.println(cardName(array[i]) + " of " + suit(array[i]) + " ");
            }
            System.out.println();
            System.out.println("The sum is " + sum);
}

      public static String cardName(int number){
            if(number > 51)
                  System.exit(0);

            String cardType = "No such Card";

            int num = number % 13;
            switch (num) {
                  case 0:
                        cardType = "Ace";
                        break;
                  case 1:
                        cardType = "2";
                        break;
                  case 2:
                        cardType = "3";
                        break;
                  case 3:
                        cardType = "4";
                        break;
                  case 4:
                        cardType = "5";
                        break;
                  case 5:
                        cardType = "6";
                        break;
                  case 6:
                        cardType = "7";
                        break;
                  case 7:
                        cardType = "8";
                        break;
                  case 8:
                        cardType = "9";
                        break;
                  case 9:
                        cardType = "10";
                        break;
                  case 10:
                        cardType = "Jack";
                        break;
                  case 11:
                        cardType = "Queen";
                        break;
                  case 12:
                        cardType = "King";
                        break;
            }

            return cardType;
      }
      public static String suit(int number){
            if(number > 51)
                  System.exit(0);

            int num = number / 13;
            String cardSuit = "No such Card";

            switch (num) {
                  case 0:
                        cardSuit = "Diamond";
                        break;
                  case 1:
                        cardSuit =  "Clover";
                        break;
                  case 2:
                        cardSuit = "Heart";
                        break;
                  case 3:
                        cardSuit = "Spade";
                        break;
            }

            return cardSuit;
      }
      public static int cardValue(String card){
            int cardType = 0;
            switch (card) {
                  case "Ace":
                        cardType = 1;
                        break;
                  case "2":
                        cardType = 2;
                        break;
                  case "3":
                        cardType = 3;
                        break;
                  case "4":
                        cardType = 4;
                        break;
                  case "5":
                        cardType = 5;
                        break;
                  case "6":
                        cardType = 6;
                        break;
                  case "7":
                        cardType = 7;
                        break;
                  case "8":
                        cardType = 8;
                        break;
                  case "9":
                        cardType = 9;
                        break;
                  case "10":
                        cardType = 10;
                        break;
                  case "Jack":
                        cardType = 11;
                        break;
                  case "Queen":
                        cardType = 12;
                        break;
                  case "King":
                        cardType = 13;
                        break;
            }

            return cardType;
      }
}
