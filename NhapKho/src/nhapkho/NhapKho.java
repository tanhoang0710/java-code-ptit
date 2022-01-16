/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapkho;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NhapKho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++) {
            MatHang x = new MatHang(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            x.show();
        }
    }
    
}
