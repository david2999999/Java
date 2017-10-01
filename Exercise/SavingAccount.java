public class SavingAccount{
      public static void main(String[] args) {
            final double MONTHLY_INTEREST_RATE = .05 /12;
            final int NUMBER_OF_YEARS = 3;

            double savings = 100;
            double accountValue = 0;
            for (int i = 0; i < NUMBER_OF_YEARS; i++) {
                  accountValue = (accountValue + savings) * (1 + MONTHLY_INTEREST_RATE);
            }

            System.out.print("The amount in the account after " + NUMBER_OF_YEARS + " years is ");
            System.out.format("%.3f", accountValue);

      }
}
