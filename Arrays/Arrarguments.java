package Arrays;

public class Arrarguments {

    public static void update(int marks[]) {
        int nonchangable = 15;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 2;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 1, 2, 3, 4 };
        int nonchangable = 5;
        update(marks);// call by reference

        System.out.println(nonchangable);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}