import java.util.Scanner;

public class inputEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n = sc.nextInt();
        System.out.println("Enter second  number ");
        int m = sc.nextInt();

        int add = n  + m;
        System.out.println("addition ="+add);

        int sub = n - m;
        System.out.println("subtraction ="+sub);

        int mul = n * m;
        System.out.println("multiplication ="+mul);

        int div = n / m;
        System.out.println("Division="+div);
    }
}
