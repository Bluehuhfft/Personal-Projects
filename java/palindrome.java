import java.util.Scanner;
public class palindrome {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");int e = scan.nextInt();
    int temp, rev;
    temp = e;
    rev = 0;        
    while (temp>0){
        int r = temp %10;
        
        rev = rev*10+r;
        temp/=10;
    }
    if (rev == e) {
        System.out.println(e+" is a palindrome number.");
    } else {
        System.err.println("Not a palindrome number.");
    }
    }
}
