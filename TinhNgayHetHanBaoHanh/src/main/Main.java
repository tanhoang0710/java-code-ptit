/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Scanner sc = new Scanner(new File("MUAHANG.in"));
            MuaHang mh = new MuaHang();
            int n = Integer.parseInt(sc.nextLine());
            while(n-- > 0) {
                SanPham x = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine());
                mh.addSP(x);
            }
            int m = Integer.parseInt(sc.nextLine());
            for (int i = 1; i <= m; i++) {
                KhachHang x = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine());
                mh.addKH(x);
            }
            mh.show();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
    }
    
}
