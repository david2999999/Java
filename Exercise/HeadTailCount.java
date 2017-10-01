public class HeadTailCount{
      public static void main(String[] args) {
            int headCount = 0;
            int tailCount = 0;


            for (int i = 0; i < 1000000; i++) {
                  if(Math.random() < .5)
                        ++tailCount;
                  else
                        ++headCount;
            }

            System.out.println("The amount of heads is " + headCount + " and the amount of tail count is " + tailCount);
      }
}
