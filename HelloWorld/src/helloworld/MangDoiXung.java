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
public class MangDoiXung {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t > 0) {
            t--;
            int n;
            n = sc.nextInt();
            int a[] = new int[n];
            int tmp[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                tmp[n-i-1] = a[i];
            }
            int check = 0;
            for (int i = 0; i < n; i++) {
                if(a[i] != tmp[i]){
                    check = 1;
                    break;
                }
            }
            if(check == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
