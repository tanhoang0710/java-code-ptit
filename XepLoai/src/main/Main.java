/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        DanhSach ds = new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            SinhVien x = new SinhVien(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            ds.add(x);
        }
        ds.show();
    }
    
}