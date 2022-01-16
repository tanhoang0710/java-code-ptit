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
public class Mian {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("BAITAP.in"));
        Scanner sc3 = new Scanner(new File("NHOM.in"));
        
        QLBTN q = new QLBTN();
        int n = Integer.parseInt(sc1.nextLine());
        int a = n;
        while(n-- > 0){
            SinhVien x = new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            q.addSV(x);
        }
        
        int m = Integer.parseInt(sc2.nextLine());
        for(int i = 1; i <= m; i++){
            BaiTap y = new BaiTap(sc2.nextLine(), i);
            q.addBT(y);
        }
        
        while(a-- > 0){
            Nhom z = new Nhom(sc3.next(), sc3.next());
            q.addN(z);
        }
        
        q.show();
    }
}
