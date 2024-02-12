import java.util.Scanner;
public class divisibility_checker {

    static int check(int div, int did) {
        if (did % div == 0) {
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int divd, div;
        System.out.print("Enter the dividend: "); divd = scan.nextInt();
        System.out.print("Enter the divisor: "); div = scan.nextInt();

        int result = check(div, divd);

        if (result == 1){
            System.out.println(divd + " is divisible by " + div + " and the quotient is " + divd/div);

        }
        else {
            System.out.println("Not divisible");
        }

        
    }    
}
