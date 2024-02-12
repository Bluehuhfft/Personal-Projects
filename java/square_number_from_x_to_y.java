import java.util.Scanner;
public class square_number_from_x_to_y {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int s, st, div;
        System.out.print("Enter the starting number: "); s = scan.nextInt();
        System.out.print("Enter the ending number: "); st = scan.nextInt();
        while (s <= st) {
            div = 1;
            while (div * div <= s) {
            if (div * div == s) {
                System.out.println(s + " -> " + div + "^2");
            }
            div++;
        }
            s++;
        }
    }
}
