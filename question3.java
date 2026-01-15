import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter original selling price: ");
        double originalPrice = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        String discountInput = input.next();

        discountInput = discountInput.replace("%", "");
        double discountPercentage = Double.parseDouble(discountInput);

        double discountAmount = (originalPrice * discountPercentage) / 100;
        double discountedPrice = originalPrice - discountAmount;

        System.out.printf("Discounted Selling Price: %.2f\n", discountedPrice);

        input.close();
    }
}
   