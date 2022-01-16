/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhluong;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TinhLuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            PhongBan pb = new PhongBan(sc.next(), sc.nextLine());
            ds.addPB(pb);
        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            NhanVien x = new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            ds.addNV(x);
        }
        ds.show();
    }
    
}
