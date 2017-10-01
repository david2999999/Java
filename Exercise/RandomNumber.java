public class RandomNumber{
      public static void main(String[] args) {
            getRandom(2,3,4);
      }

      public static void getRandom(int... numbers){
            int[] x = new int[100];
            int counter = 0;
            boolean inArray = true;

            for (int number : numbers ) {
                  x[counter++] = number;
            }

            int randomNumber = 1 + (int)(Math.random() * 54);

            while(inArray){
                  inArray = false;
                  for (int i = 0; i < x.length; i++) {
                        if(randomNumber == x[i]){
                              randomNumber = 1 + (int)(Math.random() * 54);
                              inArray = true;
                              break;
                        }
                  }
            }

            System.out.println(randomNumber);
      }
}
