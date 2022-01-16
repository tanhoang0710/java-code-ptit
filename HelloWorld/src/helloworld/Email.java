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
public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        s = s.trim().toLowerCase();
        String res = "";
        String[] wordArr = s.split("\\s+");
        res += wordArr[wordArr.length - 1];
        for (int i = 0; i < wordArr.length - 1; i++) {
            res += wordArr[i].charAt(0);
        }
        res += "@ptit.edu.vn";
        System.out.println(res);
    }
}
