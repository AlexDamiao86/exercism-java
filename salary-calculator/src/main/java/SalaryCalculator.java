public class SalaryCalculator {

    private static final double BASE_SALARY = 1000.00;
    private static final double MAX_SALARY = 2000.00;
    
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return (daysSkipped <= 5) ? 1 : 0.85;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return (productsSold <= 20) ? 10 : 13;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = BASE_SALARY * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold);
        return ( salary <= MAX_SALARY ) ? salary : MAX_SALARY;
    } 
}
