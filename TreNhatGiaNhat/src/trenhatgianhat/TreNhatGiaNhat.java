/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenhatgianhat;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TreNhatGiaNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1;i <= n; i++){
//            String str=sc.nextLine().trim();
//            String[] ts=str.split("\\s+");
            Nguoi x= new Nguoi(sc.next(), sc.next());
            ds.add(x);
        }
        ds.sapXep();
        ds.show();
    }
    
}
