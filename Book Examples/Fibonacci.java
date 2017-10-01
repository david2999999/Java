public class Fibonacci{
      public static void main(String[] args){
            int current, previous = 1, previousPrevious = 0;
            for(int i = 0; i < 20; i ++){
                  current = previous + previousPrevious;
                  System.out.print(current + "  ");
                  previousPrevious = previous;
                  previous = current;
            }

            System.out.println();
      }
}
