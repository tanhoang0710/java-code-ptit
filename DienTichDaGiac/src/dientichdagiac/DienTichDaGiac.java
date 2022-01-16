/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dientichdagiac;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DienTichDaGiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DanhSach ds;
        KetQua kq = new KetQua();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            int d = sc.nextInt();
            ds = new DanhSach();
            Point p1 = new Point(sc.nextInt(), sc.nextInt());
            d -= 1;
            ds.add(p1);
            while(d-- > 0){
                Point p = new Point(sc.nextInt(), sc.nextInt());
                ds.add(p);
            }
            ds.add(p1);
            kq.add(ds.getArea());
        }
        kq.show();
    }
    
}
