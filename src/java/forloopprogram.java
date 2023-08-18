import java.util.Scanner;

public class forloopprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("even number:");
        for(int i =1; i<=n;i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println("\n odd number:");
        for(int i =1; i<=n;i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
    }
}
