/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhthunhapgiaovien;

/**
 *
 * @author DELL
 */
public class GiaoVien {
    private String maNgach, ten;
    private long luongCB; 
    private int heSo, phucap = 0;

    public GiaoVien() {
    }

    public GiaoVien(String maNgach, String ten, long luongCB) {
        this.maNgach = maNgach;
        this.ten = ten;
        this.luongCB = luongCB;
    }
    
    public void showProfile() {
        String chucVu;
        chucVu = maNgach.substring(0, 2);
        if(chucVu.equalsIgnoreCase("HT"))
            phucap = 2000000;
        else if(chucVu.equalsIgnoreCase("HP"))
            phucap = 900000;
        else if(chucVu.equalsIgnoreCase("GV"))
            phucap = 500000;
        heSo = Integer.valueOf(maNgach.substring(maNgach.length() - 2, maNgach.length()));
        long tienLuong = luongCB * heSo + phucap;
        System.out.println(maNgach + " " + ten + " " + heSo + " " + phucap + " " + tienLuong);
    }
}
