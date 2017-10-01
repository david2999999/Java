public class CountingSingleDigits{
      public static void main(String[] args) {
            int counter = 0;
            int number;
            int[] numArray = new int[10];

            while(counter != 100){
                  number = (int)(Math.random() * 10);
                  ++numArray[number];
                  ++counter;
            }

            System.out.println("Digit\t\t\tOccurence");
            for (int i = 0; i < 10; i++) {
                  System.out.println(i + "\t\t\t" + numArray[i]);
            }

      }
}
