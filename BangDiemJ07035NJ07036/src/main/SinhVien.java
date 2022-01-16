/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author DELL
 */
public class SinhVien {
    private String ma, hoTen, lop, email;

    public SinhVien() {
    }

    public SinhVien(String ma, String hoTen, String lop, String email) {
        this.ma = ma;
        this.hoTen = chuanHoaTen(hoTen);
        this.lop = lop;
        this.email = email;
    }
    
    private String chuanHoaTen(String hoTen){
        hoTen = hoTen.trim().toLowerCase();
        String tmp[] = hoTen.split("\\s+");
        String res = "";
        for (String x : tmp) {
            res += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        }
        return res.trim();
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }
    
    
    
    
}
