/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lietkesinhvientheolop;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class LietKeSinhVienTheoLop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        DanhSach ds = new DanhSach();
        while(n-- > 0) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        String nganh;
        while (q-- >0) {
            nganh = sc.nextLine();
            ds.loc(nganh);
        }
    }
    
}
