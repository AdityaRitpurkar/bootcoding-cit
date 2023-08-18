import java.util.Scanner;

public class ifElse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n = sc.nextInt();
        System.out.println("Enter second  number ");
        int m = sc.nextInt();
        if(n == m) {
            System.out.println("Number are same !");
        }else{
            System.out.println("number are different !");

        }

    }
}
