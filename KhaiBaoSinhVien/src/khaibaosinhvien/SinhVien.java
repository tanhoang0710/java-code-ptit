/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khaibaosinhvien;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SinhVien {
    private String maSV;
    private String name;
    private String lop;
    private String ngaySinh;
    private float gpa;
    private static Scanner sc = new Scanner(System.in);
    
    
    public SinhVien() {
        this.maSV = "B20DCCN001";
    }
    
    public void input() {
        
        this.name = sc.nextLine();
        this.lop = sc.nextLine();
        this.ngaySinh = sc.nextLine();
        this.gpa = Float.parseFloat(sc.nextLine());
    }
    
    public void showProfile() {
        Date date = new Date(ngaySinh);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.printf(maSV + " " + name + " " + lop + " " + sdf.format(date) + " %.2f", gpa);
        System.out.println();
    }
}
