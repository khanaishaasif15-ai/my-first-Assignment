import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter obtained marks: ");
        double obtainedMarks = input.nextDouble();

        System.out.print("Enter maximum marks: ");
        double maximumMarks = input.nextDouble();

        if (maximumMarks <= 0) {
            System.out.println("Maximum marks must be greater than zero.");
        } else {
            double percentage = (obtainedMarks / maximumMarks) * 100;
            System.out.printf("Percentage: %.2f%%\n", percentage);
        }

        input.close();
    }
}
