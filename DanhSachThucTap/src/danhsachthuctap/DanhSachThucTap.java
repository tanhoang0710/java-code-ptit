/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachthuctap;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DanhSachThucTap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++) {
            SinhVien x = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- >0) {
            String doanhNghiep = sc.nextLine();
            ds.loc(doanhNghiep);
        }
        ;
    }
    
}
