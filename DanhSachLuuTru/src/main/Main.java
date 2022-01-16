/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        DanhSach ds =new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            Khach x = new Khach(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(x);
        }
        ds.show();
    }
}
