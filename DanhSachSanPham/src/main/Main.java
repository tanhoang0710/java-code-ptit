/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        List<SanPham> ds =new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            SanPham x = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine());
            ds.add(x);
        }
        Collections.sort(ds);
        for (SanPham d : ds) {
            d.show();
        }
    }
}
