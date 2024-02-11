import java.util.Scanner;
public class multiplication_table {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int mpd,mpdb,mpdt;
        System.out.print("Enter the number which you want to multiply: ");mpd = scan.nextInt();
        System.out.print("Enter the number which you want to multiply till: ");mpdt = scan.nextInt();

        mpdb = 0;

        while (mpdb < mpdt) {
            System.out.println(mpd + " X " + mpdb + " = " + (mpd * mpdb));
            mpdb++;
        }
    }    
}
