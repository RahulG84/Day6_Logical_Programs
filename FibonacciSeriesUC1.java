package com.bridgelabz.LogicalProblem;
import java.util.Scanner;
public class FibonacciSeriesUC1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter The Term of Fibonacci Series : ");
        int Term = Input.nextInt();
        int a=0, b=1;
        for (int i=1; i<=Term; i++){
            System.out.println(a);
            int c = a+b;
            a=b;
            b=c;
        }
    }
}
