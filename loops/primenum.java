package loops;
import java.util.*;
public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 System.out.print("Enter the number: ");
 int num = sc.nextInt();

boolean isPrime = true;

for(int i = 2; i <= num - 1; i++) {
    if(num % i == 0) {   // n is a multiple of i
        isPrime = false;
    }
}

if(isPrime == true) {
    System.out.println("n is prime");
} else {
    System.out.println("n is not prime");
}

    }
}
