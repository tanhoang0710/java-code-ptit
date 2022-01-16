/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Sum {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t>0) {
            t--;
            long n;
            n = sc.nextLong();
            long sum = (n * (n + 1) / 2);
            System.out.println(sum);
        }
    }
}
