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
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        QuanLiDiem qld = new QuanLiDiem();
        
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            qld.addsv(x);
        }
        
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        int m = Integer.parseInt(sc1.nextLine());
        while(m-- > 0) {
            MonHoc x = new MonHoc(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine()));
            qld.addmh(x);
        }
        
        Scanner sc2 = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc2.nextLine());
        while(t-- > 0) {
            BangDiem x = new BangDiem(sc2.next(), sc2.next(), sc2.nextDouble());
            qld.adddiem(x);
        }
        
        sc2.nextLine();
        
        int q = Integer.parseInt(sc2.nextLine());
        while (q-- > 0) {            
//            String maMH = sc2.nextLine();
//            qld.inBangDiemTheoMon(maMH);
            String maLop = sc2.nextLine();
            qld.inBangDiemTheoLop(maLop);
        }
        
    }
}
