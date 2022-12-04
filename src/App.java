import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o número: ");
        int num = sc.nextInt();
        sc.close();
        certifica(num);

    }

    public static void certifica(int num) {
        if (num <= 0) {
            System.out.print("\nN = Negativo");
        } else {
            System.out.print("\nP = Positivo");
        }
    }
}
