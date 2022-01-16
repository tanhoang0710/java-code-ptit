/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgiochuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author DELL
 */
public class TinhGioChuan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MONHOC.in"));
        DanhSachGiangVien ds1 = new DanhSachGiangVien();
        DanhSachMonHoc ds2 = new DanhSachMonHoc();
        DanhSachLop ds3 = new DanhSachLop();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- >0){
            MonHoc x = new MonHoc(sc.next(), sc.nextLine());
            ds2.add(x);
        }
        ds3.addDSMH(ds2.getList());
        Scanner sc1 = new Scanner(new File("GIANGVIEN.in"));
        int m =Integer.parseInt(sc1.nextLine());
        while(m-- > 0) {
            GiangVien x = new GiangVien(sc1.next(), sc1.nextLine());
            ds1.add(x);
        }
        ds3.addDSGV(ds1.getList());
        Scanner sc2 = new Scanner(new File("GIOCHUAN.in"));
        int t = Integer.parseInt(sc2.nextLine());
        while(t-- > 0) {
            Lop x = new Lop(sc2.next(), sc2.next(), Double.parseDouble(sc2.next()));
            ds3.addLop(x);
        }
//        sc.nextLine();
//        String maGV = sc.nextLine();
//        ds3.show(maGV);
        ds3.show();
    }
    
}
