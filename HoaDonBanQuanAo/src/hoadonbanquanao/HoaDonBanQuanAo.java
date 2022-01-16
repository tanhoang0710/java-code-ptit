/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoadonbanquanao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author DELL
 */
public class HoaDonBanQuanAo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA1.in"));
        
        DanhSachSanPham ds1 = new DanhSachSanPham();
        DanhSachHoaDon ds2 = new DanhSachHoaDon();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            LoaiSanPham x = new LoaiSanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            ds1.add(x);
        }
        
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        int m = Integer.parseInt(sc2.nextLine());
        ds2.addDSSP(ds1.getList());
        while(m-- > 0){
            HoaDon x = new HoaDon(sc2.next(), sc2.nextInt());
            ds2.addHoaDon(x);
        }
        ds2.show();
    }
    
}
