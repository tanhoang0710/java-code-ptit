/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendien;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TienDien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DanhSach ds = new DanhSach();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            KhachHang x = new KhachHang(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            ds.add(x);
        }
        ds.sapXep();
        ds.show();
    }
    
}
