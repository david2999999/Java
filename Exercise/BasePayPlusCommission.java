public class BasePayPlusCommission{
      public static void main(String[] args) {
            double basePay = 5000.00;
            double saleCommission = 250000.00;
            double commissionRate = .12;
            double saleAmount = saleCommission / .12;

            System.out.format("The base pay is %.2f and the sale amount is %.2f", basePay, saleAmount);
            System.out.println();
            System.out.format("The Sale amount should be %.2f to get a total of 30,000 in salary", saleAmount);

      }
}
