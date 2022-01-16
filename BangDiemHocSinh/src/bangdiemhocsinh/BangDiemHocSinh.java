/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangdiemhocsinh;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BangDiemHocSinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc  = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        DanhSach ds = new DanhSach();
        for(int i = 1; i<= n; i++) {
            HocSinh x = new HocSinh(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            ds.add(x);
        }
        Collections.sort(ds.list);
        ds.show();
    }
    
}
