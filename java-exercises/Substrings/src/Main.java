import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();

        System.out.println("Enter the start index: ");
        int start = sc.nextInt();
        System.out.println("Enter the end index: ");
        int end   = sc.nextInt();

        System.out.println(str.substring(start, end));

        sc.close();

    }
}