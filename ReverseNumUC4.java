package com.bridgelabz.LogicalProblem;
import java.util.Scanner;
public class ReverseNumUC4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Any Value : ");
        int n = Input.nextInt();
        int r;
        while (n>0){
            r=n%10;
            System.out.print(r);
            n=n/10;
        }
    }
}
