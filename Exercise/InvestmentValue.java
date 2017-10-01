public class InvestmentValue{
      public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int year){
                  int numberOfMonthes = year * 12;

                  for (int i = 0; i < numberOfMonthes; i++) {
                        investmentAmount *= ( 1 + monthlyInterestRate);
                  }

                  return investmentAmount;
      }
}
