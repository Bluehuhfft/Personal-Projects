import java.util.Scanner;
public class palindrome_from_x_to_y {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int s,st,rev,temp,r;
        System.err.print("Enter the start number: "); s = scan.nextInt();
        System.err.print("Enter the end number: "); st = scan.nextInt();

        while (s < st) {
            temp = s;
            rev = 0;
            while (temp > 0) {
                r = temp%10;
                rev = rev * 10 + r;
                temp/=10;
            }
            if (rev == s) {
                System.err.println(s);
            }
            s++;
        }
    }
    
}
