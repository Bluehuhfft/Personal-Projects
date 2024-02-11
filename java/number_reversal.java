import java.util.Scanner;
public class number_reversal {
    public static void main(String[] args){
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: "); int user = scanner.nextInt();
        int rev = 0;

        while (user > 0) {
            int d = user % 10;
            rev = rev * 10 + d;
            user /= 10;


        }
        System.out.println("The reversed number is  " + rev);
    }
}
