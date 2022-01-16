/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lophocphan;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class LopHocPhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            Lop l = new Lop(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(l);
        }
        int x = Integer.parseInt(sc.nextLine());
        while(x-- > 0) {
            String s = sc.nextLine();
            ds.show(s);
        }
    }
    
}
