import javax.swing.JOptionPane;

public class TicTacToe{
      public static void main(String[] args) {
            String rowString;
            String colString;
            Integer row ;
            Integer column ;
            String[][] board = {
                  {" "," "," "},
                  {" "," "," "},
                  {" "," "," "}
            };
            boolean gameOver = false;
            // player X will start first
            boolean playerX = true;
            //variables to see which player wins
            boolean xWin;
            boolean oWin;
            int gameCounter = 0;

            while(!gameOver){
                  if(playerX){
                        rowString = JOptionPane.showInputDialog("Enter a row (0, 1, or 2) for player X:");
                        row = Integer.parseInt(rowString);
                        colString = JOptionPane.showInputDialog("Enter a column (0, 1, or 2) for player X:");
                        column = Integer.parseInt(colString);
                        board[row][column] = "X";
                        playerX = !playerX;
                  }else{
                        rowString = JOptionPane.showInputDialog("Enter a row (0, 1, or 2) for player O:");
                        row = Integer.parseInt(rowString);
                        colString = JOptionPane.showInputDialog("Enter a column (0, 1, or 2) for player O:");
                        column = Integer.parseInt(colString);
                        board[row][column] = "O";
                        playerX = !playerX;
                  }
                  ++gameCounter;
                  printBoard(board);
                  xWin = anyWinner("X", board);
                  oWin = anyWinner("O", board);

                  if(xWin){
                        System.out.print("X player wins");
                        gameOver = true;
                  }
                  if(oWin){
                        System.out.print("O player wins");
                        gameOver = true;
                  }
                  if(gameCounter == 9){
                        System.out.print("It is a tie");
                        gameOver = true;
                  }
            }
      }

      public static void printBoard(String board[][]){
            System.out.println("-------------------");
            for (int i = 0; i < 3 ; i++ ) {
                  for (int j = 0; j < 3; j++) {
                              System.out.format("|  %s  ", board[i][j]);
                  }
                  System.out.print("|");
                  System.out.println();
                  System.out.print("-------------------");
                  System.out.println();
            }
      }

      public static boolean anyWinner(String player, String board[][]){
            boolean isWin = false;
            int counter = 0;
            // checks rows for the winner
            for (int i = 0; i < 3; i++) {
                  for (int j = 0; j < 3 ; j++) {
                        if(board[i][j] == player){
                              counter++;
                        }else{
                              counter = 0;
                        }
                  }
                  if(counter == 3)
                        return true;
                  counter = 0;
            }
            //checks columns for the winner
            for (int i = 0; i< 3; i++) {
                  for (int j = 0; j < 3 ; j++) {
                        if(board[j][i] == player){
                              counter++;
                        }else{
                              counter = 0;
                        }
                  }
                  if(counter == 3)
                        return true;
                  counter = 0;
            }

            if(((board[0][0] == player) &&(board[1][1] == player) &&(board[2][2] == player) ) || ((board[0][2] == player) &&(board[1][1] == player) &&(board[2][0] == player) )){
                  return true;
            }
            return false; // if everything fails
      }
}
