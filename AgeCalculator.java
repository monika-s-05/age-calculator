import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Age Calculator ===");

        try {
            System.out.print("Enter your birth year (YYYY): ");
            int year = sc.nextInt();

            System.out.print("Enter your birth month (1-12): ");
            int month = sc.nextInt();

            System.out.print("Enter your birth day (1-31): ");
            int day = sc.nextInt();

            LocalDate birthDate = LocalDate.of(year, month, day);
            LocalDate currentDate = LocalDate.now();

            if (birthDate.isAfter(currentDate)) {
                System.out.println("Invalid input! Birth date cannot be in the future.");
            } else {
                Period age = Period.between(birthDate, currentDate);
                System.out.println("\n🎉 Your Age Details:");
                System.out.println("Years: " + age.getYears());
                System.out.println("Months: " + age.getMonths());
                System.out.println("Days: " + age.getDays());
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter correct date values.");
        }

        sc.close();
    }
}
