package MethodsorFunctions;

public class methodovl {
        
        public static int sum(int a, int b){
             
            return a+b;
        }

        public static int sum(int a, int b, int c){
             
            return a+b+c;
        }


        public static void main(String[] args) {
         
        int sum1 = sum(5, 10);
        int sum2 = sum(5, 10, 15);

        System.out.println(sum1);
        System.out.println(sum2);

        }
    
}
