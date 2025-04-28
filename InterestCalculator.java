class InterestCalculator {

    void calculateInterest() {
        double principalAmount = 1200.00; // Initial amount
        double interestRate = 3.0;        // Interest rate in percentage

        System.out.println("Initial Amount: " + principalAmount);

        // Calculate amount after 1 year
        principalAmount *= (1 + interestRate / 100);
        System.out.println("Amount after 1 year: " + principalAmount);

        // Calculate amount after 2 years
        principalAmount *= (1 + interestRate / 100);
        System.out.println("Amount after 2 years: " + principalAmount);
    }

    public static void main(String[] args) {
        InterestCalculator calculator = new InterestCalculator();
        calculator.calculateInterest();
    }
}