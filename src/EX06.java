import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int A = scanner.nextInt();
        int temp = A;
        System.out.println("Digite outro número: ");
        int B = scanner.nextInt();
        scanner.nextLine();
        A = B;
        B = temp;
        System.out.println(A);
        System.out.println(B);
    }
}
