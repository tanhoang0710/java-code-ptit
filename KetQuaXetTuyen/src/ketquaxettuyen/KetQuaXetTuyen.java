/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketquaxettuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class KetQuaXetTuyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Scanner sc = new Scanner(new File("XETTUYEN.in"));
            DanhSach ds = new DanhSach();
            int n = Integer.parseInt(sc.nextLine());
            for(int i = 1; i <= n; i++){
                ThiSinh x = new ThiSinh(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
                ds.add(x);
            }
//            ds.sapXep();
            ds.show();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KetQuaXetTuyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
