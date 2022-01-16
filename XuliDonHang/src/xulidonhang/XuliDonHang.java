/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xulidonhang;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class XuliDonHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            MatHang x = new MatHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            ds.add(x);
        }
        ds.sapXep();
        ds.show();
    }
    
}
