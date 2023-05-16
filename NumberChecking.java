import java.util.Scanner;
public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of M");
        int M = sc.nextInt();
        if (M % 3 == 0 && M % 5 == 0) {
            System.out.println("Good Number");
        } else if (M % 3 == 0 && M % 5 != 0) {
            System.out.println("Bad Number");
        } else if (M % 3 != 0 && M % 5 == 0) {
            System.out.println("Poor Number");
        } else {
            System.out.println("-1");
        }
    }
}

