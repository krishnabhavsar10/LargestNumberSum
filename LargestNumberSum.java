import java.util.Scanner;

public class LargestNumberSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter three numbers:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            int largest = Math.max(num1, Math.max(num2, num3));
            System.out.println("The largest number is: " + largest);

            int sum = largest;
            System.out.println("The sum of the largest number is: " + sum);

            double average = (num1 + num2 + num3) / 3.0;
            System.out.println("The average of the three numbers is: " + average);

            System.out.println("The product of the three numbers is: " + (num1 * num2 * num3)); // Changes Made
        }
    }
}
