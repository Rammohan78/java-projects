package asus;

import java.util.Scanner;

public class Fibonacci_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int n = sc.nextInt();
        int a=0, b=1;
        for(int i=0; i<n; i++){

            System.out.print(" "+a);
            int c = a+b;
            a = b;
            b = c;
        }
        sc.close();
    }
    
}
