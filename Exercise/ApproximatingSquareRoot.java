public class ApproximatingSquareRoot{
      public static void main(String[] args) {
            double nextGuess;
            double lastGuess = 1;
            double num = 21;

            while(true){
                  nextGuess = (lastGuess + (num / lastGuess)) / 2;

                  if(Math.abs(nextGuess - lastGuess) < 0.0001)
                        break;

                  lastGuess = nextGuess;
            }

            System.out.println("The closest square root is " + nextGuess);
      }
}
