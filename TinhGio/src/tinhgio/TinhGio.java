/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TinhGio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {            
            GameThu x = new GameThu(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(x);
        }
        ds.sapXep();
        ds.show();
    }
    
}
