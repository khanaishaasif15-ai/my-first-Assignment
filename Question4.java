import java.util.Scanner;

public class question4 {
    
    public static void main(String[] args) {
       
Scanner sc = new Scanner(System.in);

System.out.println("enter discounted selling price");
double discsp = sc.nextInt();

System.out.println("enter discount percentage");
double discp = sc.nextInt();

System.out.println("original selling price");
double calc = (discsp * 100) / (100 - discp) ;

System.out.println(calc);

sc.close();

    }
}
