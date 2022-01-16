/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoadontiennuoc;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HoaDonTienNuoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            KhachHang x = new KhachHang(i + 1, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            ds.add(x);
        }
        ds.sapXep();
                ds.show();
    }
    
}
