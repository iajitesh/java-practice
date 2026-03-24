package Arrays;
import java.util.*;
public class arraysbasics {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //create
    int marks[] = new int[50];
    //int numbers[] = {1, 2, 3, 4};
    //String fruits[] = {"mango", "apple"};

    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();

    marks[2] = 100;
    marks[1] = marks[1] + 1;

    System.out.println(marks.length);

    System.out.println("phy: "+ marks[0]);
    System.out.println("Chem: "+ marks[1]);
    System.out.println("Maths: "+ marks[2]);

    

        
    }
    
}
