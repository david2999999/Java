public class FindingNumber{
      public static void main(String[] args) {
            int number = 0;
            int numberFound;


            while (true){
                  if (Math.pow(number ,2) > 12000) {
                        numberFound = number;
                        break;
                  }
                  number++;
            }

            System.out.println("The smallest n value such that n^2 > 12000 is " + numberFound);
      }
}
