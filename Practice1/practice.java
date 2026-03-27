import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int r, sum = 0, temp = num;
        while (num > 0)
            ;
        {
            r = num % 10;
            sum += r * r * r;
            num = num / 10;
        }

        if (sum == temp) {
            System.out.println("It is a Armstrong number!");
        } else {
            System.out.println("It is not a Armstrong number!");
        }
    }
}
