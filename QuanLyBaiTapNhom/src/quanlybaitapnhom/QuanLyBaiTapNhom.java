/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybaitapnhom;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class QuanLyBaiTapNhom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DanhSachNhom ds = new DanhSachNhom();
        DanhSachSinhVienSapXep dssx = new DanhSachSinhVienSapXep();
        Scanner sc = new Scanner(System.in);
        
        int n, m;
        n = Integer.parseInt(sc.next());
        m = Integer.parseInt(sc.next());
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            dssx.addNhom(new Nhom(i + 1));
        }
        while(n-- > 0) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
//            ds.getNhom(x.getSttNhom()).add(x);
            dssx.add(x);
        }
        for (int i = 0; i < m; i++) {
            String baiTapLon = sc.nextLine();
            dssx.getNhom(i + 1).setBaiTapLon(baiTapLon);
        }
        dssx.show();
//        int q = Integer.parseInt(sc.nextLine());
//        while (q-- > 0) {            
//            int stt = Integer.parseInt(sc.nextLine());
//            ds.show(stt);
//        }
    }
    
}
