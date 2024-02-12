import java.util.Scanner;
public class square_number_checker {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int a;
        System.err.print("Enter a number: ");a = scan.nextInt();
        int divisor = 1;
        
        while (divisor * divisor <= a) {
            if (divisor * divisor == a) {
                System.out.println(a + " is a square number and it's root is " + divisor);   
            }
            divisor++;
        }
    }
}