public class MersennePrime{
      public static void main(String[] args) {
            int number = 2;
            System.out.println("p\t\t\t2^p - 1");
            
            while(true){
                  if(Prime.isPrime(number) && Prime.isPrime((int)Math.pow(2,number) - 1)){
                        if ((Math.pow(2,number) - 1) > 31){
                              break;
                        }
                        System.out.println(number + "\t\t\t" + (Math.pow(2,number) - 1));
                        ++number;
                  }else
                        ++number;
            }
      }
}
