/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diemdanh;

/**
 *
 * @author DELL
 */
public class SinhVien {
    private String ma, ten, lop;

    public SinhVien() {
        
    }

    public SinhVien(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }
    
    public int getChuyenCan(String s) {
        int diem = 10;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(c.toString().equals("m"))
                diem -= 1;
            else if(c.toString().equals("v"))
                diem -= 2;
            else diem -= 0;
        }
        return diem > 0 ? diem : 0;
    }
    
    public void show(String s) {
        if(getChuyenCan(s) == 0)
            System.out.println(ma + " " + ten + " " + lop + " " + getChuyenCan(s) + " KDDK");
        else 
            System.out.println(ma + " " + ten + " " + lop + " " + getChuyenCan(s));
    }
}
