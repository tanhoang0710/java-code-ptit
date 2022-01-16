/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diemdanh;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DiemDanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        int t = Integer.parseInt(sc.nextLine());
        int t2 = t;
        while(t-- > 0){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.addSV(sv);
        }
        while(t2-- > 0){
            ThongTinDiemDanh tt = new ThongTinDiemDanh(sc.next(), sc.next());
            ds.addTT(tt);
        }
        sc.nextLine();
        String lop = sc.nextLine();
        ds.show(lop);
    }
    
}
