/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoadonkhachsan;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class HoaDonKhachSan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        try {
            // TODO code application logic here
            Scanner sc = new Scanner(new File("KHACHHANG.in"));
            DanhSach ds = new DanhSach();
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                KhachHang x = new KhachHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
                ds.add(x);
            }
            ds.sapXep();
            ds.show();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HoaDonKhachSan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
