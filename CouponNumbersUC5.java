package com.bridgelabz.LogicalProblem;
import java.util.Scanner;
public class CouponNumbersUC5 {
    public static void main(String[] args) {
        char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max=100000000;
        int random=(int) (Math.random()*max);
        StringBuffer sc=new StringBuffer();

        while (random>0)
        {
            sc.append(chars[random % chars.length]);
            random /= chars.length;
        }
        String couponCode= sc.toString();
        System.out.println("coupon" +couponCode);
    }
}
