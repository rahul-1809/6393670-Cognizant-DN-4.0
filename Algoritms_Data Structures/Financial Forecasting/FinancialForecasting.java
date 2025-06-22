public class FinancialForecasting {

    public static double calculateFutureValue(double presentValue, double annualRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        // Apply compound growth for each year
        return calculateFutureValue(presentValue * (1 + annualRate), annualRate, years - 1);
    }

    public static void main(String[] args) {
        double initialAmount = 10000.0; 
        double growthRate = 0.06;       
        int forecastYears = 4;          
        double futureAmount = calculateFutureValue(initialAmount, growthRate, forecastYears);
        System.out.printf("Estimated future value after %d years: ₹%.2f%n", forecastYears, futureAmount);
    }
}
