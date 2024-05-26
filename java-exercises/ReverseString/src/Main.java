import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String reversed = new StringBuilder(str).reverse().toString();

        if(str.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();

    }
}