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
        Scanner sc = new Scanner(new File("THISINH.in"));
        DanhSach ds = new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            ThiSinh x = new ThiSinh(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            ds.add(x);
        }
        ds.show();
    }
    
}
