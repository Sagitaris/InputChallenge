import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        boolean validData = false;
        int number;
        int sum = 0;
        long avg = 0;
        int counter = 0;

        while (true) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                sum += number;
                counter++;
                validData = true;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if (counter > 0) {
            avg = Math.round((double) sum / counter);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
