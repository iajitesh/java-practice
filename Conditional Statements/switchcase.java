import java.util.*;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose your operator: + , - , * , / ");
        char c = sc.next().charAt(0);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();

        switch (c) {
            case '+':
                System.out.print(a + b);
                break;

            case '-':
                System.out.print(a - b);
                break;

            case '*':
                System.out.print(a * b);
                break;

            case '/':
                System.out.print(a / b);
                break;

            default:
                System.out.print("Invalid Input!");

        }
    }
}
