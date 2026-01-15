import java.util.Scanner;

public class Question7 
{
    public static void main(String[] args)
     {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int num = read.nextInt();
        
        if (num % 2 == 0)
        System.out.println("Even"); 
        else 
        System.out.println("Odd");   
    }
}
