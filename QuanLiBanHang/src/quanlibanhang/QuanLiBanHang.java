/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlibanhang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class QuanLiBanHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KH.in"));
        DanhSachKhachHang ds1 = new DanhSachKhachHang();
        DanhSachMatHang ds2 = new DanhSachMatHang();
        DanhSachHoaDon ds3 = new DanhSachHoaDon();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            KhachHang x = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds1.add(x);
        }
        Scanner sc1 = new Scanner(new File("MH.in"));
        int m = Integer.parseInt(sc1.nextLine());
        for (int i = 1; i <= m; i++) {
            MatHang x = new MatHang(i, sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            ds2.add(x);
        }
        Scanner sc2 = new Scanner(new File("HD.in"));
        int k = Integer.parseInt(sc2.nextLine());
        for (int i = 1; i <= k; i++) {
            HoaDon x = new HoaDon(sc2.next(), sc2.next(), sc2.nextInt());
            ds3.add(x);
        }
        ds3.addDSKH(ds1);
        ds3.addDSMH(ds2);
        ds3.show();
    }
    
}
