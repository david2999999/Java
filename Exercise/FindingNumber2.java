public class FindingNumber2{
      public static void main(String[] args) {
            int number = 0;
            int numberFound;

            while(true){
                  if (Math.pow(number, 3) > 12000) {
                        numberFound = number - 1;
                        break;
                  }
                  number ++;
            }

            System.out.println("The largest n such that n^3 < 12000 is " + numberFound );
      }
}
