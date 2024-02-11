import java.util.Scanner;
public class tech_number_checker {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int s,st,temp,hf1,hf2,sum, l; String str;
        System.out.print("Enter the starting number: ");s = scan.nextInt();
        System.out.print("Enter the stopping number: ");st = scan.nextInt();

        while (s < st) {
            temp = s;
            str = String.valueOf(temp);
            l = str.length();
            hf1 = Integer.valueOf(str.substring(0, l/2));
            hf2 = Integer.valueOf(str.substring(l/2));
            sum = (hf1 + hf2) * (hf1 + hf2);

            if (sum == s) {
                System.out.println(s);
            }
            s++;
        }
    }    
}
