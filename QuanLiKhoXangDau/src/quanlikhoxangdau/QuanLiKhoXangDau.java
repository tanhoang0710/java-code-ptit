/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlikhoxangdau;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class QuanLiKhoXangDau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        while(n -- > 0){
            MatHang x = new MatHang(sc.next(), sc.nextInt());
            ds.add(x);
        }
        ds.sapXep();
        ds.show();
    }
    
}
