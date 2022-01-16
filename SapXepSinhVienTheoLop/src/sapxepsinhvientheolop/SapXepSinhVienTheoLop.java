/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxepsinhvientheolop;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SapXepSinhVienTheoLop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        while(sc.hasNext()){
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(x);
        }
        Collections.sort(ds.getList());
        ds.show();
    }
    
}
