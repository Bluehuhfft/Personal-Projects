import java.util.Scanner;
public class tech_number_check {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int e,f,g;
        System.err.print("Enter a number with even number of digits: ");e = scan.nextInt();
        String st = String.valueOf(e);   
        int l = st.length();
        f = Integer.valueOf(st.substring(0,l/2));
        g = Integer.valueOf(st.substring(l/2));      
        int sum = (f+g) * (f+g);
        if (sum == e) {
            System.out.println(e + " is a tech number.");
        } else {
            System.out.println(e+ " is not a tech number.");
        }
    }
}
