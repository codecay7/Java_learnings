public class SeriesSumCalculator {
    private int n;
    private double totalSum;

    // Constructor
    public SeriesSumCalculator(int num) {
        n = num;
        calculateSum(); // Calculate the sum when an object is created
    }

    // Method to calculate the sum
    private void calculateSum() {
        totalSum = 0;

        for (int i = 1; i <= n; i++) {
            double term = (double) i / Math.pow(i + 1, 2);
            totalSum += term;
        }
    }

    // Getter for the sum
    public double getSum() {
        return totalSum;
    }

    public static void main(String[] args) {
        int n = 5;
        SeriesSumCalculator calculator = new SeriesSumCalculator(n); // Creating an object of SeriesSumCalculator
        double sum = calculator.getSum(); // Accessing the calculated sum using the getter
        System.out.println("The sum of the series is: " + sum);
    }
}
