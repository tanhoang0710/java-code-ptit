/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlefraction;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HandleFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction f1 = new Fraction(sc.nextLong(), sc.nextLong());
        Fraction f2 = new Fraction(sc.nextLong(), sc.nextLong());
        Fraction res = f1.tinhTong(f2);
        System.out.println(res);
    }
}
