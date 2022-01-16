/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07010;
import java.util.*;
import java.io.*;
/**
 *
 * @author DELL
 */
public class J07010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++) {
            System.out.println(new SinhVien(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(),Float.parseFloat( sc.nextLine())));
        }
    }
    
}
