package MethodsorFunctions;

public class binarytodec {
    public static void binarytodecimal(int n){
int decimal = 0;
int pow = 0;

while(n>0){
     int rem = n % 10;
     decimal = decimal + (rem * (int)Math.pow(2,pow)); 
     pow++;
     n = n/10;
}
System.out.println(decimal);
    }
public static void main(String[] args) {
    binarytodecimal(101);
}

}
