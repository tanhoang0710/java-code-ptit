/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachmonhoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author DELL
 */
public class DanhSachMonHoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        DanhSach ds = new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {            
            MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            ds.add(x);
        }
        ds.show();
    }
    
}
