package com.bridgelabz.LogicalProblem;
import java.util.Scanner;
public class PerfectNumberUC2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = Input.nextInt();
        int sum = 0;
        for (int i=1; i<n; i++){
            if (n%i == 0){
                sum = sum+i;
                //System.out.println(sum);
            }
        }if (sum == n){
            System.out.println(n+ " is Perfect Number");
        }else {
            System.out.println(n+ " is Not Perfect Number");
        }
    }
}
